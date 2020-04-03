package com.accp.springboot.pojo;

import java.util.Date;

public class Tblperm {
    private Integer pid;

    private Integer rid;

    private Integer fid;

    private Date creationtime;

    private String createby;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
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
        this.createby = createby == null ? null : createby.trim();
    }

	@Override
	public String toString() {
		return "Tblperm [pid=" + pid + ", rid=" + rid + ", fid=" + fid + ", creationtime=" + creationtime
				+ ", createby=" + createby + ", getPid()=" + getPid() + ", getRid()=" + getRid() + ", getFid()="
				+ getFid() + ", getCreationtime()=" + getCreationtime() + ", getCreateby()=" + getCreateby()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
    
    
}