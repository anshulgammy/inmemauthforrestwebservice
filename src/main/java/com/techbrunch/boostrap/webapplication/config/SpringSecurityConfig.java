package com.techbrunch.boostrap.webapplication.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import com.techbrunch.boostrap.webapplication.util.CommonConstants;

/**
 * @author TechBrunch This class is the config class used to declare Component
 *         all the configurations related to Spring Security.
 *
 */
@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	protected void configureGlobal(final AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser(CommonConstants.ADMIN_USER_NAME).password(CommonConstants.ADMIN_USER_PWD)
				.roles(CommonConstants.ADMIN_ROLE);
		auth.inMemoryAuthentication().withUser(CommonConstants.USER_USER_NAME).password(CommonConstants.USER_PWD)
				.roles(CommonConstants.USER_ROLE);
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable().exceptionHandling().and().authorizeRequests().antMatchers("/**")
				.hasRole(CommonConstants.ADMIN_ROLE).and().httpBasic().and().formLogin();
	}
}
