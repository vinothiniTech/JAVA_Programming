import java.util.Scanner;

public class ifelse12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int driverAge = sc.nextInt();
        sc.nextLine();
        String vehicleType = sc.nextLine();
        String drivingRecord = sc.nextLine();
        String coverageLevel = sc.nextLine();

        double basePremium = 0;
        double ageFactor = 1.0;
        double vehicleFactor = 1.0;
        double recordAdjustment = 0;

    
        if (coverageLevel.equals("Basic")) {
            basePremium = 500;
        } else if (coverageLevel.equals("Standard")) {
            basePremium = 800;
        } else {
            basePremium = 1500;
        }

    
        if (driverAge >= 16 && driverAge <= 21) {
            ageFactor = 1.8;
        } else if (driverAge <= 25) {
            ageFactor = 1.5;
        } else if (driverAge <= 40) {
            ageFactor = 1.0;
        } else if (driverAge <= 60) {
            ageFactor = 0.9;
        } else {
            ageFactor = 1.1;
        }

        
        if (vehicleType.equals("Sedan")) {
            vehicleFactor = 1.0;
        } else if (vehicleType.equals("SUV")) {
            vehicleFactor = 1.2;
        } else if (vehicleType.equals("Sports")) {
            vehicleFactor = 1.5;
        } else {
            vehicleFactor = 1.1;
        }

    
        if (drivingRecord.equals("Clean")) {
            recordAdjustment = -10;
        } else if (drivingRecord.equals("Minor-Violations")) {
            recordAdjustment = 25;
        } else {
            recordAdjustment = 50;
        }

        
        double adjustedPremium = basePremium * ageFactor * vehicleFactor;
        double finalPremium = adjustedPremium * (1 + recordAdjustment / 100);
        double monthlyPremium = finalPremium / 12;

        
        String riskCategory;

        if (finalPremium < 1000) {
            riskCategory = "Low";
        } else if (finalPremium < 2500) {
            riskCategory = "Medium";
        } else if (finalPremium < 5000) {
            riskCategory = "High";
        } else {
            riskCategory = "Very High";
        }

        
        System.out.println("Driver Age: " + driverAge);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Driving Record: " + drivingRecord);
        System.out.println("Coverage Level: " + coverageLevel);
        System.out.println("Base Premium: $" + basePremium);
        System.out.println("Age Factor: " + ageFactor + "x");
        System.out.println("Vehicle Risk Factor: " + vehicleFactor + "x");
        System.out.println("Record Adjustment: " + recordAdjustment + "%");
        System.out.printf("Monthly Premium: $%.2f\n", monthlyPremium);
        System.out.println("Annual Premium: $" + finalPremium);
        System.out.println("Risk Category: " + riskCategory);

        sc.close();
    }
}