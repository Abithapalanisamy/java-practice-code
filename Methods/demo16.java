public class demo16 {
    static void factorial(int n, int fact)
    {
        fact= fact*n;
        if(n>1)
        {
            n--;
            factorial(n,fact);
        }
        else
        {
            System.out.println("factorial :"+fact);
        }
    }
    public static void main(String[] args) {
        factorial(5, 1);
    }
}
