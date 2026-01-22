public class Demo11 {
    public static void main(String[] args) {
        int n = 5;
        for(int i=0; i<n; i++) //control no of rows
        {
            for(int j=0; j<n; j++) // controls no of columns
            {
                System.out.print("* ");
            }
            System.out.println(); //next line
        }
    }
}
/* 
* * * * * 
* * * * * 
* * * * * 
* * * * * 
* * * * *
 */