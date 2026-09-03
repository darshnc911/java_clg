import java.util.Scanner;

public class StudentBankSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Account creation
        System.out.print("Enter Student Name: ");
        String studentName = sc.nextLine();

        System.out.print("Enter Student ID: ");
        String studentId = sc.nextLine();

        System.out.print("Enter Account Number: ");
        long accountNumber = sc.nextLong();

        System.out.print("Enter Initial Deposit Amount: ");
        double balance = sc.nextDouble();

        // Validate initial deposit
        while (balance <= 0) {
            System.out.println("Initial deposit must be greater than 0.");
            System.out.print("Enter Initial Deposit Amount: ");
            balance = sc.nextDouble();
        }

        System.out.println("Account created successfully!");

        int choice;

        // Main menu
        do {
            System.out.println("\n========== STUDENT BANK SYSTEM ==========");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Display Account Details");
            System.out.println("5. Calculate Interest");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                // Deposit
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double deposit = sc.nextDouble();

                    if (deposit <= 0) {
                        System.out.println("Deposit amount must be greater than 0.");
                    } else {
                        balance += deposit;
                        System.out.println("Deposit successful.");
                        System.out.println("Current Balance: ₹" + balance);
                    }
                    break;

                // Withdraw
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawal = sc.nextDouble();

                    if (withdrawal <= 0) {
                        System.out.println("Withdrawal amount must be greater than 0.");
                    } else if (withdrawal > balance) {
                        System.out.println("Insufficient balance.");
                    } else {
                        balance -= withdrawal;
                        System.out.println("Withdrawal successful.");
                        System.out.println("Current Balance: ₹" + balance);
                    }
                    break;

                // Check balance
                case 3:
                    System.out.println("Current Balance: ₹" + balance);
                    break;

                // Account details
                case 4:
                    System.out.println("\n========== ACCOUNT DETAILS ==========");
                    System.out.println("Student Name  : " + studentName);
                    System.out.println("Student ID    : " + studentId);
                    System.out.println("Account Number: " + accountNumber);
                    System.out.println("Balance       : ₹" + balance);
                    break;

                // Calculate interest
                case 5:
                    System.out.print("Enter number of years: ");
                    double years = sc.nextDouble();

                    if (years <= 0) {
                        System.out.println("Number of years must be greater than 0.");
                    } else {
                        double rate = 5.0;

                        // Simple Interest = P × R × T / 100
                        double interest = (balance * rate * years) / 100;
                        double newBalance = balance + interest;

                        System.out.println("Interest Earned: ₹" + interest);
                        System.out.println("New Balance: ₹" + newBalance);
                    }
                    break;

                // Exit
                case 6:
                    System.out.println("Thank you for using Student Bank System!");
                    break;

                // Invalid choice
                default:
                    System.out.println("Invalid choice. Please enter 1-6.");
            }

        } while (choice != 6);

        sc.close();
    }
}