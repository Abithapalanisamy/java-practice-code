public class Demo16 {
    public static void main(String[] args) {
        int n=5;
        char val='a';
        for(int i=0; i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                System.out.print(val+" ");
                val++; //increament in same row
            }
            System.out.println();
            val='a'; //reinitialization -- every row start with 1
        }
    }
}
/*
a b c d e 
a b c d e 
a b c d e 
a b c d e 
a b c d e 
 */