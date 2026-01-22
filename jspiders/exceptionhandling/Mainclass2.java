package com.jspiders.exceptionhandling;

public class Mainclass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="java";
		try
		{
			System.out.println(str.charAt(7));
		}
		catch(NullPointerException e)
		{
			System.out.println("Operation nwith null reference");
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("invalid index value");
		}
	}

}
