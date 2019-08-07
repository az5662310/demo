package com.company.service.iservice;

import com.company.dao.pojo.User;

import java.math.BigDecimal;
import java.util.List;

public interface UserService {

    String transSal(User src, User target, BigDecimal money);
    User findById(Integer id);

    String batchInsert(List<User> users);
    String batchDelete(List<Integer> userIds);
}
