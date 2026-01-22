public class Alpha3 {
    public static void main(String[] args) {
        for(int i=0;i<=5;i++)
        {
            for(int j=0;j<=i;j++)
            {
                char c=(char)('a'+j);
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}
