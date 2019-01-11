package com.techbrunch.boostrap.webapplication.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;



/**
 * @author TechBrunch
 * This class is for configuring the beans for the Spring Application
 * Using Java Configuration only.
 *
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.techbrunch.boostrap.webapplication")
public class SpringBeanDefinitionsConfig {
	
	@Bean
	public PasswordEncoder passwordEncoder(){
	    return new MyPasswordEncoder();
	}

}
