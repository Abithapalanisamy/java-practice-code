public class Demo14 {
    public static void main(String[] args) {
        int num=10;
        int f1=0;
        int f2=1;
        int f3=f1+f2;
        while(num>0)
        {
            System.out.println(f1);
            f1=f2;
            f2=f3;
            f3=f1+f3;
            num--;
        }
    }
}
 