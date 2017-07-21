package com.founder.fas.secure.dao;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.founder.fas.secure.entity.Fas_sys_role;

public interface Fas_sys_roleDao extends Repository<Fas_sys_role, Long>{
	 List<Fas_sys_role> findByUsername(String username);
}
