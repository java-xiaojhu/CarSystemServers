package com.accp.springboot.dao.pqwdao;

import com.accp.springboot.pojo.Starclass;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface IStarclassDAO extends BaseMapper<Starclass> {
	int deleteByPrimaryKey(Integer starclassid);

	int insert(Starclass record);

	int insertSelective(Starclass record);

	Starclass selectByPrimaryKey(Integer starclassid);

	int updateByPrimaryKeySelective(Starclass record);

	int updateByPrimaryKey(Starclass record);
}