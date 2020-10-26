package org.rygn.tse_springboot.components;


import org.rygn.tse_springboot.interfaces.Bird;
import org.rygn.tse_springboot.interfaces.Canine;
import org.rygn.tse_springboot.interfaces.Feline;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Zoo {

	@Autowired
	private Bird bird;
	
	@Autowired
	private Canine canine;
	
	@Autowired
	private Feline feline;

	@Override
	public String toString() {
		return "Zoo [bird=" + bird + ", canine=" + canine + ", feline=" + feline + "]";
	}
}
