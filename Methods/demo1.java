public class demo1 {
    static void test() //make static bcoz main method is static
    {
        System.out.println("hello buddy");
    }

    public static void main(String[] args) {
        System.out.println("started");
        test(); //method call
        System.out.println("ended");
    }
}
