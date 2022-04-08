package com.kenzo.javaIO;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class StringReaderWriterDemo {

	public static void main(String[] args) throws IOException {
		
		StringWriter writer = new StringWriter();
		writer.write("Kenzo is a fantastic player");
		
		StringReader reader = new StringReader("My name is Kenzo, im a fantastic player!");
		// skip, markSupported, mark, reset
		
		System.out.println(reader.markSupported());
		System.out.println((char)reader.read());
		System.out.println((char)reader.read());
		System.out.println((char)reader.read());
		System.out.println((char)reader.read());			// till n
		
		reader.mark(6);										// marked
		
		System.out.println((char)reader.read());
		System.out.println((char)reader.read());
		
		reader.reset();										// go back to marked position
	
		System.out.println((char)reader.read());			// from a
		System.out.println((char)reader.read());		
		System.out.println((char)reader.read());
		System.out.println((char)reader.read());			// till e
		
		reader.skip(4);										// is K
		
		System.out.println((char)reader.read());			// e
		System.out.println((char)reader.read());			// n
	}
}
