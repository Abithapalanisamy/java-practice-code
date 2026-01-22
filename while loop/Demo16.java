public class Demo16 {
    public static void main(String[] args) {
        int num=5;
        int fib1 = 0;
        int fib2 = 1;
        int fib3 = fib1 + fib2;

        while (num>0)
        {
            System.out.println(fib1);

            fib1=fib2;
            fib2=fib3;
            fib3=fib1 + fib2;

            num--;
        }
    }
}
