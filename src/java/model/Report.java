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
public class Report {

    int id;
    String sId;
    String sName;
    String cId;
    String cName;
    int score;
    String classId;

    @Override
    public String toString() {
        return "Report{" + "id=" + id + ", sId=" + sId + ", sName=" + sName + ", cId=" + cId + ", cName=" + cName + ", score=" + score + ", classId=" + classId + '}';
    }

    public Report() {
    }

    public Report(String sId, String sName, String cId, String cName, int score, String classId) {
        this.sId = sId;
        this.sName = sName;
        this.cId = cId;
        this.cName = cName;
        this.score = score;
        this.classId = classId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

}
