package com.company.dao;

import com.company.dao.pojo.User;

import java.util.List;

public interface UserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);


    int batchInsert(List<User> users);

    int batchDelete(List<Integer> userIds);
}