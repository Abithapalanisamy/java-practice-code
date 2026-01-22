public class demo14 {
    public static void main(String[] args) {
        double balance = 10000.0;
        int amt = 1000;
        if(amt<=balance)
        {
            if (amt%100 == 0) 
            {
                System.out.println("withdrawal success !");    
            }
            else
            {
                System.out.println("Invalid Denomination !!");
            }
        }
        else
        {
            System.out.println("insufficient balance!!");
        }
    }
}