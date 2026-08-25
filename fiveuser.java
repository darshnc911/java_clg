import java.util.Scanner;

public class fiveuser{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

        System.out.println("\nThe 5 names are:");

        for (int i = 0; i < 5; i++) {
            System.out.println(names[i]);
        }
    }
}