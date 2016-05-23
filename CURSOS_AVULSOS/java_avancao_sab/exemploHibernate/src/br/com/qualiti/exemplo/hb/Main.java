package br.com.qualiti.exemplo.hb;

import java.sql.Date;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		
		
		RepositorioHibernate repositorioHibernate = new RepositorioHibernate();
		
		// Read
		System.out.println("******* READ *******");
		List employees = repositorioHibernate.list();
		System.out.println("Total Employees: " + employees.size());
		
		
		// Write
		System.out.println("******* WRITE *******");
		Employee empl = new Employee("Jack", "Bauer", new Date(System.currentTimeMillis()), "911");
		empl = repositorioHibernate.save(empl);
		empl = repositorioHibernate.read(empl.getId());
		System.out.printf("%d %s %s \n", empl.getId(), empl.getFirstname(), empl.getLastname());
		
		
		
		// Update
		System.out.println("******* UPDATE *******");
		Employee empl2 = repositorioHibernate.read(1l); // read employee with id 1
		System.out.println("Name Before Update:" + empl2.getFirstname());
		empl2.setFirstname("James");
		repositorioHibernate.update(empl2);	// save the updated employee details
		
		empl2 = repositorioHibernate.read(1l); // read again employee with id 1
		System.out.println("Name Aftere Update:" + empl2.getFirstname());
		
		
		// Delete
		System.out.println("******* DELETE *******");
		repositorioHibernate.delete(empl); 
		Employee empl3 = repositorioHibernate.read(empl.getId());
		System.out.println("Object:" + empl3);
	}
	
}
