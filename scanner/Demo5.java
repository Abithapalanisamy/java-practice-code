import java.util.Scanner;
public class Demo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string value");
        String str = sc.nextLine();
        System.out.println("enter a char value");
        char ch=sc.next().charAt(0);
        System.out.println("entered value :"+str);
        System.out.println("char value :"+ch);
    }
    
}
//next()--only reads 1st word
//nextLine()--reads entire word