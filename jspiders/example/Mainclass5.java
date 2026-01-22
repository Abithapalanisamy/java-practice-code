package com.jspiders.example;
class CreditCard{
	private long cardNumber=123456789L;
	private int cvv=123;
	@Override
	public boolean equals (Object obj)
	{
		CreditCard c=(CreditCard)obj;
		if(this.cardNumber==c.cardNumber && this.cvv==c.cvv)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
public class Mainclass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreditCard c1=new CreditCard();
		CreditCard c2=new CreditCard();
		System.out.println(c1.equals(c2));
	}

}
