public class Demo10 {
    static boolean send()
    {
        return true;
    }
    static int receive()
    {
        return 4;
    }

    public static void main(String args[])
    {
        System.out.println("returned value :" + send());
        System.out.println("returned value :"+receive());
    }
}
