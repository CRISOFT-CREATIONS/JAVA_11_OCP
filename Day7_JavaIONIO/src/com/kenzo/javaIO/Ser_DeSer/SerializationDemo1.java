package com.kenzo.javaIO.Ser_DeSer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;

public class SerializationDemo1 {

	public static void main(String[] args) throws IOException {
		
		Student student = new Student();
		student.setId(101);
		student.setName("Raghav");
		student.setAge(23);
		student.setSalary(350000);
		student.setCollegeName("ABC University");
		
		try(FileOutputStream fos = new FileOutputStream("files/student.bin");
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			
			oos.writeObject(student);						// Serialization
		}
		long version1 = ObjectStreamClass.lookup(student.getClass()).getSerialVersionUID();
		System.out.println("Object stored with version ID : " +version1);
	}
}
