package TestPattern;

public class Pattern3 {
	public static void main(String args[])
	{	
		int n=7;
		for(int i=1; i<=n; i++)
		{
			for(int j=1;j<=n;j++)
			{
				if( j==n/2+1 || i==n/2+1 )
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.printf("  ");
				}	
			}
			System.out.println();
		}
	}
}
