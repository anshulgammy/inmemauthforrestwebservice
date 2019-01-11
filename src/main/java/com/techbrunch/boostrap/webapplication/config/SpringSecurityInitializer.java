package com.techbrunch.boostrap.webapplication.config;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

/**
 * @author TechBrunch. This Class can entirely replace the web.xml file from
 *         <3.0 Servlet versions. In place of web.xml, this class will come in
 *         handy, and it registers the Spring Dispatcher servlet with
 *         javax.servlet.
 * 
 *         Important thing to note is: AbstractSecurityWebApplicationInitializer
 *         implements WebApplicationInitializer.
 */
public class SpringSecurityInitializer extends AbstractSecurityWebApplicationInitializer {
	
}
