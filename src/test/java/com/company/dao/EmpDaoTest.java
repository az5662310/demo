package com.company.dao;

import com.company.dao.pojo.Emp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;


import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class EmpDaoTest {
@Autowired
    EmpDao empDao;
    @Test
    public void findByName() {
     List<Emp> emps =empDao.findByName("a",new BigDecimal(10000));
    for(Emp emp:emps){
        System.err.println(emp);
    }
}
    @Test
    public void update() {
        Emp emp =new Emp();
        emp.setEmpno(1);
        emp.setEname("zhaozhao");
        int result = empDao.update(emp);
        System.err.println(result);

        List<Emp> emps =empDao.findByName(null,null);
        for(Emp e:emps){
            System.err.println(e);
        }

    }

    @Test
    public void findByDeptArray() {
        List<Emp> emps =empDao.findByDeptArray(new int[]{1,2,3,4});
        for (Emp e:emps){
            System.err.println(e);
        }
    }

    @Test
    public void findByDeptList() {
        List<Emp> emps =empDao.findByDeptList(Arrays.asList(new Integer(1),new Integer(2)));
for(Emp e:emps){
    System.err.println(e);
}
    }

    @Test
    public void findByCon() {
        List<Emp> emp1 =empDao.findByCon(null,"a");
        System.err.println("*****************"+emp1.size());
        List<Emp> emp2 =empDao.findByCon(null,null);
        System.err.println("*****************"+emp2.size());
        List<Emp> emp3=empDao.findByCon(1001,"haohao");
        System.err.println(emp3);
    }
}