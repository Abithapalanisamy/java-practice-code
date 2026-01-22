package com.jspiders.exceptionhandling;

class Hotels{
	void eat() {
		System.out.println("going to eat");
	}
}
public class Mainclass5 {

		static void createInstance() throws ClassNotFoundException, IllegalAccessException, InstantiationException
		{
			Hotels h=(Hotels)Class.forName("com.jspiders.exceptionhandling.Hotel").newInstance();
			h.eat();
		}
		
		public static void main(String[] args) {
		try
		{
			createInstance();
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
