package com.founder.fas.secure.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.founder.fas.secure.service.SecureService;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true)
@Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
     private  SecureService secureService;


    @Autowired
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //密码加密策略
      //auth.userDetailsService(secureService).passwordEncoder(new BCryptPasswordEncoder()); 
    	auth.userDetailsService(secureService);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
    	http.authorizeRequests().antMatchers("/css/**").permitAll().anyRequest()
		.fullyAuthenticated()
		.and()
		.formLogin().loginPage("/login").failureUrl("/login?error").permitAll()
		.and()
		.logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout", "GET")).permitAll();//定义登出方式 
    }
}

