package com.founder.fas.secure.entity;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Transient;

@Entity
public class Fas_sys_user implements UserDetails {  // implements UserDetails 用于登录时 @AuthenticationPrincipal 标签取值

	private static final long serialVersionUID = -4058226681000452544L;

	@Id
	@SequenceGenerator(name="fas_sys_user_generator", sequenceName="fas_sys_user_sequence", initialValue = 28)
	@GeneratedValue(generator = "fas_sys_user_generator")
	private Long id;
	@Column(nullable = false)
	private String username;
	@Column(nullable = false)
    private String password;
	@Column(nullable = false)
    private boolean enabled;
    
    @Transient
    private List<? extends GrantedAuthority> authorities;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }


    @Override
    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    public void setGrantedAuthorities(List<? extends GrantedAuthority> authorities) {
        this.authorities = authorities;
    }

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

}
