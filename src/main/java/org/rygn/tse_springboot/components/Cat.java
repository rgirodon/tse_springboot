package org.rygn.tse_springboot.components;

import org.rygn.tse_springboot.interfaces.Feline;
import org.springframework.stereotype.Component;

@Component
public class Cat implements Feline {

	@Override
	public String toString() {
		return "Cat instance";
	}
}
