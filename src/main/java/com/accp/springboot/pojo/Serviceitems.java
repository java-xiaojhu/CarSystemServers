package com.accp.springboot.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("serviceitems")
public class Serviceitems {
	@TableId(value = "serviceitemid", type = IdType.AUTO)
	private Integer serviceitemid;// 服务项目编号

	private String servicename;// 服务名称

	private Float serviceprice;// 售价

	private Float servicepricevip;// 会员价

	private Integer itemid;// 类别编号

	private String servicremks;// 备注

	public Integer getServiceitemid() {
		return serviceitemid;
	}

	public void setServiceitemid(Integer serviceitemid) {
		this.serviceitemid = serviceitemid;
	}

	public String getServicename() {
		return servicename;
	}

	public void setServicename(String servicename) {
		this.servicename = servicename == null ? null : servicename.trim();
	}


	public Float getServicepricevip() {
		return servicepricevip;
	}

	public void setServicepricevip(Float servicepricevip) {
		this.servicepricevip = servicepricevip;
	}

	public Integer getItemid() {
		return itemid;
	}

	public void setItemid(Integer itemid) {
		this.itemid = itemid;
	}

	public Float getServiceprice() {
		return serviceprice;
	}

	public void setServiceprice(Float serviceprice) {
		this.serviceprice = serviceprice;
	}

	public String getServicremks() {
		return servicremks;
	}

	public void setServicremks(String servicremks) {
		this.servicremks = servicremks == null ? null : servicremks.trim();
	}
}