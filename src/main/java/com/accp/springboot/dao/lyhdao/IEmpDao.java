package com.accp.springboot.dao.lyhdao;

<<<<<<< HEAD
import org.apache.ibatis.annotations.Param;

import com.accp.springboot.pojo.Emp;
=======

import org.apache.ibatis.annotations.Param;

import com.accp.springboot.pojo.Emp;
import com.accp.springboot.pojo.TabRole;
import com.accp.springboot.pojo.Tabfunction;
>>>>>>> 6882099cf96694140348758c8ca59b9a37d6824e
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface IEmpDao extends BaseMapper<Emp> {
	
	Emp userLogin(@Param("id")Integer id,@Param("pas")String pas);
<<<<<<< HEAD
	

}
=======
	//查询所有的角色的权限
	TabRole selectTabRole();
	//查询所有的功能
	Tabfunction selectTabfunction();
	

}
>>>>>>> 6882099cf96694140348758c8ca59b9a37d6824e
