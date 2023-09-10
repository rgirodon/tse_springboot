package org.rygn.tse_springboot.config;

import org.rygn.tse_springboot.components.Owl;
import org.rygn.tse_springboot.components.Parrot;
import org.rygn.tse_springboot.interfaces.Bird;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
	
	@Bean
	public Bird bird() {
		
		return new Owl();
	}
}
