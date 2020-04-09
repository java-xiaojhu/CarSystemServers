package com.accp.springboot.controller.pqwcontroller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.springboot.service.pqwservice.WorkShopVoService;
import com.accp.springboot.vo.pqwvo.WorkShopVo;
import com.alibaba.fastjson.JSON;

@RestController
@RequestMapping("/pqw/WorkShopVo")
public class WorkShopVoController {
	@Resource
	private WorkShopVoService workShopVoService;

	@GetMapping("selectList")
	public String selectList() {
		return JSON.toJSONString(workShopVoService.selectList()).replaceAll("\"teamid\"", "\"id\"")
				.replaceAll("\"teamname\"", "\"name\"");
	}

	@PostMapping("addWorkShop")
	public int addWorkShop(@RequestBody WorkShopVo workShopVo) {
		return workShopVoService.addOne(workShopVo);
	}

	@PostMapping("updateWorkShop")
	public int updateWorkShop(@RequestBody WorkShopVo workShopVo) {
		return workShopVoService.updateOne(workShopVo);
	}

	@PostMapping("deleteWorkShop/{id}")
	public int deleteWorkShop(@PathVariable int id) {
		return workShopVoService.deleteById(id);
	}
}
