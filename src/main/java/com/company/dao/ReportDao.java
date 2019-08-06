package com.company.dao;

import com.company.dao.pojo.DateVO;
import com.company.dao.pojo.EmpDeptDTO;
import com.company.dao.pojo.InfoBO;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface ReportDao {
  List<EmpDeptDTO> findEnameDname();
  List<EmpDeptDTO> findByEnameDname(@Param("begin") String begin, @Param("end") String end);
List<InfoBO> findInfoBo(DateVO dv);

}
