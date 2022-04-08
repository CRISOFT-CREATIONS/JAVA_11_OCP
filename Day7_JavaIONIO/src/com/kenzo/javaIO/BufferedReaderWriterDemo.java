package com.kenzo.javaIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class BufferedReaderWriterDemo {

	public static void main(String[] args) throws IOException {
		
//		try(FileReader fileReader = new FileReader("files/test.txt");
//			BufferedReader buffReader = new BufferedReader(fileReader);){
			
//			String readData = buffReader.readLine();
//			System.out.println(readData);
//			
//			String line;																		// I
//			while((line = buffReader.readLine()) != null) {
//				System.out.println(line);
//			}
			
//			buffReader.lines().forEach(System.out::println);									// II
//	}
		
//		Files.newBufferedReader(Path.of("files/test.txt"))										// III
//		.lines().forEach(System.out::println);
		
//		long count = Files.newBufferedReader(Path.of("files/test.txt"))							// Count no. of lines
//		.lines().count();
//		System.out.println(count);
		
//		int totalChar = Files.newBufferedReader(Path.of("files/test.txt"))						// Count no. of characters		
//		.lines()
//		.map(l -> l.length())
//		.peek(l -> System.out.println(l))														// No of characters in every line
//		.reduce(0, (a,b) -> a+b);
//		
//		System.out.println("Total Characters :" +totalChar);
		
//		long totalWords = Files.newBufferedReader(Path.of("files/test.txt"))					// Count no. of words		
//		.lines()
//		.flatMap(l -> Arrays.stream(l.split(" ")))
//		.count();
//		
//		System.out.println("Total Words :" +totalWords);
		
		String vowels = "AEIOUaeiou";
		long totalVowels = Files.newBufferedReader(Path.of("files/test.txt"))					// Count no. of vowels	
				.lines()
				.flatMap(l -> Arrays.stream(l.split("")))
				.filter(s -> vowels.contains(s))
				.count();
				
				System.out.println("Total Vowels :" +totalVowels);
	}
}
