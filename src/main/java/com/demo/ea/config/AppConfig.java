package com.demo.ea.config;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class AppConfig implements WebMvcConfigurer {
	
	Logger log = LoggerFactory.getLogger(getClass());

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/api/**").allowedOrigins("http://domain2.com").allowedMethods("GET", "DELETE")
				.allowedHeaders("header1", "header2", "header3").exposedHeaders("header1", "header2")
				.allowCredentials(false).maxAge(3600);
	}
}
