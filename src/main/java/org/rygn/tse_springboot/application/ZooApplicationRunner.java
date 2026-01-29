package org.rygn.tse_springboot.application;

import org.rygn.tse_springboot.components.Zoo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ZooApplicationRunner implements ApplicationRunner {

	@Autowired
	private Zoo zoo;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println(zoo);
	}
}
