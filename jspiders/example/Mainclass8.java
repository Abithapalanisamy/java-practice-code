package com.jspiders.example;
class Connection{
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Clear All");
	}
}
public class Mainclass8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con=new Connection();
		System.gc();
		con=null;
		System.gc();
	}

}             

