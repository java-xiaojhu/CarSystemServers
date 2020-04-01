package com.accp.springboot.service.lyhservice;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.accp.springboot.dao.lyhdao.*;
import com.accp.springboot.pojo.*;
import com.accp.springboot.vo.lyhvo.*;

@Service("EmpService")
public class EmpService {
	@Resource
	private IEmpDao iEmpDao;

	public EmpVo findUserLogin(Integer id, String pas) {
		return iEmpDao.userLogin(id, pas);
	}
	
	/**
	 * 查询所有的角色的权限
	 * @return
	 */
	public TabRole findTabRole() {
		return iEmpDao.selectTabRole();
	};
	/**
	 * 查询所有的功能
	 * @return
	 */
	public Tabfunction findTabfunction() {
		return iEmpDao.selectTabfunction();
	};

}