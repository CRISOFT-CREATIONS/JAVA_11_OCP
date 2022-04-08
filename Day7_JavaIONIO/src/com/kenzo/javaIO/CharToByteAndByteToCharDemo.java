package com.kenzo.javaIO;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CharToByteAndByteToCharDemo {

	public static void main(String[] args) throws IOException {
		
		String str = "Hello World";
		byte[] data;
		char[] data1;
		
		try(ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
			OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream)) {
			
			outputStreamWriter.write(str);
			outputStreamWriter.flush();
			data = outputStream.toByteArray();
		}
		
		try(ByteArrayInputStream inputStream = new ByteArrayInputStream(data);
			InputStreamReader inputStreamReader = new InputStreamReader(inputStream)) {
			
			data1 = new char[data.length];
			inputStreamReader.read(data1);
			System.out.println(data1);
		}
	}
}
