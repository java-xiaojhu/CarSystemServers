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

<<<<<<< HEAD
import com.accp.springboot.pojo.*;
import com.accp.springboot.service.lyhservice.EmpService;

/**
 * 以 Controller结尾
=======
import com.accp.springboot.vo.lyhvo.*;
import com.accp.springboot.pojo.Emp;
import com.accp.springboot.pojo.TabRole;
import com.accp.springboot.pojo.Tabfunction;
import com.accp.springboot.service.lyhservice.EmpService;
import com.accp.springboot.util.PageBean;

/**
 * 以 Controller结尾
 * 
>>>>>>> 6882099cf96694140348758c8ca59b9a37d6824e
 * @author 小虎
 *
 */
@RestController
@RequestMapping("/lyh/Emps")
public class EmpController {
	@Resource
	private EmpService empService;
	
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
	@Resource
	private RoleService roleService ;
>>>>>>> branch 'master' of https://github.com/java-xiaojhu/CarSystemServers.git

>>>>>>> 6882099cf96694140348758c8ca59b9a37d6824e
	@GetMapping("loginIn/{id}/{pas}")
	public Map<String, Object> loginIn(@PathVariable Integer id, @PathVariable String pas, HttpSession session) {
		Emp user = empService.findUserLogin(id, pas);
		Map<String, Object> message = new HashMap<String, Object>();
		if (user != null) {
			session.setAttribute("USER", user);
			message.put("code", "200");
			message.put("msg", "ok");
<<<<<<< HEAD
			message.put("data", user);
=======
			message.put("user", user);
>>>>>>> 6882099cf96694140348758c8ca59b9a37d6824e
		} else {
			message.put("code", "300");
			message.put("msg", "login_error");
		}
<<<<<<< HEAD

		return message;
	}
=======
		return message;
	}
	
>>>>>>> 6882099cf96694140348758c8ca59b9a37d6824e

	@GetMapping("loginOut")
	public Map<String, Object> loginOut(HttpSession session) throws Exception {
		Map<String, Object> message = new HashMap<String, Object>();
		session.removeAttribute("USER");
<<<<<<< HEAD
		session.invalidate();// 立即失效
=======
		session.invalidate();// 立即失效 
>>>>>>> 6882099cf96694140348758c8ca59b9a37d6824e
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}

	@GetMapping("getSessionUser")
	public Emp getUserInfo(HttpSession session) throws Exception {
		Emp user = (Emp) session.getAttribute("USER");
		return user;
	}
	
	@GetMapping("/{n}")
	public PageBean getfindEmps(@PathVariable Integer n)  {	
		List rotree = new ArrayList();
		empService.findEmps().forEach(temp -> {
			Map<String, Object> role = new HashMap<String, Object>();
			System.out.println(temp);
			role.put("emp", temp);
			role.put("role", temp.getTabRole());
			role.put("functions", this.getUserFunTree(temp));
			rotree.add(role);		
		});
		PageBean pa=new PageBean(n,rotree.size(),4,rotree);
		return pa ;
	}
	
	@GetMapping("getFunTree")
	public List getUserFunTree(HttpSession session) {
		// 从session获得用户，以便得到权限
		Emp user = (Emp) session.getAttribute("USER");
		List tree = new ArrayList();
<<<<<<< HEAD
		Set<String> menuNames = new TreeSet<String>();// 剔除重复值，保存一级菜单名称
		for (Tabfunction fun : user.getTabRole().getTabfunction()) {
			menuNames.add(fun.getTabfunction().getFunctionname());
		}
		// 遍历一级菜单名称，生成二级菜单项
		for (String name : menuNames) {
			// 节点【初始化】
			Map<String, Object> node = new HashMap<String, Object>();
			node.put("id", 0);//0:根级菜单
			node.put("text", name);
			List nodeChild = new ArrayList();
			for (Tabfunction fun : user.getTabRole().getTabfunction()) {
				// 匹配是否是当前菜单的子项
				if (name.equals(fun.getTabfunction().getFunctionname())) {
					Map<String, Object> n = new HashMap<String, Object>();
					n.put("id", fun.getFunctioncode());
					n.put("text", fun.getFunctionname());
					nodeChild.add(n);
				}
			}
			node.put("children", nodeChild);
			tree.add(node);
		}
		return tree;
	}

=======
		Set<String> topMeunNames = new TreeSet<String>();
		Set<String> menuNames = new TreeSet<String>();// 剔除重复值，保存一级菜单名称
		for (Tabfunction fun : user.getTabRole().getTabunctions()) {
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
			for (Tabfunction fun : user.getTabRole().getTabunctions()) {
				// 匹配是否是当前菜单的子项
				if (topmeun.equals(fun.getParenttabfunction().getFunctionname())) {
					Map<String, Object> n = new HashMap<String, Object>();
					n.put("id", 1);
					n.put("text", fun.getFunctionname());			
					List nodeChild = new ArrayList();
					for (Tabfunction fun1 : user.getTabRole().getTabunctions()) {
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
<<<<<<< HEAD
	
	public List getUserFunTree(Emp emp) {
		// 从session获得用户，以便得到权限
		Emp user = emp;
		List tree = new ArrayList();
		Set<String> topMeunNames = new TreeSet<String>();
		Set<String> menuNames = new TreeSet<String>();// 剔除重复值，保存一级菜单名称
		for (Tabfunction fun : user.getTabRole().getTabunctions()) {
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
			for (Tabfunction fun : user.getTabRole().getTabunctions()) {
				// 匹配是否是当前菜单的子项
				if (topmeun.equals(fun.getParenttabfunction().getFunctionname())) {
					Map<String, Object> n = new HashMap<String, Object>();
					n.put("id", 1);
					n.put("text", fun.getFunctionname());			
					List nodeChild = new ArrayList();
					for (Tabfunction fun1 : user.getTabRole().getTabunctions()) {
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
=======
>>>>>>> 6882099cf96694140348758c8ca59b9a37d6824e
>>>>>>> branch 'master' of https://github.com/java-xiaojhu/CarSystemServers.git
}
