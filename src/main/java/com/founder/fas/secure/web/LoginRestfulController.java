/*
 * Copyright 2012-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

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
