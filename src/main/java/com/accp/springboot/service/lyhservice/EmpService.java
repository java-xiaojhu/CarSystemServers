package com.accp.springboot.service.lyhservice;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.accp.springboot.dao.lyhdao.*;
import com.accp.springboot.pojo.*;

@Service("EmpService")
public class EmpService {
	@Resource
	private IEmpDao iEmpDao;
	
	public Emp findUserLogin(Integer id,String pas) {		
		return iEmpDao.userLogin(id, pas);
	}
	
}
