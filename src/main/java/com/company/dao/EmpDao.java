package com.company.dao;

import com.company.dao.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

public interface EmpDao {
    List<Emp> findByName(@Param("username") String username, @Param("sal")BigDecimal sal);
    int update(Emp emp);
    List<Emp> findByDeptArray(int[] deptnos);
    List<Emp> findByDeptList(List<Integer> deptnos);
  List<Emp>  findByCon(@Param("empno") Integer empno,@Param("ename") String ename);
}
