package TestPattern;

public class pattern6 {
	public static void main(String args[])
	{
		int n=7;
		int sp=n/2;
		int str=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1; j<=sp; j++)
			{
				System.out.print("  ");
			}
			for(int k=1; k<=str; k++)
			{
				System.out.print("* ");
			}
			if(i<=n/2)
			{
				sp--;
				str+=2;
			}
			else
			{
				sp++;
				str-=2;
			}
			System.out.println();
		}
	}
}
