package com.jspiders.filehandling;

import java.io.File;
import java.io.IOException;

public class Mainclass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File ref=new File("D://APP/JAVA/EXAMPLE2.txt");
//		File ref=new File("D://APP/JAVA","EXAMPLE.txt");
		boolean bool=ref.exists();
		if(bool==false)
		{
//			ref.createNewFile();      will show error because it is risky code
			try 
			{
				ref.createNewFile();
				System.out.println("file created");
			} catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("already exists");
		}
	}

}
