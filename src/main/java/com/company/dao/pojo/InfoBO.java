package com.company.dao.pojo;

public class InfoBO {
    private DateVO queryDate;
    private Emp emp;
    private Dept dept;

    @Override
    public String toString() {
        return "InfoBO{" +
                "queryDate=" + queryDate +
                ", emp=" + emp +
                ", dept=" + dept +
                '}';
    }

    public DateVO getQueryDate() {
        return queryDate;
    }

    public void setQueryDate(DateVO queryDate) {
        this.queryDate = queryDate;
    }

    public Emp getEmp() {
        return emp;
    }

    public void setEmp(Emp emp) {
        this.emp = emp;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public InfoBO(DateVO queryDate, Emp emp, Dept dept) {
        this.queryDate = queryDate;
        this.emp = emp;
        this.dept = dept;
    }

    public InfoBO() {
    }
}
