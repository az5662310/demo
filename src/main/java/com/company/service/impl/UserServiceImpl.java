package com.company.service.impl;

import com.company.dao.UserDao;
import com.company.dao.pojo.User;
import com.company.service.iservice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Service("userService")
public class UserServiceImpl  implements UserService {
    @Autowired
    UserDao userDao;
    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRES_NEW )
    public String transSal(User src, User target, BigDecimal money) {
 src.setSal(src.getSal().subtract(money));
   int result1= userDao.updateByPrimaryKeySelective(src);
       //System.out.println(100/0);
 target.setSal(target.getSal().add(money));
int result2= userDao.updateByPrimaryKeySelective(target);
 return  result1>0&&result2>0?"sucess":"error";
    }

    @Override
    public User findById(Integer id) {
        return  userDao.selectByPrimaryKey(id);
    }


    @Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRES_NEW)
    @Override
    public String batchInsert(List<User> users) {
           int result =userDao.batchInsert(users);
        return result>0?"success":"error";
    }
    @Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED)
    @Override
    public String batchDelete(List<Integer> userIds) {
        int result =userDao.batchDelete(userIds);
        return result>0?"success":"error" ;

    }
}
