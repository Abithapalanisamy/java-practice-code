public class Demo10 {

    public static void main(String[] args) 
    {
         int val = 60;
        if(val %2==0 && val%3==0)
        {
            System.out.println("BANGALORE");
        }
        else if(val %2 ==0)
        {
            System.out.println("HYDERABAD");
        }
        else if (val%3==0) 
        {
            System.out.println("COCHIN");
        }
        else 
        {
            System.out.println("CHENNAI");
        }
    }
}
