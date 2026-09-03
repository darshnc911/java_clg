public class Program25{
    public static void main(String[] args) {
        String sentence = "Java programming is interesting";

        String[] words = sentence.split(" ");
        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        System.out.println("Longest word: " + longestWord);
    }
}
