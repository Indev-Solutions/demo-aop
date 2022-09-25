package com.indevsolutions.example.aspectj;

public aspect ConsoleNativeAspect {
    void around(): call(void Console.printMessage()) {
        System.out.println("N Log before ...");
        proceed();
        System.out.println("N After log...");
    }
}