package com.kenzo.javaIO;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesDemo {

	public static void main(String[] args) throws IOException {
		
		// list, walk, find, lines
		
//		Files.lines(Paths.get("files/test.txt"))
//		.forEach(System.out::println);
		
//		Files.list(Path.of("D:\\OCP Batch 4 JAVA 11\\Day7_JavaIONIO"))
////		.forEach(p -> System.out.println(p));											// list of files with path
//		.map(p -> p.getFileName())														// list of file names
//		.forEach(System.out::println);
		
//		Files.list(Path.of("D:\\OCP Batch 4 JAVA 11\\Day7_JavaIONIO"))
//		.filter(p -> p.toString().endsWith(".docx"))
//		.map(p -> p.getFileName())														// list of file names
//		.forEach(System.out::println);
		
//		Files.walk(Path.of("D:\\OCP Batch 4 JAVA 11\\Day7_JavaIONIO"), Integer.MAX_VALUE)	// sub files as well
//		.forEach(p -> System.out.println(p.getFileName()));
		
//		Files.walk(Path.of("D:\\OCP Batch 4 JAVA 11\\Day7_JavaIONIO"), Integer.MAX_VALUE, FileVisitOption.FOLLOW_LINKS);		// symbolic links
		
//		Files.find(Path.of("D:\\OCP Batch 4 JAVA 11\\Day7_JavaIONIO"), Integer.MAX_VALUE, (p,attr) -> (attr.isRegularFile() && p.toString().endsWith(".java")))
//		.map(p -> p.getFileName())
//		.forEach(System.out::println);
		
		
	}
}
