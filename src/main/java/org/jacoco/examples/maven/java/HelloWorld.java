package org.jacoco.examples.maven.java;

public class HelloWorld {
	
	public String getMessage(boolean bigger) {
		if (bigger) {
			System.out.println("add a new line")
			return "Hello Universe!";
			
		} else {
			return "Hello World!";
		}
	}

}
