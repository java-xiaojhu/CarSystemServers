package com.accp.springboot.service.lyhservice;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import com.accp.springboot.dao.lyhdao.IServiceItemDao;
import com.accp.springboot.pojo.Itemtype;
import com.accp.springboot.pojo.Serviceitems;
import com.accp.springboot.vo.lyhvo.ServiceItemsVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service("ItemService")
public class ItemService {
	@Resource
	private IServiceItemDao iServiceItemDao;
	
	/**
	 * 查询服务项目
	 * @param itemid
	 * @return
	 */
	public PageInfo<ServiceItemsVo>  findItems(Integer pageNum,Integer pageSize,Integer itemid){
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<ServiceItemsVo>(iServiceItemDao.selectItems(itemid));
	}; 
	
	/**
	 * 查询服务类型
	 * @return
	 */
	public List<Itemtype> findItemytpe(){
		return iServiceItemDao.selectItemytpe();
	};
	
	/**
	 * 查询服务类型
	 * @return
	 */
	public List<Itemtype> findItemytpes(){
		return iServiceItemDao.selectItemytpes();
	};
	/**
	 * 修改服务类型
	 */
	public Integer modifyItemtype(Itemtype itemtype) {
		return iServiceItemDao.updateItemtype(itemtype);
	};
	
	/**
	 * 删除服务类型
	 */
	
	public Integer removeItemType(Integer itemid) {
		return iServiceItemDao.deleteItemType(itemid);
	};
	
	/**
	 * 新增服务类型
	 */
	public Integer insertItemType(Itemtype itemtype) {
		return iServiceItemDao.addItemType(itemtype);
	};
	
	/**
	 * 修改服务项目
	 */
	public Integer modifyItem(Serviceitems serviceitems) {
		return iServiceItemDao.updateById(serviceitems);
	};
	
	/**
	 * 删除服务项目
	 */
	
	public Integer removeItems(Integer serviceitemid) {
		return iServiceItemDao.deleteById(serviceitemid);
	};
	
	/**
	 * 新增服务项目
	 */
	public Integer insertItems(Serviceitems serviceitems) {
		return iServiceItemDao.insert(serviceitems);
	};

}
