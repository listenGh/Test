/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gh.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
//import org.hibernate.boot.MetadataSources;
import org.hibernate.cfg.Configuration;
import org.hibernate.mapping.MetadataSource;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;



/**
 *
 * @author lenovo
 */
public class BaseDao<T> {
    
    private SessionFactory sessionFactory=null;
    private Configuration configuration=null;
    private Session session=null;
    private Transaction transaction=null;
    
    public void setUp() {
//         sessionFactory = null;
//         configuration = new Configuration().configure();
//         ServiceRegistry serviceRegistry = configuration.getStandardServiceRegistryBuilder().build();
//         sessionFactory = new MetadataSources(serviceRegistry).buildMetadata().buildSessionFactory();
//         session = sessionFactory.openSession();
//         transaction = session.beginTransaction();
         sessionFactory = null;
         configuration = new Configuration().configure();
         ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
         sessionFactory = configuration.buildSessionFactory(serviceRegistry);
         session = sessionFactory.openSession();
         transaction = session.beginTransaction();
    }
    
    public void tearDown() {
        transaction.commit();
        session.close();
        sessionFactory.close();
    }
    
    public void add(T t){
        setUp();
        session.save(t);
        tearDown();
        
    }
    public void delete(String id){
        setUp();
        
        tearDown();
    }
    public void update(T t){
        setUp();
        
        tearDown();
    }
    public void search(String id){
        setUp();
        
        tearDown();
    }
}
