package com.jspiders.example;
class Employee1{
	int eid=420;
}
class Employee2{
	int eid=420;
	@Override
	public int hashCode() {
		return eid;
	}
}
public class Mainclass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 e1= new Employee1();
		System.out.println(e1);
		System.out.println("======================================s");
		System.out.println(e1.hashCode());
		Employee2 e2= new Employee2();
		System.out.println(e2.hashCode());
	}

}
