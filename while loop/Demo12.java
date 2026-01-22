public class Demo12 {
    public static void main(String[] args) {
        int num=28;
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
        if(sum==num)
        {
            System.out.println("perfect number");
        }
        else{
            System.out.println("not perfect");
        }
    }
}
