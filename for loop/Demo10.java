public class Demo10 {
    public static void main(String[] args) {
        int n=5;
        int val=1 ;
        for (int i=0; i<n; i++)
        {
            if(i%2==0)
            {
                System.out.print(val+" ");
                val=val+2;
            }
            else
            {
                System.out.print("2 ");
            }
        }
    }
}
//1 2 3 4 5