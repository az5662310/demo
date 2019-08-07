package com.company.dao.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;

    private String username;

    private BigDecimal sal;

    private Date birthday;

    public User(String username, BigDecimal sal, Date birthday) {
        this.username = username;
        this.sal = sal;
        this.birthday = birthday;
    }
}