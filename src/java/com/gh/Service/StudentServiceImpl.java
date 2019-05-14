/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gh.Service;

import com.gh.Dao.StudentDaoImpl;
import com.gh.Dao.reportDaoImpl;
import model.Report;
import model.Student;

/**
 *
 * @author lenovo 学生相关功能的实现
 */
public class StudentServiceImpl {
    //--------------------------------------个人账户管理---------------------------------------

    /*
    登录
     */
    public boolean LoginStudent(Student admin) {
        LoginCheck l = new LoginCheck();
        return l.checkStudent(admin);
    }

    /*
    修改个人信息
     */
    public void updatePerson(Student s) {
        StudentDaoImpl ss = new StudentDaoImpl();
        Student s2 = ss.search(s.getZid(), "Student");
        if (s2 != null) {
            s.setId(s2.getId());
            s2 = s;
            ss.update(s2);
        }
    }

    /*
    修改个人密码
     */
    public void updatePwd(Student s) {
        StudentDaoImpl ss = new StudentDaoImpl();
        Student s2 = ss.search(s.getZid(), "Student");
        if (s2 != null) {
            s.setId(s2.getId());
            s2 = s;
            ss.update(s2);
        }
    }

    /*
    退出登录
     */
    public void exit() {

    }
    
    //---------------------------------在线考试和成绩管理---------------------------------
    /*
    在线考试
    */
    public void testOnline(){
        
    }
    /*
    查看成绩
    */
    public Report getReport(String sId){
        reportDaoImpl r = new reportDaoImpl();
        return r.search(sId, "Report");
    }
}
