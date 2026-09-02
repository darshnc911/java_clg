import java.util.Scanner;

public class SmartTrafficAnalyzer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter Vehicle Number: ");
        String vehicleNumber = sc.nextLine();

        System.out.print("Enter Vehicle Speed (km/h): ");
        int speed = sc.nextInt();

        System.out.print("Enter Speed Limit (km/h): ");
        int speedLimit = sc.nextInt();

        System.out.print("Enter Driver Age: ");
        int age = sc.nextInt();

        System.out.print("Is Helmet Valid? (true/false): ");
        boolean helmet = sc.nextBoolean();

        System.out.print("Is Seat Belt Used? (true/false): ");
        boolean seatBelt = sc.nextBoolean();

        System.out.print("Does Driver Have Valid License? (true/false): ");
        boolean license = sc.nextBoolean();

        System.out.print("Is it an Emergency Vehicle? (true/false): ");
        boolean emergency = sc.nextBoolean();

        // Variables
        int fine = 0;
        int violationFlags = 0;
        int excessSpeed = speed - speedLimit;

        String speedStatus;
        String helmetStatus;
        String seatBeltStatus;
        String licenseStatus;
        String riskLevel;

        // Speed check
        if (speed > speedLimit && !emergency) {
            speedStatus = "OVER SPEED";
            fine += 2000;
            violationFlags++;
        } else {
            speedStatus = "NORMAL";
        }

        // Helmet check
        if (!helmet && !emergency) {
            helmetStatus = "VIOLATION";
            fine += 1000;
            violationFlags++;
        } else {
            helmetStatus = "VALID";
        }

        // Seat belt check
        if (!seatBelt && !emergency) {
            seatBeltStatus = "VIOLATION";
            fine += 500;
            violationFlags++;
        } else {
            seatBeltStatus = "VALID";
        }

        // License check
        if (!license) {
            licenseStatus = "VIOLATION";
            fine += 2000;
            violationFlags++;
        } else {
            licenseStatus = "VALID";
        }

        // Age check
        if (age < 18) {
            fine += 500;
            violationFlags++;
        }

        // Risk level
        if (violationFlags >= 3 || fine >= 3000) {
            riskLevel = "HIGH";
        } else if (violationFlags == 2 || fine >= 1000) {
            riskLevel = "MEDIUM";
        } else {
            riskLevel = "LOW";
        }

        // Output
        
        System.out.println("Vehicle Number   : " + vehicleNumber);
        System.out.println("Speed            : " + speed + " km/h");
        System.out.println("Speed Limit      : " + speedLimit + " km/h");
        System.out.println("Excess Speed     : " +
                (excessSpeed > 0 ? excessSpeed : 0) + " km/h");

        System.out.println();

        System.out.println("Speed Status     : " + speedStatus);
        System.out.println("Helmet Status    : " + helmetStatus);
        System.out.println("Seat Belt Status : " + seatBeltStatus);
        System.out.println("License Status   : " + licenseStatus);

        System.out.println();
        System.out.println("Total Fine       : ₹" + fine);
        System.out.println("Risk Level       : " + riskLevel);
        System.out.println("Violation Flags  : " + violationFlags);
        sc.close();
    }
}