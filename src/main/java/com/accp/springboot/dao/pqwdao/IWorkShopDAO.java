package com.accp.springboot.dao.pqwdao;

import java.util.List;

import com.accp.springboot.vo.pqwvo.WorkShopVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface IWorkShopDAO extends BaseMapper<WorkShopVo> {
	int deleteByPrimaryKey(Integer id);

	int insert(WorkShopVo record);

	int insertSelective(WorkShopVo record);

	WorkShopVo selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(WorkShopVo record);

	int updateByPrimaryKey(WorkShopVo record);

	List<WorkShopVo> selectList();
}