package com.kenzo.javaIO;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo {

	public static void main(String[] args) {
		
		/*
		Path path=Path.of("files/test.txt");
		//Path path=Paths.get("files/test.txt");

		System.out.println(path);
		System.out.println(path.isAbsolute());
		
		Path path1=Path.of("c:/files/folder1/test.txt");
		//Path path1=Path.of("c:");
		System.out.println(path1.getRoot());   						// c:
		
		System.out.println(path1.getNameCount());
		//System.out.println(path1.getName(0));
		System.out.println(path1.getName(2));
		*/
		
		/*
		//resolve() : resolving path
		
		// Case 1 : 1 Absolute Path, 1 Relative Path
		Path p1 = Path.of("D:/files/abc.txt");
		Path p2 = Path.of("def.txt");
		
		Path r = p1.resolve(p2);									// p1 : this,     p2 : other
		System.out.println(r);										// this + other (concatenating)
		
		// Case 2 : Both Absolute Paths
		Path p3 = Path.of("D:/files/abc.txt");
		Path p4 = Path.of("D:/def.txt");
		
		Path r2 = p3.resolve(p4);									// p3 : this,     p4 : other
		System.out.println(r2);										// 
		
		// Case 3 : Both Relative Paths
		// Concatenate
		
		// Case 4 : 1 Relative Path, 1 Absolute Path
		Path p5 = Path.of("files2/abc.txt");
		Path p6 = Path.of("D:/files");
		
		Path r3 = p5.resolve(p6);									// p5 : this,     p6 : other
		System.out.println(r3);										// 
		
		// Case 5 : If one path is empty, other path is printed.
		*/
		
		/*
		// resolveSibling()
		Path p1 = Paths.get("D:/files/abc.txt");
		Path p2 = Paths.get("folder1/def.txt");
	
		//System.out.println(p1.resolve(p2));						// p2 prints
		System.out.println(p1.resolveSibling(p2));					// concatenation from parent (not normal concatenation)
		*/
		
		/*
		// relativize() : difference is removed, common path remains
		Path p1 = Path.of("A/B");
		Path p2 = Path.of("A/B/C/D");
		
		Path r = p1.relativize(p2);
		System.out.println(r);										// C/D
		
		Path p1 = Path.of("A/B/C");
		Path p2 = Path.of("A/B/C/D");
		
		Path r = p1.relativize(p2);
		System.out.println(r);										// D
		
		Path p1 = Path.of("A/B/C");
		Path p2 = Path.of("A/B");
		
		Path r = p1.relativize(p2);
		System.out.println(r);										// ..	
		
		Path p1 = Path.of("D:/files/file1");
		Path p2 = Path.of("D:/files/file2/abc.txt");
		
		Path r = p1.relativize(p2);
		System.out.println(r);										//..\file2\abc.txt
		
		Path p1 = Path.of("D:/");
		Path p2 = Path.of("D:/files/abc.txt");
		
		Path r = p1.relativize(p2);
		System.out.println(r);										// files\abc.txt
		
		Path p1 = Path.of("D:/files/file1/def.txt");
		Path p2 = Path.of("D:/files/file2/abc.txt");
		
		Path r = p1.relativize(p2);
		System.out.println(r);										// ..\..\file2\abc.txt
		
		Path p1 = Path.of("D:/files/file1/file3");
		Path p2 = Path.of("D:/abc.txt");
		
		Path r = p1.relativize(p2);
		System.out.println(r);										// ..\..\..\abc.txt
		
		Path p1 = Path.of("files/file1/file3");
		Path p2 = Path.of("files/abc.txt");
		
		Path r = p1.relativize(p2);
		System.out.println(r);										// ..\..\abc.txt
 		
		Path p1 = Path.of("D:/files/file1/file3");
		Path p2 = Path.of("C:/abc.txt");
		
		Path r = p1.relativize(p2);
		System.out.println(r);										// Exception : 'other' has different root
		
		Path p1 = Path.of("D:/files/file1/file3");
		Path p2 = Path.of("files/abc.txt");
		
		Path r = p1.relativize(p2);
		System.out.println(r);										// Exception : 'other' has different root
		*/
		
		/*
		// normalize()
		
		Path p = Path.of("D:/files");
		System.out.println(p.normalize());
		
		Path p1 = Path.of("D:/files/../file1");
		System.out.println("p1 : " +p1.normalize());
		
		Path p2 = Path.of("D:/files/../../file1");
		System.out.println("p2 : " +p2.normalize());
		
		Path p3 = Path.of("files/./files1/../././././files2/.././././files3");
		System.out.println("p3 : " +p3.normalize());
		
		Path p4 = Path.of("files/././../../dir/../.././../files");
		System.out.println("p4 : " +p4.normalize());
		
		Path p5 = Path.of("D:/files/././../../dir/../.././../files");
		System.out.println("p5 : " +p5.normalize());
		*/
		
		/*
		// getNameCount(), getName() 
		 
		Path p = Path.of("D:/files/file1/file2/file3/abc.txt");
		System.out.println("Name count : " +p.getNameCount());
		
		for(int i=0; i<p.getNameCount(); i++)
			System.out.println(p.getName(i));
		*/
		
		/*
		// subpath()
		  
		Path p = Path.of("D:/files/file1/file2/file3/abc.txt");
		System.out.println(p.subpath(2, 4));						// 2,3
		System.out.println(p.subpath(2, 9));						// Illegal argument exception
		System.out.println(p.subpath(0, 0));						// Illegal argument exception
		System.out.println(p.subpath(2, 2));						// Illegal argument exception
		*/
		
		
	}

}