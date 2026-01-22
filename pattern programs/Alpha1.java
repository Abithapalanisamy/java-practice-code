public class Alpha1 {
    public static void main(String[] args) 
    {
        for (int i = 0; i <= 4; i++) 
        {     
            for (int j = 0; j < 5; j++) 
            {          
                char c=(char)('A'+j);   //default value of 'A' is 65-- we're converting 65 into 'A' by including (char)
                System.out.print(c+" ");
            }
            System.out.println();           
        }
    }
}
