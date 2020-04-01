package com.accp.springboot.controller.lyhcontroller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.springboot.pojo.TabRole;
import com.accp.springboot.service.lyhservice.RoleService;

@RestController
@RequestMapping("/lyh/Roles")
public class RoleController {

	@Resource
	private RoleService roleService;
	
	@GetMapping
	public List<TabRole> findTabRole() {
		return roleService.findTabRole();		
	}
}
