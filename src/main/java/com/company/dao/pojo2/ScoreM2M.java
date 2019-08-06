package com.company.dao.pojo2;

public class ScoreM2M {
    private int scid;
    private double score;
    private  Course course;

    @Override
    public String toString() {
        return "ScoreM2M{" +
                "scid=" + scid +
                ", score=" + score +
                ", course=" + course +
                '}';
    }

    public int getScid() {
        return scid;
    }

    public void setScid(int scid) {
        this.scid = scid;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public ScoreM2M(int scid, double score, Course course) {
        this.scid = scid;
        this.score = score;
        this.course = course;
    }

    public ScoreM2M() {
    }
}
