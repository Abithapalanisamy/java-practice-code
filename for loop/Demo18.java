public class Demo18 {
    public static void main(String[] args) {
        int n= 5;
        for(int i=0;i<n;i++) //row
        {
            for(int j=0;j<n;j++) //column
            {
                if(j%2==0) // to do change in column , we choose j
                {
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
/*
1 0 1 0 1 
1 0 1 0 1
1 0 1 0 1
1 0 1 0 1
1 0 1 0 1
 */