package com.company.dao.pojo2;

import java.util.List;

public class StudentM2M {
    private int sid;
    private String sname;
    private List<ScoreM2M> scores;

    @Override
    public String toString() {
        return "StudentM2M{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", scores=" + scores +
                '}';
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public List<ScoreM2M> getScores() {
        return scores;
    }

    public void setScores(List<ScoreM2M> scores) {
        this.scores = scores;
    }

    public StudentM2M(int sid, String sname, List<ScoreM2M> scores) {
        this.sid = sid;
        this.sname = sname;
        this.scores = scores;
    }

    public StudentM2M() {
    }
}
