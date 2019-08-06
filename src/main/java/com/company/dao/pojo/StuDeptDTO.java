package com.company.dao.pojo;

import com.company.dao.pojo2.Student;

public class StuDeptDTO extends Student {
    private int did;
    private String dname;

    public StuDeptDTO(int sid, String sname,int did,String  dname) {
        super(sid, sname);
        this.did=did;
        this.dname=dname;
    }

    public StuDeptDTO() {
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

    @Override
    public String toString() {
        return "StuDeptDTO{" +
                "did=" + did +
                ", dname='" + dname + '\'' +super.toString()+
                '}';
    }
}
