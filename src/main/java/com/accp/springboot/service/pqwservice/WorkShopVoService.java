package com.accp.springboot.service.pqwservice;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.accp.springboot.dao.pqwdao.IWorkShopDAO;
import com.accp.springboot.vo.pqwvo.WorkShopVo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

@Service("WorkShopVoService")
public class WorkShopVoService {
	@Resource
	private IWorkShopDAO iWorkShowDao;

	public List<WorkShopVo> selectList() {
		return iWorkShowDao.selectList();
	}

	public WorkShopVo selectOne(int id) {
		return iWorkShowDao.selectByPrimaryKey(id);
	}

	public int deleteById(int id) {
		return iWorkShowDao.deleteByPrimaryKey(id);
	}

	public int updateOne(WorkShopVo workShopVo) {
		return iWorkShowDao.updateByPrimaryKeySelective(workShopVo);
	}

	public int addOne(WorkShopVo workShopVo) {
		QueryWrapper<WorkShopVo> qw = Wrappers.query();
		qw.eq("name", workShopVo.getName());
		if (iWorkShowDao.selectCount(qw) > 0) {
			return -1;
		}
		return iWorkShowDao.insertSelective(workShopVo);
	}
}
