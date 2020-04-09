package com.accp.springboot.service.pqwservice;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.accp.springboot.dao.pqwdao.IPositionDAO;
import com.accp.springboot.pojo.Position;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service("PositionService")
public class PositionService {
	@Resource
	private IPositionDAO iPositionDao;

	public int save(Position position) {
		QueryWrapper<Position> qw = Wrappers.query();
		qw.eq("positionname", position.getPositionname());
		if (iPositionDao.selectCount(qw) > 0) {
			return 0;
		}
		return iPositionDao.insert(position);
	}

	public PageInfo<Position> pageList(int num, int size) {
		QueryWrapper<Position> qw = Wrappers.query();
		qw.orderByDesc("positionid");
		PageHelper.startPage(num, size);
		return new PageInfo<Position>(iPositionDao.selectList(qw));
	}

	public PageInfo<Position> pageList(int num, int size, String optionName) {
		QueryWrapper<Position> qw = Wrappers.query();
		qw.orderByDesc("positionid");
		qw.like("positionname", optionName);
		PageHelper.startPage(num, size);
		return new PageInfo<Position>(iPositionDao.selectList(qw));
	}

	public int updateObj(Position position) {
		return iPositionDao.updateById(position);
	}

	public int deleteObj(int id) {
		return iPositionDao.deleteById(id);
	}
}
