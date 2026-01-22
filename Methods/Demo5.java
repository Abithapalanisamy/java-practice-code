public class Demo5 {
    static void test(double arg) //declaration -- formal argument
    {
        System.out.println(arg);
    }

    public static void main(String[] args) {
        test(25.90); // actual argument
        test(45.78);
        test(34);
        test(.78);
    }
}
