public class Demo9 {
    public static void main(String[] args) {
        int n=10;
        int fact=1; // because doing multiplication
        while (n>=1) {
            fact=fact*n;
            n--;
        }
        System.out.println(fact);
    }
}
//factorial of a number
//3628800