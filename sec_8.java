import java.util.*;


public class sec_8 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
    
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        for (int i =1;i<11;i++){
            int table = num*i;
            System.err.println(num+"X"+i+"="+table);
        };
        

    }
}