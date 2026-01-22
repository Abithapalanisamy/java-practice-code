public class Demo8 {
    public static void main(String[] args) {
        int a=1;
        int b=10;
        int sum=0; // because doing add/sub
        while (a<=b) {
            if(a%2==0)
            {
                sum=sum+a;
            }
            a++;
        }
        System.out.println(sum);
    }
}
// even number's count