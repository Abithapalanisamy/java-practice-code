public class Demo15 {
    public static void main(String[] args) {
        int n=5;
        int fib1 = 0;
        int fib2 = 1;

        if(n==1)
        {
            System.out.println(fib1);
            return;
        }else if(n==2){
            System.out.println(fib2);
            return;
        }

        while (n>2)
        {
            int temp = fib2;
            fib2 = fib1 + fib2;
            fib1= temp;
            n--;
        }
        System.out.println(fib1);
    }
}
