package com.accp.springboot.controller.pqwcontroller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.springboot.service.pqwservice.MechanicService;
import com.accp.springboot.vo.pqwvo.MechanicVo;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/pqw/Mechanic")
public class MechanicController {
	@Resource
	private MechanicService mechanicService;

	// 不带条件搜索
	@GetMapping("pageList/{num}/{size}")
	public PageInfo<MechanicVo> pageList(@PathVariable int num, @PathVariable int size) {
		return mechanicService.pageList(num, size);
	}

	// 带条件搜索
	@GetMapping("pageList/{num}/{size}/{optionName}")
	public PageInfo<MechanicVo> pageList(@PathVariable int num, @PathVariable int size, @PathVariable String optionName) {
		return mechanicService.pageList(num, size, optionName);
	}

	@PostMapping("updateMechanic")
	public int updateMechanic(@RequestBody MechanicVo mechanicVo) {
		return mechanicService.updateMechanic(mechanicVo);
	}

	@PostMapping("addMechanic")
	public int addMechanic(@RequestBody MechanicVo mechanicVo) {
		return mechanicService.addMechanic(mechanicVo);
	}

	@PostMapping("deleteMechanic/{id}")
	public int deleteMechanic(@PathVariable int id) {
		return mechanicService.deleteMechanic(id);
	}
}
