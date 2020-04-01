package com.accp.springboot.dao.lyhdao;


import org.apache.ibatis.annotations.Param;

import com.accp.springboot.pojo.Emp;
import com.accp.springboot.pojo.TabRole;
import com.accp.springboot.pojo.Tabfunction;
import com.accp.springboot.vo.lyhvo.*;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface IEmpDao extends BaseMapper<Emp> {
	
	EmpVo userLogin(@Param("id")Integer id,@Param("pas")String pas);
	//查询所有的角色的权限
	TabRole selectTabRole();
	//查询所有的功能
	Tabfunction selectTabfunction();
	

}