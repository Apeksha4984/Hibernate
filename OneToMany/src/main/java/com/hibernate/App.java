package com.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        //creating question
        Question q1 = new Question();
        q1.setQuestionId(1212);
        q1.setQuestion("what is java");

        //creating answer
        Answer a1 = new Answer();
        a1.setAnswerId(343);
        a1.setAnswer("Java is a programming language");
        a1.setQuestion(q1);

        Answer a2 = new Answer();
        a2.setAnswerId(33);
        a2.setAnswer("with the help of java we can create softwares");
        a2.setQuestion(q1);

        Answer a3 = new Answer();
        a3.setAnswerId(363);
        a3.setAnswer("Java has different type of frameworks");
        a3.setQuestion(q1);


        List<Answer> list = new ArrayList<Answer>();
        list.add(a1);
        list.add(a2);
        list.add(a3);
        q1.setAnswers(list);
        
      //session
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        //save
        session.save(q1);
       session.save(a1);
       session.save(a2);
       session.save(a3);
        tx.commit();

        session.close();
        factory.close();
    }
}