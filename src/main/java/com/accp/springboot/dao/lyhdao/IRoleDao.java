package com.accp.springboot.dao.lyhdao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.accp.springboot.vo.lyhvo.MenuVo;

public interface IRoleDao {
	
	List<MenuVo> authorityMenu(); 

}
