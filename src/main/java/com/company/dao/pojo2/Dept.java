package com.company.dao.pojo2;

import java.util.List;

public class Dept {
    private int did;
    private String dname;
 private List<Student2 >stus;

    @Override
    public String toString() {
        return "Dept{" +
                "did=" + did +
                ", dname='" + dname + '\'' +
                ", stus=" + stus +
                '}';
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public List<Student2> getStus() {
        return stus;
    }

    public void setStus(List<Student2> stus) {
        this.stus = stus;
    }

    public Dept(int did, String dname, List<Student2> stus) {
        this.did = did;
        this.dname = dname;
        this.stus = stus;
    }

    public Dept() {
    }
}
