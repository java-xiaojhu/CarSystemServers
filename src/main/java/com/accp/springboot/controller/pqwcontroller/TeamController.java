package com.accp.springboot.controller.pqwcontroller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.springboot.pojo.Team;
import com.accp.springboot.service.pqwservice.TeamService;
import com.alibaba.fastjson.JSON;

@RestController
@RequestMapping("/pqw/Team")
public class TeamController {
	@Resource
	private TeamService teamService;

	@PostMapping("addTeam/{jsonStr}")
	public int addTeam(@PathVariable String jsonStr) {
		return teamService.save(JSON.parseObject(
				jsonStr.replaceAll("\"id\"", "\"teamid\"").replaceAll("\"name\"", "\"teamname\""), Team.class));
	}

	@PostMapping("updateTeam/{jsonStr}")
	public int updateTeam(@PathVariable String jsonStr) {
		return teamService.update(JSON.parseObject(
				jsonStr.replaceAll("\"id\"", "\"teamid\"").replaceAll("\"name\"", "\"teamname\""), Team.class));
	}

	@PostMapping("deleteTeam/{id}")
	public int deleteTeam(@PathVariable int id) {
		return teamService.delete(id);
	}

	@PostMapping("getList")
	public List<Team> getList() {
		return teamService.getList();
	}
}
