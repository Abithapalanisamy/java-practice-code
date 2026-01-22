package com.jspiders.example;
class Product{
	int pid=101;
	@Override
	public boolean equals (Object obj)
	{
		Product p=(Product)obj;
		if(this.pid==p.pid)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
public class Mainclass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1=new Product();
		Product p2=new Product();
		System.out.println(p1.equals(p2));
	}

}
