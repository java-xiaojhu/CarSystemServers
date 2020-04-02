package com.accp.springboot.vo.lyhvo;

import java.util.Date;
import java.util.List;

public class TabRoleVo {
	
	private Integer rid;

	private String rode;

	private String rname;

	private Integer rstatus;

	private Date creationtime;

	private String createby;

	private List<TabFunctionVo> tabFunctions;

	public Integer getRid() {
		return rid;
	}

	public void setRid(Integer rid) {
		this.rid = rid;
	}

	public String getRode() {
		return rode;
	}

	public void setRode(String rode) {
		this.rode = rode;
	}

	public String getRname() {
		return rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}

	public Integer getRstatus() {
		return rstatus;
	}

	public void setRstatus(Integer rstatus) {
		this.rstatus = rstatus;
	}

	public Date getCreationtime() {
		return creationtime;
	}

	public void setCreationtime(Date creationtime) {
		this.creationtime = creationtime;
	}

	public String getCreateby() {
		return createby;
	}

	public void setCreateby(String createby) {
		this.createby = createby;
	}

	public List<TabFunctionVo> getTabFunctions() {
		return tabFunctions;
	}

	public void setTabFunctions(List<TabFunctionVo> tabFunctions) {
		this.tabFunctions = tabFunctions;
	}

	
}
