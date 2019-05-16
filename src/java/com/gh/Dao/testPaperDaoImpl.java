/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gh.Dao;

import java.util.ArrayList;
import model.Student;
import model.testPaper;
import org.hibernate.Query;

/**
 *
 * @author lenovo
 */
public class testPaperDaoImpl extends BaseDao<testPaper> {

    public testPaper search(int flag, int position) {
        setUp();
        String hql = "from " + "testPaper" + " where position =" + String.valueOf(position)+" and flag ="+String.valueOf(flag);
        Query query = session.createQuery(hql);
        ArrayList list = (ArrayList) query.list();
        if (list != null && list.size() > 0) {
            testPaper t = (testPaper) list.get(0);
            return t;
        }
        tearDown();
        return null;
    }
    
    public ArrayList<testPaper> searchTestPapers(int flag) {
        setUp();
        String hql = "from " + "testPaper" + " where flag="+String.valueOf(flag);
        Query query = session.createQuery(hql);
        ArrayList list = (ArrayList) query.list();
        tearDown();
        return list;
    }
}
