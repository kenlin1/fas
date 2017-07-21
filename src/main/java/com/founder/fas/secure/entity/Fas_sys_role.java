package com.founder.fas.secure.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Fas_sys_role {

	@Id
	@SequenceGenerator(name="fas_sys_role_generator", sequenceName="fas_sys_role_sequence", initialValue = 23)
	@GeneratedValue(generator = "fas_sys_role_generator")
	private Long id;
	@Column(nullable = false)
	private String username;
	@Column(nullable = false)
    private String role_name;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
	public String getUsername() {
		return username;
	}
	public void setUser_name(String username) {
		this.username = username;
	}
	public String getRole_name() {
		return role_name;
	}
	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}



}
