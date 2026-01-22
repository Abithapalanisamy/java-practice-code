public class Demo17 {
    public static void main(String[] args) {
        int n=5;
        int val=5;
        for(int i=0; i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                System.out.print(val+" ");
                val--; //increament in same row
            }
            System.out.println();
            val=5; //reinitialization -- every row start with 1
        }
    }
    
}
/*
5 4 3 2 1 
5 4 3 2 1 
5 4 3 2 1 
5 4 3 2 1 
5 4 3 2 1 
 */