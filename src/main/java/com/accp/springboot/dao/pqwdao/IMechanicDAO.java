package com.accp.springboot.dao.pqwdao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.springboot.vo.pqwvo.MechanicVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface IMechanicDAO extends BaseMapper<MechanicVo> {
	int deleteByPrimaryKey(Integer mechanicid);

	int insert(MechanicVo record);

	int insertSelective(MechanicVo record);

	MechanicVo selectByPrimaryKey(Integer mechanicid);

	int updateByPrimaryKeySelective(MechanicVo record);

	int updateByPrimaryKey(MechanicVo record);

	List<MechanicVo> pageList();

	List<MechanicVo> pageListByName( @Param("name") String name);
}