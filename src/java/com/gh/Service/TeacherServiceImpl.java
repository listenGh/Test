/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gh.Service;

import com.gh.Dao.StudentDaoImpl;
import com.gh.Dao.reportDaoImpl;
import com.gh.Dao.teacherDaoImpl;
import java.util.ArrayList;
import model.Report;
import model.Student;
import model.Teacher;
import org.hibernate.mapping.List;

/**
 *
 * @author lenovo 教师相关功能的实现
 */
public class TeacherServiceImpl {
//-------------------------------------------账户管理----------------------------------------------

    /*
    修改密码 或者完善或修改个人信息
     */
    public void updateTeacher(Teacher t) {
        teacherDaoImpl t1 = new teacherDaoImpl();
        Teacher t2 = t1.search(t.getZid(), "Teacher");
        if (t2 != null) {
            t.setId(t2.getId());
            t2 = t;
            t1.update(t2);
        }
    }

    /*
    教师登录验证
     */
    public boolean LoginTeacher(Teacher t) {
        LoginCheck l = new LoginCheck();
        return l.checkTeacher(t);
    }

//-------------------------------------------学生管理----------------------------------------------
    /*
    查看单个学生信息
     */
    public Student searchStudent(Student s) {
        StudentDaoImpl s1 = new StudentDaoImpl();
        return s1.search(s.getZid(), "Student");
    }

    /*
   查看班级学生信息
     */
    public ArrayList<Student> searchStudents(String cId) {
        StudentDaoImpl s = new StudentDaoImpl();
        return s.searchStudents(cId);
    }

//-------------------------------------成绩管理----------------------------------------------
    /*
    上传成绩
     */
    public void submitGrade(Report r) {
        reportDaoImpl rr = new reportDaoImpl();
        rr.add(r);
    }

    /*
    修改成绩单次
     */
    public void updateGrade(Report r) {
        reportDaoImpl r1 = new reportDaoImpl();
        Report r2 = r1.search(r.getsId(), "Report");
        if (r2 != null) {
            r.setId(r2.getId());
            r2 = r;
            r1.update(r2);
        }
    }

    /*
    修改成绩多次
     */
    public void updateGrades(ArrayList<Report> l) {
        for (int i = 0; i < l.size(); i++) {
            updateGrade(l.get(i));
        }
    }

    /*
    查看个人成绩--个人所有成绩
     */
    public Report getGradeOfPerson(String sId) {
        reportDaoImpl r = new reportDaoImpl();
        Report r2 = r.search(sId, "Report");
        return r2;
    }

    /*
    查看班级成绩--某门成绩
     */
    public ArrayList<Report> getGradeOfClass(String cId, String courseId) {
        reportDaoImpl r = new reportDaoImpl();
        return r.searchReports(cId, courseId);
    }
}
