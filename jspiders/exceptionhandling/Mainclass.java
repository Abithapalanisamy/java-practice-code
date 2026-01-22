package com.jspiders.exceptionhandling;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program Started");
		try 
		{
			System.out.println(10/01);
		}
		catch(ArithmeticException e)
		{
			System.out.println("/by zero");
		}
		System.out.println("Program Ends");
	}

}
