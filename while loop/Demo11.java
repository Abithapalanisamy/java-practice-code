public class Demo11 {
    public static void main(String[] args) {
        int num=15;
        int a=1;
        int sum=0;
        while(a<=num/2)
        {
            if(num%a==0)
            {
                sum=sum+a;
            }
            a++;
        }
        System.out.println("devisors sum is :"+sum);
    }
}

//sum of divisor: 9
