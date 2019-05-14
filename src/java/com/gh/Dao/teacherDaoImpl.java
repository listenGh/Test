/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gh.Dao;

import java.util.ArrayList;
import model.Student;
import model.Teacher;
import org.hibernate.Query;

/**
 *
 * @author lenovo
 */
public class teacherDaoImpl extends BaseDao<Teacher> {

    @Override
    public Teacher search(String id, String nameOfClass) {
        setUp();
        String hql = "from " + nameOfClass + " where zId =" + id;
        Query query = session.createQuery(hql);
        ArrayList list = (ArrayList) query.list();
        if (list != null && list.size() > 0) {
            Teacher t = (Teacher) list.get(0);
            return t;
        }
        tearDown();
        return null;
    }

}
