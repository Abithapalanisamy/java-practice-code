package ReturnValues;

class DemoA 
{
    static int test()
    {
        return 10;
    }
    public static void main(String[] args) 
    {
        int val=test();
        System.out.println(test());
        System.out.println(val);
    }
}
