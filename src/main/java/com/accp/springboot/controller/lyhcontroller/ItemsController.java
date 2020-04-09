package com.accp.springboot.controller.lyhcontroller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.springboot.pojo.Itemtype;
import com.accp.springboot.pojo.Serviceitems;
import com.accp.springboot.pojo.TabRole;
import com.accp.springboot.pojo.Tabfunction;
import com.accp.springboot.service.lyhservice.*;
import com.accp.springboot.util.PageBean;
import com.accp.springboot.vo.lyhvo.ServiceItemsVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/lyh/Items")
public class ItemsController {

	@Resource
	private ItemService itemService;

	/**
	 * 查询服务项目
	 * 
	 * @param itemid
	 * @return
	 */
	@GetMapping("/{pageNum}/{pageSize}/{itemid}")
	public PageInfo<ServiceItemsVo> findItems(@PathVariable Integer pageNum,@PathVariable Integer pageSize,@PathVariable Integer itemid) {
		return itemService.findItems(pageNum, pageSize, itemid);
	};

	/**
	 * 修改服务类型
	 */
	@PutMapping("/modify/itemtype")
	public Map<String, String> modifyitemtype(@RequestBody Itemtype itemtype) {
		Map<String, String> message = new HashMap<String, String>();
		if (itemService.modifyItemtype(itemtype) > 0) {
			message.put("code", "200");
			message.put("msg", "修改服务类别成功");
		} else {
			message.put("code", "300");
			message.put("msg", "修改服务类别失败");
		}
		return message;
	};

	/**
	 * 删除服务类型
	 */
	@DeleteMapping("/itemtype/{itemid}")
	public Map<String, String> removeItemType(@PathVariable Integer itemid) {
		Map<String, String> message = new HashMap<String, String>();
		if (itemService.removeItemType(itemid) > 0) {
			message.put("code", "200");
			message.put("msg", "删除服务类别成功");
		} else {
			message.put("code", "300");
			message.put("msg", "删除服务类别失败");
		}
		return message;
	};

	/**
	 * 新增服务类型
	 */
	@PostMapping("/Save/itemtype")
	public Map<String, String> insertItemType(@RequestBody Itemtype itemtype) {
		Map<String, String> message = new HashMap<String, String>();
		if (itemService.insertItemType(itemtype) > 0) {
			message.put("code", "200");
			message.put("msg", "新增服务类别成功");
		} else {
			message.put("code", "300");
			message.put("msg", "新增服务类别失败");
		}
		return message;
	};

	/**
	 * 修改服务项目
	 */
	@PutMapping("/modify/item")
	public Map<String, String> modifyItem(@RequestBody Serviceitems serviceitems) {
		Map<String, String> message = new HashMap<String, String>();
		if (itemService.modifyItem(serviceitems) > 0) {
			message.put("code", "200");
			message.put("msg", "修改服务项目成功");
		} else {
			message.put("code", "300");
			message.put("msg", "修改服务项目失败");
		}
		return message;
	};

	/**
	 * 删除服务项目
	 */
	@DeleteMapping("/item/{serviceitemid}")
	public Map<String, String> removeItems(@PathVariable Integer serviceitemid) {
		Map<String, String> message = new HashMap<String, String>();
		if (itemService.removeItems(serviceitemid) > 0) {
			message.put("code", "200");
			message.put("msg", "删除服务项目成功");
		} else {
			message.put("code", "300");
			message.put("msg", "删除服务项目失败");
		}
		return message;
	};

	/**
	 * 新增服务项目
	 */
	@PostMapping("/Save/item")
	public Map<String, String> insertItems(@RequestBody Serviceitems serviceitems) {
		Map<String, String> message = new HashMap<String, String>();
		if (itemService.insertItems(serviceitems) > 0) {
			message.put("code", "200");
			message.put("msg", "新增服务项目成功");
		} else {
			message.put("code", "300");
			message.put("msg", "新增服务项目失败");
		}
		return message;
	};
	
	@GetMapping("getItemytpes")
	public List<Itemtype> getItemytpes() {
		return itemService.findItemytpes();
	};


	/**
	 * 查询服务类型
	 * 
	 * @return
	 */
	@GetMapping("getItemytpe")
	public List getItemytpe() {
		List tree = new ArrayList();
		Set<String> topMeunNames = new TreeSet<String>();
		List<Itemtype> list = itemService.findItemytpe();
		for (Itemtype fitem : list) {
			if (fitem.getItemfid() == 0  || fitem.getItemfid()==2) {
				topMeunNames.add(fitem.getItemname());
			}
		}
		int index=0;
		// 遍历一级菜单名称，生成二级菜单名称
		for (String topmeun : topMeunNames) {
			Map<String, Object> topnode = new HashMap<String, Object>();
			for (Itemtype fun : list) {
				// 匹配是否是当前菜单的子项
				if (topmeun.equals(fun.getItemname())) {
					topnode.put("id", fun.getItemid());
					topnode.put("fid", fun.getItemfid());// 0:根级菜单
				}
			}
			topnode.put("label", topmeun);
			List topnodeChild = new ArrayList();
			List<String> erji = new ArrayList<String>();
			for (Itemtype fun : list) {
				// 匹配是否是当前菜单的子项
				if (fun.getPitemtype() == null) {
					continue;
				}
				if (topmeun.equals(fun.getPitemtype().getItemname())) {
					Map<String, Object> n = new HashMap<String, Object>();
					n.put("id",  fun.getItemid());
					n.put("fid", fun.getItemfid());
					n.put("label", fun.getItemname());
					topnodeChild.add(n);
				}
			}
			topnode.put("children", topnodeChild);
			tree.add(topnode);

		}
		return tree;
	};
}
