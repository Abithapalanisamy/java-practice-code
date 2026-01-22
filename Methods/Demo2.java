public class Demo2 {
    public static void main(String[] args) {
        System.out.println("started");
        test(); //method call 'n' times
        test();
        test();
        test();
        System.out.println("ended");
    }

    static void test() //make static bcoz main method is static
    {
        System.out.println("hello buddy");
    }
}
