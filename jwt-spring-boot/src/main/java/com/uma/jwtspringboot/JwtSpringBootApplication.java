package com.uma.jwtspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.uma.jwtspringboot.config.JwtFilter;

@SpringBootApplication
@ComponentScan
public class JwtSpringBootApplication {

	@Bean
	public FilterRegistrationBean jwtFilter() {
		final FilterRegistrationBean registrationBean = new FilterRegistrationBean();
		registrationBean.setFilter(new JwtFilter());
		registrationBean.addUrlPatterns("/secure/*");

		return registrationBean;
	}

	public static void main(String[] args) {
		SpringApplication.run(JwtSpringBootApplication.class, args);
	}
}
