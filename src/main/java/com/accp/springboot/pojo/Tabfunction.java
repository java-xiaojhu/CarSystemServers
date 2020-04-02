package com.accp.springboot.pojo;

import java.util.Date;

<<<<<<< HEAD
=======
import com.accp.springboot.vo.lyhvo.TabFunctionVo;
>>>>>>> 6882099cf96694140348758c8ca59b9a37d6824e
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("tab_function")
public class Tabfunction {
<<<<<<< HEAD
	@TableId(value="id",type = IdType.AUTO)
    private Integer id;
=======
	@TableId(value = "id", type = IdType.AUTO)
	private Integer id;

	private String functioncode;

	private String functionname;
>>>>>>> 6882099cf96694140348758c8ca59b9a37d6824e

	private Integer parentid;

	private Date creationtime;
	
	private Tabfunction parenttabfunction;

	public Tabfunction getParenttabfunction() {
		return parenttabfunction;
	}

<<<<<<< HEAD
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
=======
	public void setParenttabfunction(Tabfunction parenttabfunction) {
		this.parenttabfunction = parenttabfunction;
	}

	public Integer getId() {
		return id;
	}
>>>>>>> 6882099cf96694140348758c8ca59b9a37d6824e

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