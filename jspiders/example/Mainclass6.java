package com.jspiders.example;
class 	Employee{
	private int eid=121;
	private double ctc=100000.0;
	@Override
	public boolean equals (Object obj)
	{
		Employee e=(Employee)obj;
		if(this.eid==e.eid && this.ctc==e.ctc)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
public class Mainclass6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee();
		Employee e2=new Employee();
		System.out.println(e1.equals(e2));
	}

}
