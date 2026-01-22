package com.jspiders.example;

public class Documents implements Cloneable {
	int size;
	public static void main(String[] args) throws CloneNotSupportedException{
		// TODO Auto-generated method stub
		Documents obj=new Documents();
		obj.size=5;
		
		Documents copyOfDocument=(Documents)obj.clone();
		System.out.println(copyOfDocument.size);
	}

}
