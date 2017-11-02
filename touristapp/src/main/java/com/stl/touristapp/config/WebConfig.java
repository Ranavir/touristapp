package com.stl.touristapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
//@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter {
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();

	}
}
