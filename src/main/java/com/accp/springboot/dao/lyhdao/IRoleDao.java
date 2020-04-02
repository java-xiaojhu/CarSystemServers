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
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface IRoleDao extends BaseMapper<TabRole> {
	
	List<TabRole> selectTabRoles();
	TabRole selectTabRole(@Param("rid")Integer rid);
>>>>>>> 6882099cf96694140348758c8ca59b9a37d6824e

}
