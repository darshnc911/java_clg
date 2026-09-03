import java.util.*;

public class Program22 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1};

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new LinkedHashSet<>();

        for (int num : arr) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        System.out.println("Duplicate elements: " + duplicates);
    }
}
