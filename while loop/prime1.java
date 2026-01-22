public class prime1 {
    public static void main(String[] args) 
    {
    int num=100;
    int a=1;
    while(a<=num/2)
    {
        if(num%a==0)
        {
            System.out.println(a);
        }
        a++;
    }   
    }
}
// prints factoril of the number