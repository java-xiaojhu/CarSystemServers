package com.accp.springboot.dao.lyhdao;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.springboot.pojo.Emp;
import com.accp.springboot.pojo.TabRole;
import com.accp.springboot.pojo.Tabfunction;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface IEmpDao extends BaseMapper<Emp> {
	/**
	 * 登录
	 * @param id
	 * @param pas
	 * @return
	 */
	Emp userLogin(@Param("id")Integer id,@Param("pas")String pas);
	/**
	 * 查询所有的员工
	 * @return
	 */
	List<Emp> selectEmps();
	
	
	

}