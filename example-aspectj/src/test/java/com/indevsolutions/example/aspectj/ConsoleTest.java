package com.indevsolutions.example.aspectj;

import org.junit.jupiter.api.Test;

public class ConsoleTest {

	@Test
	public void testPrintMessage() {
		
		Console user = new Console();
		user.printMessage();

	}

}
