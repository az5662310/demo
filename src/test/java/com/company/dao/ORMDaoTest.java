package com.company.dao;

import com.company.dao.pojo.StuDeptDTO;
import com.company.dao.pojo2.Dept;
import com.company.dao.pojo2.ScoreM2M;
import com.company.dao.pojo2.Student2;
import com.company.dao.pojo2.StudentM2M;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class ORMDaoTest {
@Autowired
    ORMDao ormDao;
    @Test
    public void findBySid() {
        System.err.println(ormDao);
        StuDeptDTO sdd =ormDao.findBySid(1);
        System.err.println(sdd);
    }

    @Test
    public void findBySid2() {
        System.err.println(ormDao);
        Student2 stu =ormDao.findBySid2(1);
        System.err.println(stu.getSid()+":"+stu.getSname());
        System.err.println(stu.getDept());
    }

    @Test
    public void findByDid() {
     Dept dept = ormDao.findByDid(1);
        System.err.println(dept.getDname()+":");
        for(Student2 stu:dept.getStus()){
            System.err.println(stu.getSid()+"-->"+stu.getSname());
        }
    }
    @Test
    public void findMany2Many() {
        StudentM2M stu = ormDao.findMany2Many(1);
        System.err.println(stu.getSname()+"'s score:");
        for (ScoreM2M score:stu.getScores()){
            System.err.println(score.getCourse().getCname()+":"+score.getScore());
        }

    }
}