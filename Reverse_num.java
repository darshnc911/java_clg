import java.util.Scanner;

public class Reverse_num
{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int n = sc.nextInt();

            int reverse=0;
            while (n != 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
            }
            System.out.println("The reverse of the number is: " + reverse);
        }
}