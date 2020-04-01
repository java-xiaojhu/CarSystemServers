package com.accp.springboot.service.lyhservice;

import java.util.List;

import javax.annotation.Resource;
import javax.websocket.ClientEndpoint;

import org.springframework.stereotype.Service;

import com.accp.springboot.dao.lyhdao.IRoleDao;
import com.accp.springboot.pojo.TabRole;
@Service("RoleService")
public class RoleService {
	@Resource
	private IRoleDao iRoleDao;
	
	public Integer inserRole(TabRole tabrole) {
		return iRoleDao.insert(tabrole);
	} 
	/**
	 * 查询所有角色
	 * @return
	 */
	public List<TabRole> findTabRoles(){
		return iRoleDao.selectTabRoles();
	}
	/**
	 * 查询单个角色的权限
	 * @param rid
	 * @return
	 */
	public TabRole findTabRole(Integer rid){
		return iRoleDao.selectTabRole(rid);
	}

}
