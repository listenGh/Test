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
public class Admin {
    int id;
    String zId;
    String pwd;

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
