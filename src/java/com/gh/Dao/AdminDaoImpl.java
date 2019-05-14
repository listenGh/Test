/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gh.Dao;

import java.util.ArrayList;
import model.Admin;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 *
 * @author lenovo
 */
public class AdminDaoImpl extends BaseDao<Admin>{

    @Override
    public Admin search(String id, String nameOfClass) {
        setUp();
        String hql = "from "+nameOfClass+" where zId ="+id;
        Query query = session.createQuery(hql);
        ArrayList list = (ArrayList) query.list();
        if(list!=null && list.size()>0){
            Admin t = (Admin) list.get(0);
            return t;
        }
        tearDown();
       return null;
    }
    
}
