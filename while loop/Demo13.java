public class Demo13 {
        public static void main(String[] args) {
        int num=5;
        int a=1;
        int sum=0;
        while(a<=num/2)
        {
            if(num%a==0)
            {
                sum=sum+1;
            }
            a++;
        }
        if(sum==1)
        {
            System.out.println("prime number");
        }
        else{
            System.out.println("not a prime number");
        }
    }
}
