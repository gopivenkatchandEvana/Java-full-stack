public class CustomNumberPattern {
    public static void main(String[] args) {
        int rows = 5;
        int cols = 5;
        int start = 1;

        for (int i = 1; i <= rows; i++) {
            int num = start;

            for (int j = 1; j <= cols; j++) {
                System.out.print(num);

                num++;
                if (num > 9) {
                    num = 1; // wrap after 9
                }
            }

            System.out.println();

            start += 1;      // move to next starting digit
            if (start > 9) {
                start = 1;   // wrap start after 9
            }
        }
    }
}
