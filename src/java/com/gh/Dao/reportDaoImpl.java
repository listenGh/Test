/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gh.Dao;

import java.util.ArrayList;
import model.Report;
import org.hibernate.Query;

/**
 *
 * @author lenovo
 */
public class reportDaoImpl extends BaseDao<Report> {

    @Override
    public Report search(String id, String nameOfClass) {
        setUp();
        String hql = "from " + nameOfClass + " where sId =" + id;
        Query query = session.createQuery(hql);
        ArrayList list = (ArrayList) query.list();
        if (list != null && list.size() > 0) {
            Report t = (Report) list.get(0);
            return t;
        }
        tearDown();
        return null;
    }

    public ArrayList<Report> searchReports(String cId, String classId) {
        setUp();
        String hql = "from " + "Report" + " where cId =" +cId +" and classId="+classId ;
        Query query = session.createQuery(hql);
        ArrayList list = (ArrayList) query.list();
        if (list != null && list.size() > 0) {
            return list;
        }
        tearDown();
        return null;
    }

}
