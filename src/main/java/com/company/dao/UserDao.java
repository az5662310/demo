package com.company.dao;

import com.company.dao.pojo.PageVO;
import com.company.dao.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    User findById(Integer userId);
    List<User> findAll();
    List<User> findByName(@Param("username") String username);
    int save(User user);
    int saveAutoIncrement(User user);
    int update (User newUser);
    int delete (Integer userId);
    List<User > findByPage (PageVO  pv);
    List<User> findByPage2 (@Param("begin") int begin ,@Param("size") int size);
}
