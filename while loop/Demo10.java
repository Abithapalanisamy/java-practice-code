public class Demo10 {
    public static void main(String[] args) {
        int num=21;
        int a=1;
        while(a<=num/2)
        {
            if(num%a==0)
            {
                System.out.println(a);
            }
            a++;//DIVISORS
        }
    }
}
// print factorial num from 1 to 21
/*
1
3
7
 */