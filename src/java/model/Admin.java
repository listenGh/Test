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
 * 管理员信息
 */
public class Admin {

    int id;     //不会用到这个属性
    String zId; //Admin的Id
    String pwd; //密码

    public String getzId() {
        return zId;
    }

    public void setzId(String zId) {
        this.zId = zId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Admin() {
    }

    @Override
    public String toString() {
        return "Admin{" + "id=" + id + ", pwd=" + pwd + ", zId=" + zId + '}';
    }

    public Admin(String zId, String pwd) {
        this.pwd = pwd;
        this.zId = zId;
    }

}
