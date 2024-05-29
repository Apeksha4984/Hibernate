package com.hibernate.FirstHibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
    	  Configuration cfg = new Configuration();
          cfg.configure("hibernate.cfg.xml");
          SessionFactory factory = cfg.buildSessionFactory();
          Session session = factory.openSession();
          Transaction tx = session.beginTransaction();
          EmployeeBean emp = new EmployeeBean();
          emp.setId(121);
          emp.setName("Apeksha");
          session.save(emp);
       
    }
}
