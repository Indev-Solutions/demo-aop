package com.indevsolutions.example.springaop;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = SpringTestConfig.class)
public class ConsoleTest {

	@Autowired
	private Console console;
	
	@Test
	public void testPrintMessage() {
		console.printMessage();
	}
}
