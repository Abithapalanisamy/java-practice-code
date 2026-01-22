public class Demmo32 {
        public static void main(String[] args) {
        int n=5;

        int space=n/2;
        int val=1;

        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=space; j++)
            {
                System.out.print("  ");
            }
            for(int k=1; k<=val; k++)
            {
                if(i%2==0)
                {
                    System.out.print((char)(96+k)+" ");
                }
                else
                {
                    System.out.print((char)(64+k)+" ");
                }
            }
            if(i<=n/2)
            {
                space--;
                val+=2;
            }
            else
            {
                space++;
                val-=2;
            }
            System.out.println();
        }
    }
}

