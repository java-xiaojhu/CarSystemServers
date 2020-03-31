package com.accp.springboot.pojo;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("tab_function")
public class Tabfunction {
	@TableId(value="id",type = IdType.AUTO)
    private Integer id;

    private String functioncode;

    private String functionname;

    private Integer parentid;

    private Date creationtime;
    
    private Tabfunction tabfunction;
    
    public Tabfunction getTabfunction() {
		return tabfunction;
	}

	public void setTabfunction(Tabfunction tabfunction) {
		this.tabfunction = tabfunction;
	}

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
        this.functioncode = functioncode == null ? null : functioncode.trim();
    }

    public String getFunctionname() {
        return functionname;
    }

    public void setFunctionname(String functionname) {
        this.functionname = functionname == null ? null : functionname.trim();
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
}