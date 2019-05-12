/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author lenovo
 */
public class Teacher {
    int id;
    String zid;
    String name;
    String sex;
    String pwd;
    String cId;

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

    public Teacher() {
    }

    public Teacher(String zid, String name, String sex, String pwd, String cId) {
        this.zid = zid;
        this.name = name;
        this.sex = sex;
        this.pwd = pwd;
        this.cId = cId;
    }

    @Override
    public String toString() {
        return "Teacher{" + "id=" + id + ", zid=" + zid + ", name=" + name + ", sex=" + sex + ", pwd=" + pwd + ", cId=" + cId + '}';
    }

   
    
}
