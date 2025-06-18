public class OddNumberPattern {
    public static void main(String[] args) {
        int rows = 5;
        int cols = 5;
        int num = 1; // Start with the first odd number

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(num + "\t");
                num += 2; // Move to the next odd number
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
