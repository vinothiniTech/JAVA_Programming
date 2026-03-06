import java.util.*;

public class ifelse25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double dataGB = sc.nextDouble();
        int callMinutes = sc.nextInt();
        sc.nextLine();

        String international = sc.nextLine();
        String device = sc.nextLine();

        String plan = "";
        double baseCost = 0;
        String category = "";

        if(dataGB <= 2){
            plan = "Basic 2GB";
            baseCost = 25;
            category = "Budget";
        }
        else if(dataGB <= 5){
            plan = "Standard 5GB";
            baseCost = 40;
            category = "Standard";
        }
        else if(dataGB <= 25){
            plan = "Premium Unlimited";
            baseCost = 70;
            category = "Premium";
        }
        else{
            plan = "Unlimited Max";
            baseCost = 90;
            category = "Unlimited";
        }

        double dataOverage = 0;

        if(plan.equals("Standard 5GB") && dataGB > 5){
            dataOverage = (dataGB - 5) * 10;
        }

        double callOverage = 0;

        if(callMinutes > 1000){
            callOverage = (callMinutes - 1000) * 0.02;
        }

        double internationalFee = 0;

        if(international.equals("Light")){
            internationalFee = 5;
        }
        else if(international.equals("Moderate")){
            internationalFee = 15;
        }
        else if(international.equals("Heavy")){
            internationalFee = 30;
        }

        double deviceFee = 0;

        if(device.equals("Smartphone") || device.equals("Tablet")){
            deviceFee = 10;
        }
        else if(device.equals("Hotspot")){
            deviceFee = 20;
        }

        double total = baseCost + dataOverage + callOverage + internationalFee + deviceFee;

        double savings = 0;
        if(plan.equals("Standard 5GB") && dataGB > 5){
            savings = 5;
        }

        System.out.println("Data Usage: " + dataGB + " GB");
        System.out.println("Call Minutes: " + callMinutes + " minutes");
        System.out.println("International Usage: " + international);
        System.out.println("Device Type: " + device);
        System.out.println("Recommended Plan: " + plan);
        System.out.println("Base Plan Cost: $" + baseCost);
        System.out.println("Data Overage: $" + dataOverage);
        System.out.println("Call Overage: $" + callOverage);
        System.out.println("International Fee: $" + internationalFee);
        System.out.println("Device Fee: $" + deviceFee);
        System.out.println("Total Monthly Cost: $" + total);
        System.out.println("Potential Savings: $" + savings);
        System.out.println("Plan Category: " + category);

        sc.close();
    }
}
