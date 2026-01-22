public class prime {
    static void isprime(int n) {
        int a = 2;
        int count = 0;

        while (a <= n / 2) {
            if (n % a == 0) {
                count++;
                break;
            }
            a++;
        }

        if (count == 0 && n > 1) {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        int n = 100;
        for (int i = 1; i <= n; i++) {
            isprime(i);
        }
    }
}
