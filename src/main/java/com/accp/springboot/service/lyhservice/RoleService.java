package com.accp.springboot.service.lyhservice;

import java.util.List;

import javax.annotation.Resource;
import javax.websocket.ClientEndpoint;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.springboot.dao.lyhdao.IRoleDao;
import com.accp.springboot.pojo.TabRole;
import com.accp.springboot.pojo.Tabfunction;
import com.accp.springboot.pojo.Tblperm;
@Service("RoleService")
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
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
	/**
	 * 查询所有模块功能
	 * @return
	 */
	public List<Tabfunction> findTabFunctions(){
		return iRoleDao.selectTabFunctions();
	}
	/**
	 * 修改用户权限
	 * @param tblperms
	 * @param rid
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public Integer modifyFpem(TabRole tabRole) {
		Integer num=-1;
		Integer num1=iRoleDao.deleteFpems(tabRole.getRid());
		System.out.println("删除结果"+num1);
		if(num1>=0) {
			System.out.println("新增开始");
			Integer num2=iRoleDao.insertFpems(tabRole);
			if(num2>=0) {
				num=1;
			}
		}else{
			throw new RuntimeException("删除异常");
		}		
		return num;		
	}
	/**
	 * 修改角色
	 * @param tabRole
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public Integer modifyRole(TabRole tabRole) {		
		return iRoleDao.updateTabRole(tabRole);		
	}
	/**
	 * 新增角色
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public Integer InsertRole(TabRole tabRole) {		
		return iRoleDao.insertTabRole(tabRole);		
	}
	/**
	 * 检查角色
	 * @param rode
	 * @param rname
	 * @return
	 */
	public TabRole findRole(String rode ,String rname) {
		
		return iRoleDao.selectRole(rode, rname);
	}
	

}
