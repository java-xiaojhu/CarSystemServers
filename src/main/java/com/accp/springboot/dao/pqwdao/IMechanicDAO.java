package com.accp.springboot.dao.pqwdao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.springboot.vo.pqwvo.MechanicVo;

public interface IMechanicDAO {
	int deleteByPrimaryKey(Integer mechanicid);

	int insert(MechanicVo record);

	int insertSelective(MechanicVo record);

	MechanicVo selectByPrimaryKey(Integer mechanicid);

	int updateByPrimaryKeySelective(MechanicVo record);

	int updateByPrimaryKey(MechanicVo record);

	List<MechanicVo> pageList(@Param("teamid") int id);
}