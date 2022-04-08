package com.kenzo.javaIO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterDemo {

	public static void main(String[] args) throws IOException {
		
		/*
		Writer writer = new FileWriter("files/myFile.txt");
		String str = "Adding KENZO";
		
		writer.write(str);				// stores data in buffer memory
		
//		writer.flush();					// 1 way : stores in file
		
		writer.close();					// 2 way : calls flush before it closes the writer
		*/
		
		// Try with resources
		try(Writer writer = new FileWriter("files/myFile.txt")) {
			
			String str = "Adding KENZO";
			writer.write(str);
			System.out.println("Data Added to myFile.txt");
			// Autocloses here
		}catch (IOException e) {
			
			System.out.println(e.getMessage());
			
		}
	}
}
