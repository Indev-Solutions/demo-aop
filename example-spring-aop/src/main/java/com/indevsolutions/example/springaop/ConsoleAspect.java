package com.indevsolutions.example.springaop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ConsoleAspect {

	@Around("execution(* com.indevsolutions.example.springaop.Console.printMessage())")
	public void logAroundAllMethods(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("Log before...");
		joinPoint.proceed();
		System.out.println("After log...");
	}

}
