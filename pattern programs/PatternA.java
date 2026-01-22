public class PatternA {
    public static void mian(String args[])
	{
		int n=5;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<i; j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=n*2-i; k++)
			{
				System.out.print("* ");
			}
			//if()
			System.out.println();
		}
	}
}
