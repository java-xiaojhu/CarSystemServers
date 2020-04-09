package com.accp.springboot.service.lyhservice;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.accp.springboot.dao.lyhdao.*;
import com.accp.springboot.pojo.*;
import com.accp.springboot.vo.lyhvo.*;

@Service("EmpService")
public class EmpService {
	@Resource
	private IEmpDao iEmpDao;
	/**
	 * 登录
	 * @param id
	 * @param pas
	 * @return
	 */
	public Emp findUserLogin(Integer id, String pas) {
		return iEmpDao.userLogin(id, pas);
	}
	/**
	 * 查询所有的员工
	 * @return
	 */
	public List<Emp> findEmps(){
		return iEmpDao.selectEmps();
	}

}