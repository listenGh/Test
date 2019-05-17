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
 * 学生信息
 */
public class Student {
    int id;//不会用到这个属性
    String zid;//学生Id
    String name;//名字
    String sex;//性别
    String cId;//所属班级的Id
    String pwd;//密码

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

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Student() {
    }

    public Student(String zid, String name, String sex, String cId, String pwd) {
        this.zid = zid;
        this.name = name;
        this.sex = sex;
        this.cId = cId;
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", zid=" + zid + ", name=" + name + ", sex=" + sex + ", cId=" + cId + ", pwd=" + pwd + '}';
    }

    

    
}
