package com.indevsolutions.example.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class ConsoleAspect {

	@Around("execution(* com.indevsolutions.example.aspectj.Console.printMessage())")
	public void logAroundAllMethods(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("Log before...");
		joinPoint.proceed();
		System.out.println("After log...");
	}

}
