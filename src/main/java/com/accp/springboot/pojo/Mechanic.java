package com.accp.springboot.pojo;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * mechanic
 * 
 * @author
 */
@TableName("Mechanic")
public class Mechanic implements Serializable {
	/**
	 * 技工编号
	 */
	@TableId(value = "mechanicid", type = IdType.AUTO)
	private Integer mechanicid;

	/**
	 * 技工名称
	 */
	private String mechanicname;

	/**
	 * 性别
	 */
	private String mechanicsex;

	/**
	 * 手机电话
	 */
	private String mechanicphone;

	/**
	 * 联系电话
	 */
	private String contactphone;

	/**
	 * 紧急联系电话
	 */
	private String urgentphone;

	/**
	 * 是否为组长 1表示是，0表示不是
	 */
	private Integer groupleader;

	/**
	 * 班组编号
	 */
	private Integer teamid;

	/**
	 * 星级编号
	 */
	private Integer starclassid;

	/**
	 * 备注
	 */
	private String remarks;

	private static final long serialVersionUID = 1L;

	public Integer getMechanicid() {
		return mechanicid;
	}

	public void setMechanicid(Integer mechanicid) {
		this.mechanicid = mechanicid;
	}

	public String getMechanicname() {
		return mechanicname;
	}

	public void setMechanicname(String mechanicname) {
		this.mechanicname = mechanicname;
	}

	public String getMechanicsex() {
		return mechanicsex;
	}

	public void setMechanicsex(String mechanicsex) {
		this.mechanicsex = mechanicsex;
	}

	public String getMechanicphone() {
		return mechanicphone;
	}

	public void setMechanicphone(String mechanicphone) {
		this.mechanicphone = mechanicphone;
	}

	public String getContactphone() {
		return contactphone;
	}

	public void setContactphone(String contactphone) {
		this.contactphone = contactphone;
	}

	public String getUrgentphone() {
		return urgentphone;
	}

	public void setUrgentphone(String urgentphone) {
		this.urgentphone = urgentphone;
	}

	public Integer getGroupleader() {
		return groupleader;
	}

	public void setGroupleader(Integer groupleader) {
		this.groupleader = groupleader;
	}

	public Integer getTeamid() {
		return teamid;
	}

	public void setTeamid(Integer teamid) {
		this.teamid = teamid;
	}

	public Integer getStarclassid() {
		return starclassid;
	}

	public void setStarclassid(Integer starclassid) {
		this.starclassid = starclassid;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
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
		Mechanic other = (Mechanic) that;
		return (this.getMechanicid() == null ? other.getMechanicid() == null
				: this.getMechanicid().equals(other.getMechanicid()))
				&& (this.getMechanicname() == null ? other.getMechanicname() == null
						: this.getMechanicname().equals(other.getMechanicname()))
				&& (this.getMechanicsex() == null ? other.getMechanicsex() == null
						: this.getMechanicsex().equals(other.getMechanicsex()))
				&& (this.getMechanicphone() == null ? other.getMechanicphone() == null
						: this.getMechanicphone().equals(other.getMechanicphone()))
				&& (this.getContactphone() == null ? other.getContactphone() == null
						: this.getContactphone().equals(other.getContactphone()))
				&& (this.getUrgentphone() == null ? other.getUrgentphone() == null
						: this.getUrgentphone().equals(other.getUrgentphone()))
				&& (this.getGroupleader() == null ? other.getGroupleader() == null
						: this.getGroupleader().equals(other.getGroupleader()))
				&& (this.getTeamid() == null ? other.getTeamid() == null : this.getTeamid().equals(other.getTeamid()))
				&& (this.getStarclassid() == null ? other.getStarclassid() == null
						: this.getStarclassid().equals(other.getStarclassid()))
				&& (this.getRemarks() == null ? other.getRemarks() == null
						: this.getRemarks().equals(other.getRemarks()));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getMechanicid() == null) ? 0 : getMechanicid().hashCode());
		result = prime * result + ((getMechanicname() == null) ? 0 : getMechanicname().hashCode());
		result = prime * result + ((getMechanicsex() == null) ? 0 : getMechanicsex().hashCode());
		result = prime * result + ((getMechanicphone() == null) ? 0 : getMechanicphone().hashCode());
		result = prime * result + ((getContactphone() == null) ? 0 : getContactphone().hashCode());
		result = prime * result + ((getUrgentphone() == null) ? 0 : getUrgentphone().hashCode());
		result = prime * result + ((getGroupleader() == null) ? 0 : getGroupleader().hashCode());
		result = prime * result + ((getTeamid() == null) ? 0 : getTeamid().hashCode());
		result = prime * result + ((getStarclassid() == null) ? 0 : getStarclassid().hashCode());
		result = prime * result + ((getRemarks() == null) ? 0 : getRemarks().hashCode());
		return result;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", mechanicid=").append(mechanicid);
		sb.append(", mechanicname=").append(mechanicname);
		sb.append(", mechanicsex=").append(mechanicsex);
		sb.append(", mechanicphone=").append(mechanicphone);
		sb.append(", contactphone=").append(contactphone);
		sb.append(", urgentphone=").append(urgentphone);
		sb.append(", groupleader=").append(groupleader);
		sb.append(", teamid=").append(teamid);
		sb.append(", starclassid=").append(starclassid);
		sb.append(", remarks=").append(remarks);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}