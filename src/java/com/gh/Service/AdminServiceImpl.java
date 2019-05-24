/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gh.Service;

import com.gh.Dao.AdminDaoImpl;
import com.gh.Dao.CourseDaoImpl;
import com.gh.Dao.StudentDaoImpl;
import com.gh.Dao.classDaoImpl;
import com.gh.Dao.reportDaoImpl;
import com.gh.Dao.teacherDaoImpl;
import com.gh.Dao.testPaperDaoImpl;
import java.util.ArrayList;
import model.Admin;
import model.Clas;
import model.Course;
import model.Report;
import model.Student;
import model.Teacher;
import model.testPaper;

/**
 *
 * @author lenovo 管理员相关功能的实现
 */
public class AdminServiceImpl {

    /*
    修改密码
     */
    public boolean changeAdminPwd(String zid, String oldPwd, String newPwd) {
        boolean flag = true;
        AdminDaoImpl t = new AdminDaoImpl();
        Admin a = t.search(zid, "Admin");
        if (a != null && a.getPwd().equals(oldPwd)) {
            a.setPwd(newPwd);
            t.update(a);
        } else {
            flag = false;
        }
        return flag;
    }

    //---------------------------------------教师服务部分------------------------------------------------
    /*
    添加教师账号
     */
    public void addTeacher(Teacher t) {
        teacherDaoImpl tt = new teacherDaoImpl();
        tt.add(t);
    }

    /*
    修改教师信息
     */
    public void updateTeacher(Teacher t) {
        teacherDaoImpl tt = new teacherDaoImpl();
        Teacher t3 = tt.search(t.getZid(), "Teacher");
        if (t3 != null) {
            t.setId(t3.getId());
            t3 = t;
            tt.update(t3);
        }
        
    }

    /*
    查看教师信息
     */
    public Teacher getTeacher(Teacher ttt) {
        teacherDaoImpl t = new teacherDaoImpl();
        Teacher tt = t.search(ttt.getZid(), "Teacher");
        if (tt != null) {
            return tt;
        } else {
            return null;
        }
    }
    /*
    查看教师们信息
     */
    public ArrayList<Teacher> getTeachers() {
        teacherDaoImpl t = new teacherDaoImpl();
        return t.searchTeachers("Teacher");
    }

    /*
    删除或禁用教师账号
     */
    public void delteTeacehr(Teacher t) {
        teacherDaoImpl tt = new teacherDaoImpl();
        Teacher t3 = tt.search(t.getZid(), "Teacher");
        if (t3 != null) {
            tt.delete(t3);
        }
    }
//---------------------------------------班级服务部分------------------------------------------------

    /*
    添加班级
     */
    public void addClass(Clas t) {
        classDaoImpl c = new classDaoImpl();
        c.add(t);
    }

    /*
    修改班级信息
     */
    public void updateClass(Clas t) {
        classDaoImpl c = new classDaoImpl();
        Clas clas = c.search(t.getZid(), "Clas");
        if (clas != null) {
            t.setId(clas.getId());
            clas = t;
            c.update(clas);
        }
        
    }

    /*
    查看班级信息
     */
    public Clas searchClass(Clas t) {
        classDaoImpl c = new classDaoImpl();
        Clas clas = c.search(t.getZid(), "Clas");
        return clas;
    }
    /*
    查看班级们信息
     */
    public ArrayList<Clas> searchClasses() {
        classDaoImpl c = new classDaoImpl();
        return c.getClasses();
    }
//----------------------------------------学生服务部分------------------------------------------------

    /*
    添加学生账号
     */
    public void addStudent(Student s) {
        StudentDaoImpl ss = new StudentDaoImpl();
        ss.add(s);
    }

    /*
    修改学生信息
     */
    public void updateStudent(Student s) {
        StudentDaoImpl ss = new StudentDaoImpl();
        Student s2 = ss.search(s.getZid(), "Student");
        if (s2 != null) {
            s.setId(s2.getId());
            s2 = s;
            ss.update(s2);
        }
        
    }

    /*
    删除学生
     */
    public void deleteStudent(Student s) {
        StudentDaoImpl ss = new StudentDaoImpl();
        Student s2 = ss.search(s.getZid(), "Student");
        if (s2 != null) {
            ss.delete(s2);
        }
        
    }

    /*
    查询学生
     */
    public Student getStudent(Student s) {
        StudentDaoImpl ss = new StudentDaoImpl();
        Student student = ss.search(s.getZid(), "Student");
        return student;
    }

    /*
    查看学生成绩
     */
    public Report getReport(Student s) {
        reportDaoImpl r = new reportDaoImpl();
        Report report = r.search(s.getZid(), "Report");
        return report;
    }

    /*
    修改学生成绩
     */
    public void updateReport(Report r) {
        reportDaoImpl r2 = new reportDaoImpl();
        Report r1 = r2.search(r.getsId(), "Report");
        if (r1 != null) {
            r.setId(r1.getId());
            r1 = r;
            r2.update(r1);
        }
        
    }
//----------------------------------------课程管理服务部分------------------------------------------------

    /*
    添加课程
     */
    public void addCourse(Course c) {
        CourseDaoImpl c2 = new CourseDaoImpl();
        c2.add(c);
    }

    /*
    删除课程
     */
    public void deleteCourse(Course c) {
        CourseDaoImpl c2 = new CourseDaoImpl();
        Course c1 = c2.search(c.getZid(), "Course");
        if (c1 != null) {
            c2.delete(c1);
        }
        
    }

    /*
    修改课程
     */
    public void updateCourse(Course c) {
        CourseDaoImpl c2 = new CourseDaoImpl();
        Course c1 = c2.search(c.getZid(), "Course");
        if (c1 != null) {
            c.setId(c1.getId());
            c1 = c;
            c2.update(c1);
        }
        
    }

    /*
    查看课程
     */
    public Course searCourse(Course c) {
        CourseDaoImpl c2 = new CourseDaoImpl();
        Course course = c2.search(c.getZid(), "Course");
        return course;
    }
    
    /*
    查看所有课程
     */
    public ArrayList<Course> searCourses() {
        CourseDaoImpl c2 = new CourseDaoImpl();
        return c2.getClasses();
    }
//----------------------------------------考试列表部分管理服务部分------------------------------------------------

    /*
    添加考试
     */
    public void addTest(testPaper t) {
        testPaperDaoImpl tt = new testPaperDaoImpl();
        tt.add(t);
    }

    /*
    修改考试题目
     */
    public void UpdateOrDeleteTest(testPaper t) {
        testPaperDaoImpl t1 = new testPaperDaoImpl();
        testPaper t2 = t1.search(t.getFlag(), t.getPosition());
        if (t2 != null) {
            t.setId(t2.getId());
            t2 = t;
            t1.update(t2);
        }
    }

    /*
    删除考试题目
     */
    public void delete(testPaper t) {
        testPaperDaoImpl t1 = new testPaperDaoImpl();
        testPaper t2 = t1.search(t.getFlag(), t.getPosition());
        if (t2 != null) {
            t1.delete(t2);
        }
    }

//----------------------------------------带课情况部分管理服务部分------------------------------------------------
    /*
    带课情况管理
     */
    public void updateTakingClasses(Teacher tt) {
        teacherDaoImpl t = new teacherDaoImpl();
        Teacher t3 = t.search(tt.getZid(), "Teacher");
        if (t3 != null) {
            tt.setId(t3.getId());
            t3 = tt;
            t.update(t3);
        }
    }
    
}
