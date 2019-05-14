/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gh.Dao;

import java.util.ArrayList;
import model.Admin;
import model.Student;
import org.hibernate.Query;
import org.hibernate.mapping.List;

/**
 *
 * @author lenovo
 */
public class StudentDaoImpl extends BaseDao<Student> {

    @Override
    public Student search(String id, String nameOfClass) {
        setUp();
        String hql = "from " + nameOfClass + " where zId =" + id;
        Query query = session.createQuery(hql);
        ArrayList list = (ArrayList) query.list();
        if (list != null && list.size() > 0) {
            Student t = (Student) list.get(0);
            return t;
        }
        tearDown();
        return null;
    }

    public ArrayList<Student> searchStudents(String cId) {
        setUp();
        String hql = "from " + "Student" + " where cId =" + cId;
        Query query = session.createQuery(hql);
        ArrayList list = (ArrayList) query.list();
        if (list != null && list.size() > 0) {
            return list;
        }
        tearDown();
        return null;
    }

}
