package Day_08;
public class Program23 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6};
        int n = 6;

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        int missing = expectedSum - actualSum;

        System.out.println("Missing number: " + missing);
    }
}
