public class Demo18 {
    public static void main(String[] args) {
        int option = 2;
        switch (option) {
            case 1: System.out.println("withdrawal");
            break;
            case 2: System.out.println("balance enquiry");
            break;
            case 3: System.out.println("PIN change");
            break;
            case 4: System.out.println("mini statement");
            break;
            default: System.out.println("invalid option selected");
        }
    }
}
