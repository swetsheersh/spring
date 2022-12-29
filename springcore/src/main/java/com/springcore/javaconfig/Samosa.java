package com.springcore.javaconfig;

import org.springframework.stereotype.Component;

@Component("samosa")
public class Samosa {
	public void display() {
		System.out.println("Amazing Taste with high Price...");
	}
}
