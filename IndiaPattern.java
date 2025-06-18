public class IndiaPattern {
    public static void main(String[] args) {
        String word = "INDIA";

        for (int i = 1; i <= word.length(); i++) {
            System.out.println(word.substring(0, i));
        }
    }
}
