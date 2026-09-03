import java.util.*;

public class Program16 {
    public static void main(String[] args) {
        String str = "hello world";

        HashMap<Character, Integer> count = new HashMap<>();

        for (char ch : str.toCharArray()) {
            if (ch != ' ') {
                count.put(ch, count.getOrDefault(ch, 0) + 1);
            }
        }

        System.out.println("Character frequency:");

        for (Map.Entry<Character, Integer> entry : count.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
