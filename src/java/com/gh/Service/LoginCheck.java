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
 * 登录时候的信息检查
 */
public class LoginCheck {
    /*
    管理员的登陆验证
    */
    public boolean checkAdmin(Admin admin){
        AdminDaoImpl a = new AdminDaoImpl();
        String zId = admin.getzId();
        Admin admin1 =a.search(zId,"Admin");
        //验证是否存在
        if(admin1 ==null){
            return false;
        }
        else{
            //验证密码
            if(admin.getPwd().equals(admin1.getPwd())){
                return true;
            }else{
                return false;
            }
        }
    }
    
    /*
    教师的登陆验证
    */
    public boolean checkTeacher(Teacher admin){
        teacherDaoImpl a = new teacherDaoImpl();
        String zId = admin.getZid();
        Teacher admin1 =a.search(zId,"Teacher");
        //验证是否存在
        if(admin1 ==null){
            return false;
        }
        else{
            //验证密码
            if(admin.getPwd().equals(admin1.getPwd())){
                return true;
            }else{
                return false;
            }
        }
        
    }
    
    /*
    学生的登陆验证
    */
    public boolean checkStudent(Student admin){
        StudentDaoImpl a = new StudentDaoImpl();
        String zId = admin.getZid();
        Student admin1 =a.search(zId,"Student");
        //验证是否存在
        if(admin1 ==null){
            return false;
        }
        else{
            //验证密码
            if(admin.getPwd().equals(admin1.getPwd())){
                return true;
            }else{
                return false;
            }
        }
    }
    
    public static void main(String args[]) {
           Teacher t = new Teacher();
//           System.out.println(Teacher.class);
           String s = Teacher.class.toString();
           System.out.println(s.substring(12));
 }
    
}
