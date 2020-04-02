package com.accp.springboot.service.lyhservice;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.accp.springboot.dao.lyhdao.*;
import com.accp.springboot.pojo.*;
<<<<<<< HEAD
=======
import com.accp.springboot.vo.lyhvo.*;
>>>>>>> 6882099cf96694140348758c8ca59b9a37d6824e

@Service("EmpService")
public class EmpService {
	@Resource
	private IEmpDao iEmpDao;
<<<<<<< HEAD
	
	public Emp findUserLogin(Integer id,String pas) {		
		return iEmpDao.userLogin(id, pas);
	}
	
}
=======

	public Emp findUserLogin(Integer id, String pas) {
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
>>>>>>> 6882099cf96694140348758c8ca59b9a37d6824e
