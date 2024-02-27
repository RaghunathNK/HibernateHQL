package com.ty.HQL;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Order order1=new Order();
        order1.setoId(101);
        order1.setoName("biryani");
        order1.setoDestination("Tumkur");
        
        Order order2=new Order();
        order2.setoId(102);
        order2.setoName("chitranna");
        order2.setoDestination("Bangalore");
        
        Configuration cfg=new Configuration().configure().addAnnotatedClass(Order.class);
        SessionFactory sf=cfg.buildSessionFactory();
        Session session=sf.openSession();
        Transaction transaction=session.beginTransaction();
        
        session.save(order1);
        session.save(order2);
        transaction.commit();
    }
}
