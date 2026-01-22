package com.jspiders.filehandling;

import java.io.File;

public class Mainclass1 {

	public static void main(String[] args) {
		File ref=new File("D://APP/JAVA");
		boolean bool=ref.exists();
		if(bool==false)
		{
			ref.mkdir();
			System.out.println("folder create");
		}
		else
		{
			System.out.println("folder already exits");
		}
	}

}
