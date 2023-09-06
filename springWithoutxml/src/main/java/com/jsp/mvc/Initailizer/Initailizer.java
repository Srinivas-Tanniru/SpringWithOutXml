package com.jsp.mvc.Initailizer;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.jsp.mvc.config.TestConfig;

public class Initailizer extends AbstractAnnotationConfigDispatcherServletInitializer
{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() 
	{
		Class config[]= {TestConfig.class};
		return config;
	}

	@Override
	protected String[] getServletMappings() 
	{
		String mapping[]= {"/"};
		return mapping;
	}

}
