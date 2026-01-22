package com.jspiders.example;
class Student
{
	String name;
	long contact;
	double cgpa;
	
	Student (String name, long contact, double cgpa)
	{
		this.name=name;
		this.contact=contact;
		this.cgpa=cgpa;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", contact=" + contact + ", cgpa=" + cgpa + "]";
	}

	public boolean equals (Object obj)
		{
			Student s=(Student)obj;
			if(this.contact==s.contact)
			{
				return true;
			}
			else
			{
				return false;
			}
	}
}

public class Mainclass7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student("Rama", 987654321L,8.03);
		Student s2=new Student("Rama", 123456789L,8.03);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.equals(s2));
		
	}

}
