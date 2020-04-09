package com.accp.springboot.dao.lyhdao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.springboot.pojo.*;
import com.accp.springboot.vo.lyhvo.ServiceItemsVo;

public interface IServiceItemDao extends BaseMapper<Serviceitems> {
	/**
	 * 查询服务项目
	 * @param itemid
	 * @return
	 */
	List<ServiceItemsVo>  selectItems(@Param("itemid") Integer itemid); 
	
	/**
	 * 查询服务类型
	 * @param itemid
	 * @return
	 */
	List<Itemtype>  selectItemytpes(); 
	
	/**
	 * 查询服务类型
	 * @return
	 */
	List<Itemtype>  selectItemytpe();
	
	/**
	 * 修改服务类型
	 */
	Integer updateItemtype(@Param("itemtype")Itemtype itemtype);
	
	/**
	 * 删除服务类型
	 */
	
	Integer deleteItemType(@Param("itemid")Integer itemid);
	
	/**
	 * 新增服务类型
	 */
	Integer addItemType(@Param("itemtype")Itemtype itemtype);
	
	

}
