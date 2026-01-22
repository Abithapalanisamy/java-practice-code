public class Demo11 {
    public static void main(String[] args) {
        int age=90;
        if(age<=3)
        {
            System.out.println("free ticket");
        }
        else if (age>3 && age<=10) {
            System.out.println("half ticket");
        }
        else if (age > 10 && age < 60) {
            System.out.println("full ticket");
        }
        else 
        {
            System.out.println("senior citizenship");
        }
    }
}
