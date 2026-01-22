package com.jspiders.filehandling;

import java.io.File;

public class Mainclass6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File ref=new File("D://APP/JAVA");
		String[] arr=ref.list();
		for(int i=0; i<arr.length; i++)
		{
			File obj=new File(ref,arr[i]);
			if(obj.isFile()==true)
			{
				System.out.println(arr[i]);
			}
		}
	}

}