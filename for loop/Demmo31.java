public class Demmo31 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i-1; j++){
                System.out.print("  ");
            }
            for(int k=i; k<=2*n-i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
