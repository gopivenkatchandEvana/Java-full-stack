public class NumberSquare {
    public static void main(String[] args) {
        int size = 5;

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
