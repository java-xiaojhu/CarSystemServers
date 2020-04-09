package com.accp.springboot.pojo;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * team
 * 
 * @author
 */
@TableName("Team")
public class Team implements Serializable {
	/**
	 * 班组编号
	 */
	@TableId(value = "teamid", type = IdType.AUTO)
	private Integer teamid;

	/**
	 * 班组名称
	 */
	private String teamname;

	/**
	 * 车间表ID
	 */
	private Integer workshopid;

	private static final long serialVersionUID = 1L;

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
		this.teamname = teamname;
	}

	public Integer getWorkshopid() {
		return workshopid;
	}

	public void setWorkshopid(Integer workshopid) {
		this.workshopid = workshopid;
	}

	@Override
	public boolean equals(Object that) {
		if (this == that) {
			return true;
		}
		if (that == null) {
			return false;
		}
		if (getClass() != that.getClass()) {
			return false;
		}
		Team other = (Team) that;
		return (this.getTeamid() == null ? other.getTeamid() == null : this.getTeamid().equals(other.getTeamid()))
				&& (this.getTeamname() == null ? other.getTeamname() == null
						: this.getTeamname().equals(other.getTeamname()))
				&& (this.getWorkshopid() == null ? other.getWorkshopid() == null
						: this.getWorkshopid().equals(other.getWorkshopid()));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getTeamid() == null) ? 0 : getTeamid().hashCode());
		result = prime * result + ((getTeamname() == null) ? 0 : getTeamname().hashCode());
		result = prime * result + ((getWorkshopid() == null) ? 0 : getWorkshopid().hashCode());
		return result;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", teamid=").append(teamid);
		sb.append(", teamname=").append(teamname);
		sb.append(", workshopid=").append(workshopid);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}