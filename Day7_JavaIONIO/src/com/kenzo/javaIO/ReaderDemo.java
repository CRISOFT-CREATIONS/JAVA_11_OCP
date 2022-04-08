package com.kenzo.javaIO;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderDemo {

	public static void main(String[] args) throws IOException {
		
		Reader reader = new FileReader("files/test.txt");
		
//		System.out.println(reader.read());					// Printing the Ascii value for the first character
//		System.out.println((char) reader.read());			// Letter print
		
//		int ch;
//		while((ch=reader.read()) != -1)
//			System.out.print((char) ch);
		
		char[] cbuff = new char[100];		
		int count = reader.read(cbuff);
//		System.out.println(count);
		
		StringBuilder sb = new StringBuilder();
				
		while(count>0) {
//			count = reader.read(cbuff);
//			System.out.println(count);
			sb.append(cbuff,0,count);
			count = reader.read(cbuff);
		}
		System.out.println(sb);
	}
}
