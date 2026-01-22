public class Demo11 {
    static boolean verify(int num)
    
    {
        if(num%2==0)
        {
            return true;
        }
        else{
            return false;
        }
    }

    public static void main (String args[]){
        System.out.println("status :"+verify(10));
        System.out.println("status :"+verify(15));
    }
}
