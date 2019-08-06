package com.company.dao.pojo;

import java.util.Date;

public class EmpDeptDTO {
    private int empno;
    private Date hireDate;
    private String ename;
    private String dname;

    public EmpDeptDTO() {
    }

    @Override
    public String toString() {
        return "EmpDeptDTO{" +
                "empno=" + empno +
                ", hireDate=" + hireDate +
                ", ename='" + ename + '\'' +
                ", dname='" + dname + '\'' +
                '}';
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public EmpDeptDTO(int empno, Date hireDate, String ename, String dname) {
        this.empno = empno;
        this.hireDate = hireDate;
        this.ename = ename;
        this.dname = dname;
    }
}
