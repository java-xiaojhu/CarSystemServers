package com.accp.springboot.dao.pqwdao;

import com.accp.springboot.pojo.Position;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface IPositionDAO extends BaseMapper<Position> {
	int deleteByPrimaryKey(Integer positionid);

	int insert(Position record);

	int insertSelective(Position record);

	Position selectByPrimaryKey(Integer positionid);

	int updateByPrimaryKeySelective(Position record);

	int updateByPrimaryKey(Position record);
}