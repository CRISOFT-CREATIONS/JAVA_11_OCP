package com.kenzo.javaIO;

import java.io.Console;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;

public class ConsoleDemo {

	public static void main(String[] args) {
		
		Console console = System.console();
		System.out.println(console != null);
		
		Reader reader = console.reader();
//		Writer writer = console.writer();
		PrintWriter writer = console.writer();
	
		writer.println("Welcome to Console!");
		String name = console.readLine();
		int age = Integer.parseInt(console.readLine());
		String password = String.valueOf(console.readPassword());
		
		writer.printf("Hi %s you are %s years old. Your password is : %s", name, age, password);
	}
}
