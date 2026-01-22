package com.jspiders.exceptionhandling;
class Hotel{
	void eat() {
		System.out.println("going to eat");
	}
}
public class Mainclass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Hotel h=(Hotel)Class.forName("com.jspiders.exceptionhandling.Hotel").newInstance();
			h.eat();
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Class Not Found");
		}
		catch(IllegalAccessException e)
		{
			System.out.println("Access Denied");
		} 
		catch (InstantiationException e)
		{
			System.out.println("Object creation failed");
		}
	}

}
