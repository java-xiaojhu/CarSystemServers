package com.accp.springboot.dao.lyhdao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.springboot.pojo.TabRole;
import com.accp.springboot.pojo.Tabfunction;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface IRoleDao extends BaseMapper<TabRole> {
	
	List<TabRole> selectTabRoles();
	TabRole selectTabRole(@Param("rid")Integer rid);

}
