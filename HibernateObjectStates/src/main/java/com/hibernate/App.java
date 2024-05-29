package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		// Practical Of Hibernate Object States:
		// Transient
		// Persistent
		// Detached
		// Removed
		System.out.println("Example : ");

		SessionFactory f = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		// Creating Student Object
		Student student = new Student();
		student.setId(1414);
		student.setName("Wami");
		student.setCity("Delhi");
		// student : TransientState
		// yeh na hi database ke sath associated hai na hi session ke sath associated
		// hai

		Session s = f.openSession();
		Transaction tx = s.beginTransaction();
		s.save(student);
		// student: PersistenceState - session,database
		// student object aa gya hai persistence state me
		student.setName("Ved");
		tx.commit();
		s.close();
		f.close();
	}
}
