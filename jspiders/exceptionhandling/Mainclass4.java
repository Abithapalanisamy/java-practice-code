package com.jspiders.exceptionhandling;

public class Mainclass4 {

	public static void main(String[] args) {
		try
		{
			Object obj=new Object();
			System.out.println(obj.toString());
		}
		catch(NullPointerException e)
		{
			System.out.println("Operation with null refernce");
		}
		finally
		{
			System.out.println("executing finally block");
		}
	}

}
