package com.company.dao;

import com.company.dao.pojo.DateVO;
import com.company.dao.pojo.EmpDeptDTO;
import com.company.dao.pojo.InfoBO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class ReportDaoTest {
@Autowired
    ReportDao reportDao;
    @Test
    public void findEnameDname() {
        List<EmpDeptDTO> edds =reportDao.findEnameDname();
        for (EmpDeptDTO edd:edds){
            System.err.println(edd);
        }
    }
    @Test
    public void findByEnameDname() {
        List<EmpDeptDTO> edds =reportDao.findByEnameDname("2018-03-01","2019-01-01");
        for (EmpDeptDTO edd:edds){
            System.err.println(edd);
        }
    }


    @Test
    public void findInfoBo() {
        DateVO dv =new DateVO("2017-01-01","2019-01-01");
        List<InfoBO>infos =reportDao.findInfoBo(dv);
        for(InfoBO info:infos){
            System.err.println(info.getDept());
            System.err.println(info.getEmp());
            System.err.println("********");
        }
    }
}