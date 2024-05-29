package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Configuration  cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        
        //session
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        
        //creating bank
        Bank b = new Bank();
        b.setBid(1231);
        b.setbName("SBI");

        Bank b1 = new Bank();
        b1.setBid(12432);
        b1.setbName("WorldBank");
        
       //creating user
        User u = new User();
        u.setUid(121);
        u.setuName("anjali");
        u.setBank(b);

        User u1 = new User();
        u1.setUid(122);
        u1.setuName("vinit");
        u1.setBank(b1);

        // Save Bank entities first
        session.save(b);
        session.save(b1);

        // Save User entities after associating them with Bank entities
        session.save(u);
        session.save(u1);

        tx.commit();
        session.close();
        factory.close();
        System.out.println("Data saved successfully");
    }

}
