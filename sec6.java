import java.util.Scanner;

public class sec6 {
   public static void main(String[] var0) {
      Scanner sc = new Scanner(System.in);
      int var2 = sc.nextInt();
      if (var2 % 2 == 0) {
         System.err.println("even");
      } else {
         System.out.println("odd");
      }

   }
}