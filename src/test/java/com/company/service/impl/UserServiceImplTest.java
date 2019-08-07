package com.company.service.impl;

import com.company.dao.pojo.User;
import com.company.service.iservice.UserService;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
@Slf4j
public class UserServiceImplTest {
    @Autowired
    UserService userService;

    @Test
    public void transSal() {
    }

    @Test
    public void findById() {
    }

    @Test
    public void batchInsert() {
        User u1=new User("aaa",new BigDecimal("1111"),new Date());
        User u2=new User("bbb",new BigDecimal("2222"),new Date());
        User u3=new User("ccc",new BigDecimal("3333"),new Date());
        List<User> users = Arrays.asList(u1,u2,u3);
        String msg=userService.batchInsert(users);
        log.info("************"+msg);
        System.err.println("****************"+msg);
    }
    @Test
    public  void batchDelete(){
        List<Integer> userIds = Arrays.asList(9,10,11);
        String msg = userService.batchDelete(userIds);
        log.info("************"+msg);
        System.err.println("****************"+msg);
    }
}