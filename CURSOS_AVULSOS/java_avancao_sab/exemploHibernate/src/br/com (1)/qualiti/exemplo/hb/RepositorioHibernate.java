package br.com.qualiti.exemplo.hb;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class RepositorioHibernate {

	public List list() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();

		List employees = session.createQuery("from Employee").list();
		session.close();
		return employees;
	}
	public Employee read(Long id) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();

		Employee employee = (Employee) session.get(Employee.class, id);
		session.close();
		return employee;
	}
	public Employee save(Employee employee) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();

		session.beginTransaction();

		Long id = (Long) session.save(employee);
		employee.setId(id);
		
		session.getTransaction().commit();
		
		session.close();

		return employee;
	}

	public Employee update(Employee employee) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();

		session.beginTransaction();

		session.merge(employee);
		
		session.getTransaction().commit();
		
		session.close();
		return employee;

	}

	public void delete(Employee employee) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		
		session.beginTransaction();
		
		session.delete(employee);
		
		session.getTransaction().commit();
		
		session.close();
	}
}
