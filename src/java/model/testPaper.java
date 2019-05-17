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
 * 单个题目的信息
 * 
 */
public class testPaper {

    int id;//不会用到这个属性
    String zid;//不会用到这个属性
    String tc;//单个题目的题头
    String sc;//4个选项内容
    String ans;//本题答案
    int score;//这个题目的分数
    int flag; //用于标记这是出的第几分试卷
    int position;//在一张试卷中这个题目的位置
    String remarks;//不会用到这个属性

    @Override
    public String toString() {
        return "testPaper{" + "id=" + id + ", zid=" + zid + ", tc=" + tc + ", sc=" + sc + ", ans=" + ans + ", score=" + score + ", flag=" + flag + ", position=" + position + ", remarks=" + remarks + '}';
    }

    public testPaper(String zid, String tc, String sc, String ans, int score, int flag, int position, String remarks) {
        this.zid = zid;
        this.tc = tc;
        this.sc = sc;
        this.ans = ans;
        this.score = score;
        this.flag = flag;
        this.position = position;
        this.remarks = remarks;
    }

    public testPaper() {
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

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    

    
}
