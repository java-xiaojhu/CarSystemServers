package com.accp.springboot.controller.pqwcontroller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.springboot.pojo.Starclass;
import com.accp.springboot.service.pqwservice.StarClassService;
import com.github.pagehelper.PageInfo;

/**
 * 以 Controller结尾
 * 
 * @author 小虎
 *
 */
@RestController
@RequestMapping("/pqw/Starclass")
public class StarclassController {
	@Resource
	private StarClassService starClassService;

	// 不带搜索
	@GetMapping("pageList/{num}/{size}")
	public PageInfo<Starclass> pageList(@PathVariable int num, @PathVariable int size) {
		return starClassService.pageList(num, size);
	}

	// 带搜索
	@GetMapping("pageList/{num}/{size}/{optionName}")
	public PageInfo<Starclass> pageList(@PathVariable int num, @PathVariable int size,
			@PathVariable String optionName) {
		return starClassService.pageList(num, size, optionName);
	}

	@PostMapping("getList")
	public List<Starclass> getList() {
		return starClassService.getList();
	}

	@PostMapping("addStarClass")
	public int addStarClass(@RequestBody Starclass star) {
		return starClassService.save(star);
	}

	@PostMapping("updateStarClass")
	public int updateStarClass(@RequestBody Starclass star) {
		return starClassService.updateObj(star);
	}

	@PostMapping("deleteStarClass")
	public int deleteStarClass(@RequestBody Starclass star) {
		return starClassService.deleteObj(star.getStarclassid());
	}
}
