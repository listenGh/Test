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
public class testPaper {

    int id;
    String zid;
    String tc;
    String sc;
    String ans;
    int score;
    int flag;

    @Override
    public String toString() {
        return "testPaper{" + "id=" + id + ", zid=" + zid + ", tc=" + tc + ", sc=" + sc + ", ans=" + ans + ", score=" + score + ", flag=" + flag + '}';
    }

    public testPaper() {
    }

    public testPaper(String zid, String tc, String sc, String ans, int score, int flag) {
        this.zid = zid;
        this.tc = tc;
        this.sc = sc;
        this.ans = ans;
        this.score = score;
        this.flag = flag;
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

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }

    public String getSc() {
        return sc;
    }

    public void setSc(String sc) {
        this.sc = sc;
    }

    public String getAns() {
        return ans;
    }

    public void setAns(String ans) {
        this.ans = ans;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

}
