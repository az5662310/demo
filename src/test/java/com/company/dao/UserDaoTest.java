package com.company.dao;

import com.company.dao.pojo.PageVO;
import com.company.dao.pojo.User;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
import java.util.Date;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class UserDaoTest {
@Autowired
    UserDao userDao;
    @Test
    public void findById() {
        User user = userDao.findById(1);
        TestCase.assertNotNull(user);
        TestCase.assertEquals("zhao",user.getUsername());
        TestCase.assertTrue(user.getId()==1);
        System.err.println(user);
    }

    @Test
    public void findAll() {
        for (User user :userDao.findAll()){
            System.err.println(user);
        }
    }

    @Test
    public void findByName() {
        for (User user :userDao.findByName("a")){
            System.err.println(user);
        }
    }
    @Test
    public void save() {
  User user =new User(8,"zcx",new BigDecimal("9999"),new Date());
     int    result = userDao.save(user);
            System.err.println(result>0?"save success":"save error");

    }
    @Test
    public void saveAutoIncrement() {
        User user  = new User("wang",new BigDecimal("21221"),new Date());
        int    result = userDao.saveAutoIncrement(user);
        System.err.println(result>0?"save success":"save error");
        findAll();
    }

    @Test
    public void update() {
        User user  = new User(1,"zhou**",new BigDecimal("9999"),new Date());
        int    result = userDao.update(user);
        System.err.println(result>0?"update success":"update error");
        findAll();
    }
    @Test
    public void delete() {
        findAll();
      int result = userDao.delete(6);
        System.err.println(result>0?"delete success":"delete error");
        findAll();

    }
    @Test
    public void findByPage() {
        for (User user :userDao.findByPage(new PageVO(2,3))){
            System.err.println(user);
        }
    }
    @Test
    public void findByPage2() {
        for (User user :userDao.findByPage2(2,3)){
            System.err.println(user);
        }
    }
}