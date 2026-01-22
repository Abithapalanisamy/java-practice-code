package com.jspiders.filehandling;

import java.io.File;

public class Mainclass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File ref=new File("D://APP/JAVA","EXAMPLE1.txt");
		boolean bool=ref.exists();
		if(bool==true)
		{
			ref.delete();
			System.out.println("deleted");
		}
		else
		{
			System.out.println("File/folder not Visible....");
		}
	}

}
