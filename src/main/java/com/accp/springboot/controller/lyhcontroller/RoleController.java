package com.accp.springboot.controller.lyhcontroller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.springboot.pojo.Emp;
import com.accp.springboot.pojo.TabRole;
import com.accp.springboot.pojo.Tabfunction;
import com.accp.springboot.pojo.Tblperm;
import com.accp.springboot.service.lyhservice.RoleService;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/lyh/Roles")
public class RoleController {

	@Resource
	private RoleService roleService;
	/**
	 * 查询所有角色以及所拥有的权限
	 * 
	 * @return
	 */
	@GetMapping
	public List findTabRole() {		
		List rotree = new ArrayList();
		roleService.findTabRoles().forEach(temp -> {
			Map<String, Object> role = new HashMap<String, Object>();
			System.out.println(temp);
			role.put("role", temp);
			role.put("functions", this.getUserFunTree(temp));
			rotree.add(role);		
		});
		return rotree;
	}
	/**
	 * 查看所有的模块权限
	 * @return
	 */
	@GetMapping("getfunction")
	public List findTabfuncion() {		
		return this.getUserFunTree(roleService.findTabFunctions());
	}
	/**
	 * 修改用户权限
	 * @param tblperms
	 * @param rid
	 * @return
	 */
	@PutMapping("Role")
	public Map<String, String> addAuctionRecord(@RequestBody TabRole tabRole){	
		Map<String, String> message = new HashMap<String, String>();	
		if (roleService.modifyFpem(tabRole)>0) {		
			message.put("code", "200");		
			message.put("msg", "修改权限成功");
		} else {
			message.put("code", "300");
			message.put("msg", "修改失败");
		}
		return message;
	};
	

	public List getUserFunTree(TabRole tabRole) {
		// 从session获得用户，以便得到权限
		List tree = new ArrayList();
		Set<String> topMeunNames = new TreeSet<String>();
		if (tabRole.getTabunctions() == null) {
			System.out.println("直接退出");
			return tree;
		}
		System.out.println(tabRole.getRname()+"\t"+tabRole.getTabunctions());
		for (Tabfunction fun : tabRole.getTabunctions()) {
			if (fun.getParenttabfunction().getParentid() == 0) {
				topMeunNames.add(fun.getParenttabfunction().getFunctionname());
			}
		}
		// 遍历一级菜单名称，生成二级菜单名称
		for (String topmeun : topMeunNames) {
			Map<String, Object> topnode = new HashMap<String, Object>();
			topnode.put("id", 0);// 0:根级菜单
			topnode.put("text", topmeun);
			List topnodeChild = new ArrayList();
			List<String> erji = new ArrayList<String>();
			for (Tabfunction fun : tabRole.getTabunctions()) {
				// 匹配是否是当前菜单的子项
				if (topmeun.equals(fun.getParenttabfunction().getFunctionname())) {
					Map<String, Object> n = new HashMap<String, Object>();
					n.put("id", 1);
					n.put("fid", fun.getId());
					n.put("text", fun.getFunctionname());
					List nodeChild = new ArrayList();
					for (Tabfunction fun1 : tabRole.getTabunctions()) {
						// 匹配是否是当前菜单的子项
						if (fun.getFunctionname().equals(fun1.getParenttabfunction().getFunctionname())) {
							Map<String, Object> n1 = new HashMap<String, Object>();
							n1.put("id", fun1.getFunctioncode());
							n1.put("text", fun1.getFunctionname());
							nodeChild.add(n1);
						}
					}
					n.put("children2", nodeChild);
					System.out.println("子节点"+"\t"+nodeChild);
					topnodeChild.add(n);
				}
			}
			topnode.put("children1", topnodeChild);
			System.out.println("父子节点"+"\t"+topnodeChild);
			tree.add(topnode);
		}
		System.out.println(tabRole.getRname()+"\t"+tree);
		return tree;
	}
	

	public List getUserFunTree(List<Tabfunction> function) {
		// 从session获得用户，以便得到权限
		List tree = new ArrayList();	
		Set<String> topMeunNames = new TreeSet<String>();		
		for (Tabfunction fun : function) {			
			if (fun.getParenttabfunction() == null) {
				continue;
			}
			if (fun.getParenttabfunction().getParentid() == 0) {
				topMeunNames.add(fun.getParenttabfunction().getFunctionname());
			}
		}
		System.out.println();
		// 遍历一级菜单名称，生成二级菜单名称
		for (String topmeun : topMeunNames) {
			Map<String, Object> topnode = new HashMap<String, Object>();
			topnode.put("id", 0);// 0:根级菜单
			topnode.put("text", topmeun);
			List topnodeChild = new ArrayList();
			List<String> erji = new ArrayList<String>();
			for (Tabfunction fun : function) {
				// 匹配是否是当前菜单的子项
				if (fun.getParenttabfunction() == null) {
					continue;
				}
				if (topmeun.equals(fun.getParenttabfunction().getFunctionname())) {
					Map<String, Object> n = new HashMap<String, Object>();
					n.put("id", 1);
					n.put("fid", fun.getId());
					n.put("text", fun.getFunctionname());
					List nodeChild = new ArrayList();
					for (Tabfunction fun1 :function) {
						// 匹配是否是当前菜单的子项
						if (fun1.getParenttabfunction() == null) {
							continue;
						}
						if (fun.getFunctionname().equals(fun1.getParenttabfunction().getFunctionname())) {
							Map<String, Object> n1 = new HashMap<String, Object>();
							n1.put("id", fun1.getFunctioncode());
							n1.put("fid", fun1.getId());
							n1.put("text", fun1.getFunctionname());
							nodeChild.add(n1);
						}
					}
					n.put("children2", nodeChild);
					topnodeChild.add(n);
				}
			}
			topnode.put("children1", topnodeChild);
			tree.add(topnode);
		}
		return tree;
	}

}
