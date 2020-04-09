package com.accp.springboot.service.lyhservice;

import java.util.List;

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
	/**
	 * 登录
	 * @param id
	 * @param pas
	 * @return
	 */
=======
<<<<<<< HEAD
	
	public Emp findUserLogin(Integer id,String pas) {		
		return iEmpDao.userLogin(id, pas);
	}
	
}
=======

>>>>>>> branch 'master' of https://github.com/java-xiaojhu/CarSystemServers.git
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
>>>>>>> 6882099cf96694140348758c8ca59b9a37d6824e
