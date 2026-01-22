public class Demo7 {
    static int test()
    {
        return 10;
    }
    public static void main (String args[]){
        int val=test();
        System.out.println("returned value: "+val);
        System.out.println("returned value: "+test());
    }
}
