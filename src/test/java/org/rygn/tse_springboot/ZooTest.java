package org.rygn.tse_springboot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.rygn.tse_springboot.components.Zoo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
public class ZooTest {

	@Autowired
	private Zoo zoo;
	
	@Test
	public void testToString() {
		
		Assertions.assertTrue(zoo.toString().contains("Dog instance"));
		
		Assertions.assertTrue(zoo.toString().contains("Cat instance"));
		
		Assertions.assertTrue(zoo.toString().contains("Owl instance"));
	}
}
