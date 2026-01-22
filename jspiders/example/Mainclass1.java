package com.jspiders.example;

class Student1{
	String name="Rama";
}

class Student2{
	String name="Rama";
	@Override
	public String toString() {
		return "student name :"+ name;
	}
}
public class Mainclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s1=new Student1();
		System.out.println(s1.toString());
		
		Student2 s2=new Student2();
		System.out.println(s2);
	}

}
