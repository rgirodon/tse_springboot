package org.rygn.tse_springboot.components;

import org.rygn.tse_springboot.interfaces.Canine;
import org.springframework.stereotype.Component;

@Component
public class Dog implements Canine {

	@Override
	public String toString() {
		return "Dog instance";
	}
}
