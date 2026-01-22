public class Demo13a {
    public static void main(String[] args) {
        int num=6;
        int a=1;
        int sum=0;
        while(a<=num/2)
        {
            if(num%a==0)
            {
                sum=sum+1;
            }
            a++;//count of divisors
        }
        System.out.println(sum);
    }
}
