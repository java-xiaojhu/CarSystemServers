package com.accp.springboot.pojo;

public class Team {
    private Integer teamid;

    private String teamname;

    private Integer teamtime;

    private Integer departmentid;

    public Integer getTeamid() {
        return teamid;
    }

    public void setTeamid(Integer teamid) {
        this.teamid = teamid;
    }

    public String getTeamname() {
        return teamname;
    }

    public void setTeamname(String teamname) {
        this.teamname = teamname == null ? null : teamname.trim();
    }

    public Integer getTeamtime() {
        return teamtime;
    }

    public void setTeamtime(Integer teamtime) {
        this.teamtime = teamtime;
    }

    public Integer getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Integer departmentid) {
        this.departmentid = departmentid;
    }
}