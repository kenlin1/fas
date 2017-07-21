package com.founder.fas.secure.dao;

import org.springframework.data.repository.Repository;

import com.founder.fas.secure.entity.Fas_sys_user;

public interface Fas_sys_userDao extends Repository<Fas_sys_user, Long>{
	 Fas_sys_user findByUsername(String username);
}
