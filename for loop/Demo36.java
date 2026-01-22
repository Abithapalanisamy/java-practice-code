public class Demo36 {
    public static void main(String[] args) {
        int n=7;
        int star = 1;
        int space = n/2;
        
        for(int i=1; i<=n; i++)
        {
            int val=1;
            for(int j=1; j<=space; j++)
            {
                System.out.print("  ");
            }
            for(int k=1; k<=star; k++)
            {
                System.out.print(val+" ");
                if (k<=star/2) 
                {
                    val++;
                }
                else
                {
                    val--;
                }
            }
            if (i<=n/2) 
            {
                space--;
                star++;   
            }
            else
            {
                space++;
                star--;
            }
            System.out.println();

        }
    }
}
