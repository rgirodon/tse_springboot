package org.rygn.tse_springboot.config;

import org.rygn.tse_springboot.components.Owl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
	
	@Bean
	public Owl owl() {
		
		return new Owl();
	}
}
