package com.accp.springboot.pojo;

import java.util.Date;

import com.accp.springboot.vo.lyhvo.TabRoleVo;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("emp")
public class Emp {
	@TableId(value = "empid", type = IdType.AUTO)
	private Integer empid;

	private String empname;

	private String emppas;

	private String empsex;

	private Date empbirday;

	private String empphone;

	private String emplianphone;

	private String empaddress;

	private String emptwophone;

	private String emptwoname;

	private Float empmoney;

	private Integer empstaute;

	private Date hiredate;

	private Date endusetime;

	private Date contractstart;

	private Date contractend;

	private Integer departmentid;

	private String departmentname;

	private Integer positionid;

	private String positionname;

	private Integer roleid;

	private String reasonsleaving;

	private Date leavedate;

	private TabRole tabRole;

	public String getDepartmentname() {
		return departmentname;
	}

	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}

	public String getPositionname() {
		return positionname;
	}

	public void setPositionname(String positionname) {
		this.positionname = positionname;
	}

	public TabRole getTabRole() {
		return tabRole;
	}

	public void setTabRole(TabRole tabRole) {
		this.tabRole = tabRole;
	}

	public Integer getEmpid() {
		return empid;
	}

	public void setEmpid(Integer empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname == null ? null : empname.trim();
	}

	public String getEmppas() {
		return emppas;
	}

	public void setEmppas(String emppas) {
		this.emppas = emppas == null ? null : emppas.trim();
	}

	public String getEmpsex() {
		return empsex;
	}

	public void setEmpsex(String empsex) {
		this.empsex = empsex == null ? null : empsex.trim();
	}

	public Date getEmpbirday() {
		return empbirday;
	}

	public void setEmpbirday(Date empbirday) {
		this.empbirday = empbirday;
	}

	public String getEmpphone() {
		return empphone;
	}

	public void setEmpphone(String empphone) {
		this.empphone = empphone == null ? null : empphone.trim();
	}

	public String getEmplianphone() {
		return emplianphone;
	}

	public void setEmplianphone(String emplianphone) {
		this.emplianphone = emplianphone == null ? null : emplianphone.trim();
	}

	public String getEmpaddress() {
		return empaddress;
	}

	public void setEmpaddress(String empaddress) {
		this.empaddress = empaddress == null ? null : empaddress.trim();
	}

	public String getEmptwophone() {
		return emptwophone;
	}

	public void setEmptwophone(String emptwophone) {
		this.emptwophone = emptwophone == null ? null : emptwophone.trim();
	}

	public String getEmptwoname() {
		return emptwoname;
	}

	public void setEmptwoname(String emptwoname) {
		this.emptwoname = emptwoname == null ? null : emptwoname.trim();
	}

	public Float getEmpmoney() {
		return empmoney;
	}

	public void setEmpmoney(Float empmoney) {
		this.empmoney = empmoney;
	}

	public Integer getEmpstaute() {
		return empstaute;
	}

	public void setEmpstaute(Integer empstaute) {
		this.empstaute = empstaute;
	}

	public Date getHiredate() {
		return hiredate;
	}

	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}

	public Date getEndusetime() {
		return endusetime;
	}

	public void setEndusetime(Date endusetime) {
		this.endusetime = endusetime;
	}

	public Date getContractstart() {
		return contractstart;
	}

	public void setContractstart(Date contractstart) {
		this.contractstart = contractstart;
	}

	public Date getContractend() {
		return contractend;
	}

	public void setContractend(Date contractend) {
		this.contractend = contractend;
	}

	public Integer getDepartmentid() {
		return departmentid;
	}

	public void setDepartmentid(Integer departmentid) {
		this.departmentid = departmentid;
	}

	public Integer getPositionid() {
		return positionid;
	}

	public void setPositionid(Integer positionid) {
		this.positionid = positionid;
	}

	public Integer getRoleid() {
		return roleid;
	}

	public void setRoleid(Integer roleid) {
		this.roleid = roleid;
	}

	public String getReasonsleaving() {
		return reasonsleaving;
	}

	public void setReasonsleaving(String reasonsleaving) {
		this.reasonsleaving = reasonsleaving == null ? null : reasonsleaving.trim();
	}

	public Date getLeavedate() {
		return leavedate;
	}

	public void setLeavedate(Date leavedate) {
		this.leavedate = leavedate;
	}
}