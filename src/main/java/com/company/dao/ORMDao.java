package com.company.dao;

import com.company.dao.pojo.StuDeptDTO;
import com.company.dao.pojo2.Dept;
import com.company.dao.pojo2.Student2;
import com.company.dao.pojo2.StudentM2M;

public interface ORMDao {
    StuDeptDTO findBySid(Integer sid);
    /*一对一*/
    Student2 findBySid2(Integer sid);
    /*一对多*/
    Dept findByDid(Integer did);
    /*多对多*/
    StudentM2M findMany2Many(Integer sid);

}
