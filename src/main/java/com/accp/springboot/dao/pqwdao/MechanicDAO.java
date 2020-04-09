package com.accp.springboot.dao.pqwdao;

import com.accp.springboot.pojo.Mechanic;

public interface MechanicDAO {
    int deleteByPrimaryKey(Integer mechanicid);

    int insert(Mechanic record);

    int insertSelective(Mechanic record);

    Mechanic selectByPrimaryKey(Integer mechanicid);

    int updateByPrimaryKeySelective(Mechanic record);

    int updateByPrimaryKey(Mechanic record);
}