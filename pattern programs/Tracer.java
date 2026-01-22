public class Tracer {
    /*public static void main(String[] args) 
    {
        int j=0;
        System.out.println((char)'A'+j);
    }


    public static void main(String[] args) {
        int n=1;
        for(int i=0;i<=4;i++)
        {
            for(int j=0; j<=4; j++)
            {
                System.out.print(n+" ");
                n=n+1;
            }
            System.out.println();
        }
    }*/


    public static void main(String[] args) {
        for(int i=0; i<=4; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
