package com.accp.springboot.service.pqwservice;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.accp.springboot.dao.pqwdao.IStarclassDAO;
import com.accp.springboot.pojo.Starclass;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * 以Service结尾
 * 
 * @author 小虎
 *
 */
@Service("StarClassService")
public class StarClassService {
	@Resource
	private IStarclassDAO iStarClassDao;

	public int save(Starclass star) {
		QueryWrapper<Starclass> qw = Wrappers.query();
		qw.eq("starclassname", star.getStarclassname());
		// 等级名称相同不新增
		if (iStarClassDao.selectCount(qw) > 0) {
			return 0;
		}
		return iStarClassDao.insert(star);
	}

	public PageInfo<Starclass> pageList(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<Starclass>(iStarClassDao.selectList(null));
	}

	public int updateObj(Starclass star) {
		return iStarClassDao.updateById(star);
	}

	public int deleteObj(int id) {
		return iStarClassDao.deleteById(id);
	}
}
