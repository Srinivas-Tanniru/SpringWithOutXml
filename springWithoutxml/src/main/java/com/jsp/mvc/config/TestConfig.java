package com.jsp.mvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.jsp.mvc")
public class TestConfig 
{
	@Bean	
	public InternalResourceViewResolver viewResolver() 
	{
		InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
		viewResolver.setPrefix("/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
		@Bean
		public JdbcTemplate getConnection()
		{
			JdbcTemplate template= new JdbcTemplate(url());
			return template;
		}
		@Bean
		public DriverManagerDataSource url()
		{
			DriverManagerDataSource dataSource=new DriverManagerDataSource();
			dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
			dataSource.setUrl("jdbc:mysql://localhost:3306/srinivas1");
			dataSource.setUsername("root");
			dataSource.setPassword("12345");
			
			return dataSource;
			
		}
		
			
		
}
