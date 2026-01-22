import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age :");
        int age=sc.nextInt();
        System.out.println("enter your height :");
        double height=sc.nextDouble();
        System.out.println("are u married (true/false) :");
        boolean married = sc.nextBoolean();
        System.out.println("Age :"+age);
        System.out.println("Height :"+height);
        System.out.println("Married :"+married);
    }
}
