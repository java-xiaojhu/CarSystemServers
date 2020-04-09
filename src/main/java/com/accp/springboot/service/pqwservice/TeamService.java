package com.accp.springboot.service.pqwservice;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.accp.springboot.dao.pqwdao.ITeamDAO;
import com.accp.springboot.pojo.Team;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

@Service("TeamService")
public class TeamService {
	@Resource
	private ITeamDAO iTeamDao;

	public int save(Team team) {
		QueryWrapper<Team> qw = Wrappers.query();
		qw.eq("teamname", team.getTeamname());
		if (iTeamDao.selectCount(qw) > 0) {
			return -1;
		}
		return iTeamDao.insertSelective(team);
	}

	public int update(Team team) {
		return iTeamDao.updateByPrimaryKey(team);
	}

	public int delete(int id) {
		return iTeamDao.deleteByPrimaryKey(id);
	}

	public List<Team> getList() {
		return iTeamDao.selectList(null);
	}
}
