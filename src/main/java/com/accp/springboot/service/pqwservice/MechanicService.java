package com.accp.springboot.service.pqwservice;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.accp.springboot.dao.pqwdao.IMechanicDAO;
import com.accp.springboot.vo.pqwvo.MechanicVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service("MechanicService")
public class MechanicService {
	@Resource
	private IMechanicDAO iMechanicDao;

	public PageInfo<MechanicVo> pageList(int num, int size) {
		PageHelper.startPage(num, size);
		return new PageInfo<MechanicVo>(iMechanicDao.pageList());
	}

	public PageInfo<MechanicVo> pageList(int num, int size,  String optionName) {
		PageHelper.startPage(num, size);
		return new PageInfo<MechanicVo>(iMechanicDao.pageListByName( optionName));
	}

	public int updateMechanic(MechanicVo mechanicVo) {
		return iMechanicDao.updateByPrimaryKeySelective(mechanicVo);
	}

	public int addMechanic(MechanicVo mechanicVo) {
		return iMechanicDao.insertSelective(mechanicVo);
	}

	public int deleteMechanic(int id) {
		return iMechanicDao.deleteByPrimaryKey(id);
	}
}
