import java.util.Scanner;
public class Demo3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num 1 value :");
        double sum1=sc.nextDouble();
        System.out.println("enter num 2 value :");
        double sum2=sc.nextDouble();
        double result=sum1 +sum2;
        System.out.println("addition of two numbers is "+result);
    }
}
