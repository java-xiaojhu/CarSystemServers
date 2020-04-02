package com.accp.springboot.controller.pqwcontroller;

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

	@GetMapping("pageList/{num}/{size}")
	public PageInfo<Starclass> pageList(@PathVariable int num, @PathVariable int size) {
		return starClassService.pageList(num, size);
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
