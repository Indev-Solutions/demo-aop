package com.indevsolutions.example.springaop;

import org.springframework.stereotype.Component;

@Component
public class Console {
	
	public void printMessage() {
		System.out.println("message");
	}
}
