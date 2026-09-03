import java.util.*;

public class Program26 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};

        int index = 0;

        // Move non-zero elements to the front
        for (int num : arr) {
            if (num != 0) {
                arr[index++] = num;
            }
        }

        // Fill remaining positions with zeros
        while (index < arr.length) {
            arr[index++] = 0;
        }

        System.out.println("Array after moving zeros: " + Arrays.toString(arr));
    }
}
