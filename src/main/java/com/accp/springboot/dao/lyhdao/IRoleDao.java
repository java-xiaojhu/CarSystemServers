package com.accp.springboot.dao.lyhdao;

import java.util.List;

<<<<<<< HEAD
import org.springframework.stereotype.Service;

import com.accp.springboot.vo.lyhvo.MenuVo;

public interface IRoleDao {
	
	List<MenuVo> authorityMenu(); 
=======
import org.apache.ibatis.annotations.Param;

import com.accp.springboot.pojo.TabRole;
import com.accp.springboot.pojo.Tabfunction;
import com.accp.springboot.pojo.Tblperm;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface IRoleDao extends BaseMapper<TabRole> {
	/**
	 * 查看所有的角色以及权限
	 * @return
	 */
	List<TabRole> selectTabRoles();
	/**
	 * 查询单个角色权限
	 * @param rid
	 * @return
	 */
	TabRole selectTabRole(@Param("rid")Integer rid);
<<<<<<< HEAD
	/**
	 * 查询所有的功能模块
	 * @return
	 */
	List<Tabfunction> selectTabFunctions();
	
	/**
	 * 新增角色权限表
	 */
	
	Integer insertFpems(@Param("tabRole")TabRole tabRole);
	
	/**
	 * 删除角色权限
	 */
	Integer deleteFpems(@Param("rid") Integer rid);
	
	/**
	 * 新增角色
	 */
	Integer insertTabRole(@Param("role")TabRole role);
	
	/**
	 * 修改角色
	 */
	Integer updateTabRole(@Param("role")TabRole role);
	
	/**
	 *检查角色
	 */	
	TabRole selectRole(@Param("rode") String rode, @Param("rname") String rname);
	
=======
>>>>>>> 6882099cf96694140348758c8ca59b9a37d6824e

>>>>>>> branch 'master' of https://github.com/java-xiaojhu/CarSystemServers.git
}
