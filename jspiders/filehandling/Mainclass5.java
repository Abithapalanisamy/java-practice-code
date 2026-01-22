package com.jspiders.filehandling;

import java.io.File;

public class Mainclass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File ref=new File("D://APP/JAVA");
		String[] arr=ref.list();
		for(int i=0; i<arr.length; i++)
//		for(int i=0; i<=arr.length-1; i++)
		{
			System.out.println(arr[i]);
		}
	}

}
