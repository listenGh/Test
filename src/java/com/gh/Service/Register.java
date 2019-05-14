/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gh.Service;

import com.gh.Dao.AdminDaoImpl;
import com.gh.Dao.StudentDaoImpl;
import com.gh.Dao.teacherDaoImpl;
import model.Admin;
import model.Student;
import model.Teacher;

/**
 *
 * @author lenovo
 * 
 * 注册功能的实现
 */
public class Register {
    /*
    管理员的注册
    */
    public void adminRegister(Admin t){
        AdminDaoImpl dao = new AdminDaoImpl();
        dao.add(t);
    }
    
    /*
    教师的注册
    */
    public void teacherRegister(Teacher t){
        teacherDaoImpl dao = new teacherDaoImpl();
        dao.add(t);
    }
    
    
    /*
    学生的注册
    */
    public void studentRegister(Student t){
        StudentDaoImpl dao = new StudentDaoImpl();
        dao.add(t);
    }
}
