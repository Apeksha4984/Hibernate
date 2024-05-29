package com.hibernate;

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
      
      SessionFactory factory=cfg.buildSessionFactory();
     
      
      Employee emp = new Employee();
      emp.setEmpName("arushi");
      emp.setDesign("manager");
      
      Bank bank = new Bank();
      bank.setBid(121);
      bank.setbName("BOM");
      emp.setBank(bank);
      
      Employee emp1 = new Employee();
      emp1.setEmpName("aman");
      emp1.setDesign("asdfg");
      
      Bank bank1 = new Bank();
      bank1.setBid(121);
      bank1.setbName("WorldBank");
      emp1.setBank(bank1);
      
      Session session = factory.openSession();
      Transaction tx = session.beginTransaction();
      
      session.save(emp);
      session.save(emp1);
      tx.commit();
      session.close();
      factory.close();
      
      
      
      
      
      
    }
}
