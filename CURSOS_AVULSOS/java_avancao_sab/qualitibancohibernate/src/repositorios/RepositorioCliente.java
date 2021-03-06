package repositorios;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import br.com.qualiti.banco.TbCliente;




public class RepositorioCliente {

	public List list() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();

		String hql = " select cliente " +
				     "from TbCliente cliente ";

		List cliente = session.createQuery(hql).list();
		session.close();
		return cliente;
	}


	public List listaContas(String cpfDono) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();

		String hql = " select conta " +
				     "from TbConta conta " +
				     " where conta.tbCliente.cpf = "+cpfDono;

		List cliente = session.createQuery(hql).list();
		session.close();
		return cliente;
	}

		public TbCliente procurar(String cpf){
			SessionFactory sf = HibernateUtil.getSessionFactory();
			Session session = sf.openSession();

			TbCliente cliente = (TbCliente) session.get(TbCliente.class, cpf);
			session.close();
			return cliente;
		}

		public TbCliente inserir(TbCliente cliente){
			SessionFactory sf = HibernateUtil.getSessionFactory();
			Session session = sf.openSession();

			session.beginTransaction();

			String cpf = (String) session.save(cliente);
			cliente.setCpf(cpf);

			session.getTransaction().commit();

			session.close();

			return cliente;
		}

		public void remover(TbCliente cliente){
			SessionFactory sf = HibernateUtil.getSessionFactory();
			Session session = sf.openSession();

			session.beginTransaction();

			session.delete(cliente);

			session.getTransaction().commit();

			session.close();

		}

		public TbCliente modificar(TbCliente cliente){
			SessionFactory sf = HibernateUtil.getSessionFactory();
			Session session = sf.openSession();

			session.beginTransaction();

			session.merge(cliente);

			session.getTransaction().commit();

			session.close();
			return cliente;

		}



}
