public class demo15 {
    public static void main(String[] args) {
        char gender = 'F';
        int age = 30;
        if(gender=='M')
        {
            if (age>=21) 
            {
                System.out.println("ELIGIBLE BACHELOR");    
            }
            else
            {
                System.out.println("BOY UNDERAGE");
            }
        }
        else if (gender=='F') 
        {
            if(age>=18)
            {
                System.out.println("ELIGIBLE SPINSTER");
            }
            else
            {
                System.out.println("GIRL UNDERAGE");
            }   
        }
        else
        {
            System.out.println("INVALID GENDER");
        }
    }
}
