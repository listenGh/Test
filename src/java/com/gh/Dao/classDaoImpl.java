/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gh.Dao;
import java.util.ArrayList;
import model.Clas;
import org.hibernate.Query;

/**
 *
 * @author lenovo
 */
public class classDaoImpl extends BaseDao<Clas>{
     public ArrayList<Clas> getClasses() {
        setUp();
        String hql = "from " + "Clas";
        Query query = session.createQuery(hql);
        ArrayList list = (ArrayList) query.list();
        tearDown();
        return list;
    }
}
