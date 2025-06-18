public class SolidSquare {
    public static void main(String[] args) {
        int size = 5;  // number of rows and columns

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
