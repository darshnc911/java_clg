public class Program24 {
    public static void main(String[] args) {
        String sentence = "Java is easy";

        String[] words = sentence.split(" ");

        System.out.print("Reversed words: ");

        for (String word : words) {
            String reversed = "";

            for (int i = word.length() - 1; i >= 0; i--) {
                reversed += word.charAt(i);
            }

            System.out.print(reversed + " ");
        }
    }
}
