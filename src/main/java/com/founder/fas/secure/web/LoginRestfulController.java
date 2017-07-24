package com.founder.fas.secure.web;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.founder.fas.secure.dao.Fas_sys_userDao;
import com.founder.fas.secure.entity.Fas_sys_user;

@RestController
public class LoginRestfulController {
    @Autowired
    Fas_sys_userDao userDao;
    
	@Secured({"ROLE_ADMIN","ROLE_USER"})
	@RequestMapping("/res")
	public Fas_sys_user home(Map<String, Object> model) {
		return userDao.findByUsername("user");
	}
}
