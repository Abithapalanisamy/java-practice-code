public class starpattern2 {
      public static void main(String[] args) {
        int n = 5; // number of lines
        
        for (int i = 0; i < n; i++) {
            // print spaces
            for (int j = 0; j < i; j++) {
                System.out.print("  "); // two spaces for proper alignment
            }
            // print stars
            for (int k = 0; k < (2 * (n - i) - 1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
