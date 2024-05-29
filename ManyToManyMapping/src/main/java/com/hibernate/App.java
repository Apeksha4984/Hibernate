package com.hibernate;

import java.util.ArrayList;
import java.util.List;



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
        Employee e= new Employee();
        Employee e1 = new Employee();
        e.setEid(12);
        e.setEname("Aman");
        e1.setEid(13);
        e1.setEname("Ashu");
        Project p = new Project();
        Project p1 =  new Project();
        p.setPid(9900);
        p.setPname("SplitBill Management");
        p1.setPid(9191);
        p1.setPname("Stock Management");
        
        List<Employee>list1=new ArrayList<>();
        List<Project>list2=new ArrayList<>();
        list1.add(e);
        list1.add(e1);
        
        list2.add(p);
        list2.add(p1);
        
        e.setProject(list2);
        p1.setEmp(list1);
        
        Session session =factory.openSession();
        Transaction tx=session.beginTransaction();
        
        session.save(e);
        session.save(e1);
        session.save(p);
        session.save(p1);
        tx.commit();
        session.close();
        factory.close();
    }
}
