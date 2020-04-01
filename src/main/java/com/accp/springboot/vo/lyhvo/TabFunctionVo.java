package com.accp.springboot.vo.lyhvo;

import java.util.Date;

public class TabFunctionVo {

	private Integer id;

	private String functioncode;

	private String functionname;

	private Integer parentid;

	private Date creationtime;

	private TabFunctionVo parenttabfunction;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFunctioncode() {
		return functioncode;
	}

	public void setFunctioncode(String functioncode) {
		this.functioncode = functioncode;
	}

	public String getFunctionname() {
		return functionname;
	}

	public void setFunctionname(String functionname) {
		this.functionname = functionname;
	}

	public Integer getParentid() {
		return parentid;
	}

	public void setParentid(Integer parentid) {
		this.parentid = parentid;
	}

	public Date getCreationtime() {
		return creationtime;
	}

	public void setCreationtime(Date creationtime) {
		this.creationtime = creationtime;
	}

	public TabFunctionVo getParenttabfunction() {
		return parenttabfunction;
	}

	public void setParenttabfunction(TabFunctionVo parenttabfunction) {
		this.parenttabfunction = parenttabfunction;
	}

	

	
}
