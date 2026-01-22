package com.jspiders.example;
class Person{
	long aadhar=123456789L;
	@Override
	public boolean equals (Object obj)
	{
		Person p=(Person)obj;
		if(this.aadhar==p.aadhar)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
public class Mainclass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person();
		Person p2=new Person();
		System.out.println(p1.equals(p2));
	}

}
