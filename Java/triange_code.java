class Main {
    public static void main(String[] args) {
        int n = 4; // Number of rows
for (int i = 1; i <= n-1; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) { // Spaces depend on the row number
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
        
        for (int i = n; i >= 1; i--) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
    }
}
