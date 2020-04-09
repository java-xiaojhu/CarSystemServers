package com.accp.springboot.pojo;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
@TableName("itemtype")
public class Itemtype {
	@TableId(value="itemid", type = IdType.AUTO)
    private Integer itemid;//

    private String itemname;

    private Integer itemfid;
    
    private Itemtype pitemtype;

    private Date itemdate;

	public Itemtype getPitemtype() {
		return pitemtype;
	}

	public void setPitemtype(Itemtype pitemtype) {
		this.pitemtype = pitemtype;
	}

	public Integer getItemid() {
        return itemid;
    }

    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname == null ? null : itemname.trim();
    }

    public Integer getItemfid() {
        return itemfid;
    }

    public void setItemfid(Integer itemfid) {
        this.itemfid = itemfid;
    }

    public Date getItemdate() {
        return itemdate;
    }

    public void setItemdate(Date itemdate) {
        this.itemdate = itemdate;
    }

	@Override
	public String toString() {
		return "Itemtype [itemid=" + itemid + ", itemname=" + itemname + ", itemfid=" + itemfid + ", pitemtype="
				+ pitemtype + ", itemdate=" + itemdate + "]";
	}
    
    
}