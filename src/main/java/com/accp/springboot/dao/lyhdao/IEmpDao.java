package com.accp.springboot.dao.lyhdao;

import org.apache.ibatis.annotations.Param;

import com.accp.springboot.pojo.Emp;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface IEmpDao extends BaseMapper<Emp> {
	
	Emp userLogin(@Param("id")Integer id,@Param("pas")String pas);
	

}
