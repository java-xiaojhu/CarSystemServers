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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.springboot.pojo.Emp;
import com.accp.springboot.pojo.TabRole;
import com.accp.springboot.pojo.Tabfunction;
import com.accp.springboot.service.lyhservice.RoleService;

@RestController
@RequestMapping("/lyh/Roles")
public class RoleController {

	@Resource
	private RoleService roleService;
	
	@GetMapping
	public List findTabRole() {
		List rotree = new ArrayList();
		roleService.findTabRoles().forEach(temp ->{
			rotree.add(this.getUserFunTree(temp));
		});;
		return rotree;		
	}	
	public List getUserFunTree(TabRole tabRole) {
		// 从session获得用户，以便得到权限
		List tree = new ArrayList();
		Set<String> topMeunNames = new TreeSet<String>();
		Set<String> menuNames = new TreeSet<String>();// 剔除重复值，保存一级菜单名称
		for (Tabfunction fun :tabRole.getTabunctions()) {
			if (fun.getParenttabfunction().getParentid() == 0) {
				topMeunNames.add(fun.getParenttabfunction().getFunctionname());
			}else {
				menuNames.add(fun.getParenttabfunction().getFunctionname());
			}
		}
		// 遍历一级菜单名称，生成二级菜单名称
		for (String topmeun : topMeunNames) {
			Map<String, Object> topnode = new HashMap<String, Object>();
			topnode.put("id", 0);// 0:根级菜单
			topnode.put("text", topmeun);
			List topnodeChild = new ArrayList();
			List<String> erji=new ArrayList<String>();
			for (Tabfunction fun : tabRole.getTabunctions()) {
				// 匹配是否是当前菜单的子项
				if (topmeun.equals(fun.getParenttabfunction().getFunctionname())) {
					Map<String, Object> n = new HashMap<String, Object>();
					n.put("id", 1);
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
					topnodeChild.add(n);
				}
			}
			topnode.put("children1", topnodeChild);
			tree.add(topnode);		
		}
		return tree;
	}
	
}
