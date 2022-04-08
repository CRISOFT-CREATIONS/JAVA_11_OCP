package com.kenzo.javaIO;

import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws IOException {
		
//		PrintWriter pw = new PrintWriter("");
		
		String fname = "Raghav";
		String lname = "Bhatnagar";
		int age = 23;
		
		try(PrintWriter pw = new PrintWriter(System.out)){		
			pw.printf("Hi! I am %s %s, my age is %s!",fname, lname, age);
		}
		
		try(PrintWriter pw = new PrintWriter("files/format.txt")){		
			pw.printf("Hi! I am %s %s, my age is %s!",fname, lname, age);
		}
	}
}
