import java.util.HashMap;

public class Program19{
    public static void main(String[] args) {
        String str = "hello";

        HashMap<Character, Integer> frequency = new HashMap<>();

        for (char ch : str.toCharArray()) {
            frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
        }

        System.out.println("Character frequency:");

        for (char ch : frequency.keySet()) {
            System.out.println(ch + " : " + frequency.get(ch));
        }
    }
}
