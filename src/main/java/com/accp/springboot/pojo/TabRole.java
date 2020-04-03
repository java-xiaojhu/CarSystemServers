package com.accp.springboot.pojo;

import java.util.Date;
import java.util.List;

import com.accp.springboot.vo.lyhvo.TabFunctionVo;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("tab_role")
public class TabRole {
	@TableId(value = "rid", type = IdType.AUTO)
	private Integer rid;

	private String rode;

	private String rname;

	private Integer rstatus;

	private Date creationtime;

	private String createby;

	private List<Tabfunction> tabfunctions;
	
	private List<Tblperm> tblperms;

	public List<Tblperm> getTblperms() {
		return tblperms;
	}

	public void setTblperms(List<Tblperm> tblperms) {
		this.tblperms = tblperms;
	}

	public List<Tabfunction> getTabunctions() {
		return tabfunctions;
	}

	public void setTabunctions(List<Tabfunction> tabfunctions) {
		this.tabfunctions = tabfunctions;
	}

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

	@Override
	public String toString() {
		return "TabRole [rid=" + rid + ", rode=" + rode + ", rname=" + rname + ", rstatus=" + rstatus
				+ ", creationtime=" + creationtime + ", createby=" + createby + ", tabfunctions=" + tabfunctions + "]";
	}

	

}
