package com.jspiders.exceptionhandling;

public class Documents implements Cloneable{
	int size;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Documents doc=new Documents();
		doc.size=5;
		
		try
		{
			Documents copyOfDoc=(Documents) doc.clone();
			System.out.println(copyOfDoc.size);
		}
		catch(CloneNotSupportedException e)
		{
			System.out.println("Clone Operation Failed");
		}
	}

}
