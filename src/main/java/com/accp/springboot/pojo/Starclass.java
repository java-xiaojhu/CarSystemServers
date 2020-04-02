package com.accp.springboot.pojo;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * starclass
 * 
 * @author
 */
@TableName("Starclass")
public class Starclass implements Serializable {
	/**
	 * 星级编号
	 */
	@TableId(value = "starclassid", type = IdType.AUTO)
	private Integer starclassid;

	/**
	 * 等级名称
	 */
	private String starclassname;

	/**
	 * 提成百分比
	 */
	private Float royalty;

	private static final long serialVersionUID = 1L;

	public Integer getStarclassid() {
		return starclassid;
	}

	public void setStarclassid(Integer starclassid) {
		this.starclassid = starclassid;
	}

	public String getStarclassname() {
		return starclassname;
	}

	public void setStarclassname(String starclassname) {
		this.starclassname = starclassname;
	}

	public Float getRoyalty() {
		return royalty;
	}

	public void setRoyalty(Float royalty) {
		this.royalty = royalty;
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
		Starclass other = (Starclass) that;
		return (this.getStarclassid() == null ? other.getStarclassid() == null
				: this.getStarclassid().equals(other.getStarclassid()))
				&& (this.getStarclassname() == null ? other.getStarclassname() == null
						: this.getStarclassname().equals(other.getStarclassname()))
				&& (this.getRoyalty() == null ? other.getRoyalty() == null
						: this.getRoyalty().equals(other.getRoyalty()));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getStarclassid() == null) ? 0 : getStarclassid().hashCode());
		result = prime * result + ((getStarclassname() == null) ? 0 : getStarclassname().hashCode());
		result = prime * result + ((getRoyalty() == null) ? 0 : getRoyalty().hashCode());
		return result;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", starclassid=").append(starclassid);
		sb.append(", starclassname=").append(starclassname);
		sb.append(", royalty=").append(royalty);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}

	public Starclass() {
	}

	public Starclass(String starclassname, Float royalty) {
		this.setStarclassname(starclassname);
		this.setRoyalty(royalty);
	}
}