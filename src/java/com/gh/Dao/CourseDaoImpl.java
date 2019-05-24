/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gh.Dao;

import java.util.ArrayList;
import model.Clas;
import model.Course;
import org.hibernate.Query;

/**
 *
 * @author lenovo
 */
public class CourseDaoImpl extends BaseDao<Course> {

    public ArrayList<Course> getClasses() {
        setUp();
        String hql = "from " + "Course";
        Query query = session.createQuery(hql);
        ArrayList list = (ArrayList) query.list();
        tearDown();
        return list;
    }
}
