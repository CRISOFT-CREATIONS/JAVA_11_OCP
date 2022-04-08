package com.kenzo.javaIO;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class ReadANdWriteBytesDemo {

	public static void main(String[] args) throws IOException {
		
		// WRITING
		
//		byte[] data = new byte[] {10,20,30,40,50,60};
//		
//		try(OutputStream outputStream = new FileOutputStream("files/data.bin")) {
//			outputStream.write(data);
//			System.out.println("Bytes stored in data.bin");
//		}
		
		// READING
		
//		try(InputStream inputStream = new FileInputStream("files/data.bin")) {
//			byte[] data = inputStream.readAllBytes();
//			System.out.println(Arrays.toString(data));
//		}
		
		// BUFFERED INPUT STREAM
		
//		try(InputStream inputStream = new FileInputStream("files/data.bin");
//			BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream)) {
//			
//			byte[] data = inputStream.readAllBytes();
//			System.out.println(Arrays.toString(data));
//		}
		
		// IN - MEMORY
		
		int[] nums = {10,20,30,40,50};
		double[] vals = {1.3,2.5,4.5,5.6,7.4};
		
		byte[] data;
		
		try(ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
			DataOutputStream dataOutputStream = new DataOutputStream(outputStream)) {
				
			for(int n: nums) {
				dataOutputStream.writeInt(n);
			}
			for(double v: vals) {
				dataOutputStream.writeDouble(v);
			}
			
			data = outputStream.toByteArray();
		}
		
		try(ByteArrayInputStream inputStream = new ByteArrayInputStream(data);
			DataInputStream dataInputStream = new DataInputStream(inputStream)) {
			
			for(int i=0; i<nums.length; i++) {
				int getInt = dataInputStream.readInt();
				System.out.println(getInt + " ");
			}
			System.out.println();
			
			for(int i=0; i<vals.length; i++) {
				double getDouble = dataInputStream.readDouble();
				System.out.println(getDouble + " ");
			}
		}
	}
}
