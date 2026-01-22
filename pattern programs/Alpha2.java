public class Alpha2 {
    public static void main(String[] args) {
        for(int i=0;i<=5;i++)
        {
            for(int j=0;j<=i;j++)
            {
                char c=(char)('a'+i);
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}
