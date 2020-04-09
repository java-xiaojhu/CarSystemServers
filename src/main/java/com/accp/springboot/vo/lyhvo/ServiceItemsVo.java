package com.accp.springboot.vo.lyhvo;

public class ServiceItemsVo {
	
	private Integer serviceitemid;// 服务项目编号

	private String servicename;// 服务名称

	private Float serviceprice;// 售价

	private Float servicepricevip;// 会员价

	private Integer itemid;// 类别编号
	
	private String itemname;

	private String servicremks;// 备注
	
	public String getItemname() {
		return itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

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
		this.servicename = servicename;
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
		this.servicremks = servicremks;
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


}
