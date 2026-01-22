package TestPattern;

public class Pattern5 {
	public static void main(String[] args) {
		int n=7;
		int val=1;
		int spc=n-2;
		for(int i=1;i<=n;i++)
		{
			for(int j=1; j<=val; j++)
			{
				System.out.println(j+" ");
			}
			for(int k=1; k<=spc; k++)
			{
				System.out.print("  ");
			}
			for(int l=1; l<=val; l++)
			{
				System.out.println(l+" ");
			}
		}
	}
}
