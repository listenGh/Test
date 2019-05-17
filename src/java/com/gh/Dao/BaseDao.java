/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gh.Dao;

import java.util.ArrayList;
import org.hibernate.Query;
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
    
    public SessionFactory sessionFactory=null;
    public Configuration configuration=null;
    public Session session=null;
    public Transaction transaction=null;
    
    public void setUp() {
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
    /*
    增加对象
    */
    public void add(T t){
        setUp();
        session.save(t);
        tearDown();
        
    }
    /*
    删除对象
    */
    public void delete(T t){
        setUp();
        session.delete(t);
        tearDown();
    }
    /*
    更新对象
    */
    public void update(T t){
        setUp();
        session.update(t);
        tearDown();
    }
    /*
    得到单个对象
    */
    public T search(String id,String nameOfClass){
        setUp();
        String hql = "from "+nameOfClass+" where zid ="+id;
        Query query = session.createQuery(hql);
        ArrayList list = (ArrayList) query.list();
        if(list!=null && list.size()>0){
            T t = (T) list.get(0);
            return t;
        }
        tearDown();
       return null;
    }
}
