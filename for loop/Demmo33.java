public class Demmo33 {
    public static void main(String[] args) {
        int n=7;
        int val=1;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=val; j++)
            {
                System.out.print("* ");
            }
            if(i<=n/2)
            {
                val++;
            }
            else{
                val--;
            }
            System.out.println();
        }
    }
}
