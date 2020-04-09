package com.accp.springboot.dao.pqwdao;

import com.accp.springboot.pojo.Team;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface ITeamDAO extends BaseMapper<Team> {
    int deleteByPrimaryKey(Integer teamid);

    int insert(Team record);

    int insertSelective(Team record);

    Team selectByPrimaryKey(Integer teamid);

    int updateByPrimaryKeySelective(Team record);

    int updateByPrimaryKey(Team record);
}