package com.kenzo.javaIO;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		
		/*
		//File file = new File("D:/files/test.txt");							// checks for files folder in the D: (Absolute Path)
		File file = new File("files/test.txt");									// checks for files folder in the Project (Relative Path)
		
		System.out.println("File exists? : " +file.exists());
		
		System.out.println("Is Absolute? : " +file.isAbsolute());				//Tests whether this abstract pathname is absolute.
		
		System.out.println("Path : " +file.getPath());							// Relative Path
		System.out.println("Absolute Path : " +file.getAbsolutePath());			// Absolute Path
		
		System.out.println("Creating new File : " +file.createNewFile());
		
		System.out.println("Is a file? : " +file.isFile() + "\nIs a Directory? : " +file.isDirectory());
		
		File file1 = new File("files/folder1");
		System.out.println("Making Directory? : " +file1.mkdir());				// Make a folder
		*/
		
		/*
		File file2 = new File("files/folder2/subfolder1");
		//System.out.println("Making Directory? : " +file2.mkdir());			// throw exception, because can't locate folder2
		System.out.println("Making multiple Directory? : " +file2.mkdirs());	// to create multiple folders on run
		
		System.out.println("Deleting File2 : " +file2.delete());
		*/
		
		
		// Canonical Path
		// .  : Current folder
		// .. :	Parent folder
		// If .  : ignored
		// If .. : cancels previous pathname
		/*
		File file3 = new File("D:/folder/../subfolder1/./subfolder2/../subfolder3");
		System.out.println("Absolute Path : " +file3.getAbsolutePath());
		System.out.println("Canonical Path : " +file3.getCanonicalPath());		// resolves path
		*/
		
				
		
	}
}
