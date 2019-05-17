/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author lenovo
 * 
 * 教师信息
 */
public class Teacher {
    int id;//不会用到这个属性
    String zid;//教师的Id
    String name;//教师名字
    String sex;//教师性别
    String pwd;//密码
    String cId;//所属班级
    String courseId;//所教课程的Id

    public Teacher() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getZid() {
        return zid;
    }

    public void setZid(String zid) {
        this.zid = zid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public Teacher(String zid, String name, String sex, String pwd, String cId, String courseId) {
        this.zid = zid;
        this.name = name;
        this.sex = sex;
        this.pwd = pwd;
        this.cId = cId;
        this.courseId = courseId;
    }

    @Override
    public String toString() {
        return "Teacher{" + "id=" + id + ", zid=" + zid + ", name=" + name + ", sex=" + sex + ", pwd=" + pwd + ", cId=" + cId + ", courseId=" + courseId + '}';
    }

    

   
    
}
