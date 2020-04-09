package com.accp.springboot.controller.pqwcontroller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.springboot.pojo.Position;
import com.accp.springboot.service.pqwservice.PositionService;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/pqw/Position")
public class PositionController {
	@Resource
	private PositionService positionService;

	// 不带搜索
	@GetMapping("pageList/{num}/{size}")
	public PageInfo<Position> pageList(@PathVariable int num, @PathVariable int size) {
		return positionService.pageList(num, size);
	}

	// 带搜索
	@GetMapping("pageList/{num}/{size}/{optionName}")
	public PageInfo<Position> pageList(@PathVariable int num, @PathVariable int size, @PathVariable String optionName) {
		return positionService.pageList(num, size, optionName);
	}

	@PostMapping("addPosition")
	public int addPosition(@RequestBody Position position) {
		return positionService.save(position);
	}

	@PostMapping("updatePosition")
	public int updatePosition(@RequestBody Position position) {
		return positionService.updateObj(position);
	}

	@PostMapping("deletePosition")
	public int deletePosition(@RequestBody Position position) {
		return positionService.deleteObj(position.getPositionid());
	}
}
