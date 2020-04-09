package com.accp.springboot.dao.lyhdao;

<<<<<<< HEAD
import org.apache.ibatis.annotations.Param;

import com.accp.springboot.pojo.Emp;
=======

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.springboot.pojo.Emp;
import com.accp.springboot.pojo.TabRole;
import com.accp.springboot.pojo.Tabfunction;
>>>>>>> 6882099cf96694140348758c8ca59b9a37d6824e
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface IEmpDao extends BaseMapper<Emp> {
	/**
	 * 登录
	 * @param id
	 * @param pas
	 * @return
	 */
	Emp userLogin(@Param("id")Integer id,@Param("pas")String pas);
<<<<<<< HEAD
	/**
	 * 查询所有的员工
	 * @return
	 */
	List<Emp> selectEmps();
	
	
=======
<<<<<<< HEAD
	

}
=======
	//查询所有的角色的权限
	TabRole selectTabRole();
	//查询所有的功能
	Tabfunction selectTabfunction();
>>>>>>> branch 'master' of https://github.com/java-xiaojhu/CarSystemServers.git
	

}
>>>>>>> 6882099cf96694140348758c8ca59b9a37d6824e
