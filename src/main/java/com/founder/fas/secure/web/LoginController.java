package com.founder.fas.secure.web;

import java.util.Date;
import java.util.Map;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	@Secured({"ROLE_ADMIN","ROLE_USER"})
	@RequestMapping("/")
	public String home(Map<String, Object> model) {
		model.put("message", "");
		model.put("title", "登录成功，首页！");
		model.put("date", new Date());
		return "home";
	}
	@Secured({"ROLE_ADMIN"})
	@RequestMapping("/admin")
	public String admin(Map<String, Object> model) {
		model.put("message", "该角色为管理员");
		model.put("title", "管理员页面");
		model.put("date", new Date());
		return "home";
	}
	@Secured({"ROLE_USER"})
	@RequestMapping("/user")
	public String user(Map<String, Object> model) {
		model.put("message", "该角色为普通用户");
		model.put("title", "用户页面");
		model.put("date", new Date());
		return "home";
	}
	@RequestMapping("/foo")
	public String foo() {
		throw new RuntimeException("Expected exception in controller");
	}

	@RequestMapping("/login")
	public String login(Map<String, Object> model) {
		return "/login/login";
	}

}
