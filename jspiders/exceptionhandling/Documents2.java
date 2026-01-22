package com.jspiders.exceptionhandling;

public class Documents2 implements Cloneable{
	int size;
	static void createCopy() throws CloneNotSupportedException
	{
		Documents2 doc=new Documents2();
		doc.size=5;
		Documents2 copyOfDoc=(Documents2) doc.clone();
		System.out.println(copyOfDoc.size);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try
		{
			createCopy();
		}
		catch(CloneNotSupportedException e)
		{
			System.out.println("Clone Operation Failed");
		}
	}

}
