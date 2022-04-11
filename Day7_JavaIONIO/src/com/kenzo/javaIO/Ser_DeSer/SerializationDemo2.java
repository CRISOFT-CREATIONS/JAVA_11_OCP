package com.kenzo.javaIO.Ser_DeSer;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationDemo2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		try(FileInputStream fis = new FileInputStream("files/student.bin");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			
			Student student = (Student) ois.readObject();				// Deserialization
			System.out.println(student);								// college name will be null, because 
																		// transient fields are not serializable.
		}
	}
}
