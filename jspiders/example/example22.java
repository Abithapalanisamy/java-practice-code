package com.jspiders.example;

class Student34
{
	int rolno=101;
	@Override
	public boolean equals(Object obj) {
		Student34 s= (Student34)obj;
		s.rolno=102;
		{
			if(this.rolno==s.rolno) {
				System.out.println(this);
				return true;
			}
			else
			{
				return false;
			}
		}
		
		
	}
	
}
public class example22 {
	public static void main(String[] args) {
			Student34 s1=new Student34();
			System.out.println(s1);
			
			
			Student34 s2=new Student34();
			System.out.println(s1.equals(s2));
			
			
	}
}
