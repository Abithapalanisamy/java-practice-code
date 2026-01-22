package com.jspiders.filehandling;

import java.io.File;


public class Maainclass4 {

	static void displayFileDetails(File obj)
	{
		System.out.println("Length :"+obj.length());
		System.out.println("Location :"+obj.getAbsolutePath());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1=new File("D://APP/JAVA/EXAMPLE2.txt");
//		File obj=new File("D://APP/JAVA/EXAMPLE2.txt")
		displayFileDetails(f1);
	}
}
