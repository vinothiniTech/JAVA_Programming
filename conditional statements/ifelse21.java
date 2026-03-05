import java.util.*;

public class ifelse21{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String zone = sc.nextLine();
        double hours = sc.nextDouble();
        sc.nextLine();
        String vehicle = sc.nextLine();
        String membership = sc.nextLine();

        double baseRate = 5.0;
        double zonePremium = 0;
        double vehicleSurcharge = 0;
        double discount = 0;
        double dailyCap = 0;
        String rateCategory = "";
        String capApplied = "No";

        
        if(zone.equals("Downtown")){
            zonePremium = 50;
            dailyCap = 150;
            rateCategory = "Premium";
        }
        else if(zone.equals("Business-District")){
            zonePremium = 30;
            dailyCap = 120;
            rateCategory = "Premium";
        }
        else if(zone.equals("Residential")){
            zonePremium = 0;
            dailyCap = 60;
            rateCategory = "Standard";
        }
        else if(zone.equals("Airport")){
            zonePremium = 100;
            dailyCap = 180;
            rateCategory = "Luxury";
        }

        
        if(vehicle.equals("Motorcycle")){
            vehicleSurcharge = -2;
        }
        else if(vehicle.equals("Compact")){
            vehicleSurcharge = 0;
        }
        else if(vehicle.equals("Sedan")){
            vehicleSurcharge = 0;
        }
        else if(vehicle.equals("SUV")){
            vehicleSurcharge = 3;
        }
        else if(vehicle.equals("Oversized")){
            vehicleSurcharge = 5;
        }

        
        if(membership.equals("None")){
            discount = 0;
        }
        else if(membership.equals("Monthly")){
            discount = 20;
        }
        else if(membership.equals("Annual")){
            discount = 25;
        }
        else if(membership.equals("VIP")){
            discount = 30;
        }

        
        double rawFee = (baseRate * (1 + zonePremium/100) + vehicleSurcharge) * hours;


        double finalFee = rawFee * (1 - discount/100);

    
        if(hours >= 24){
            if(finalFee > dailyCap){
                finalFee = dailyCap;
                capApplied = "Yes";
            }
        }

        System.out.println("Location Zone: " + zone);
        System.out.println("Parking Duration: " + hours + " hours");
        System.out.println("Vehicle Type: " + vehicle);
        System.out.println("Membership Status: " + membership);
        System.out.println("Base Hourly Rate: $" + baseRate);
        System.out.println("Zone Premium: " + (int)zonePremium + "%");
        System.out.println("Vehicle Size Surcharge: $" + vehicleSurcharge);
        System.out.println("Membership Discount: " + (int)discount + "%");
        System.out.println("Total Parking Fee: $" + finalFee);
        System.out.println("Daily Cap Applied: " + capApplied);
        System.out.println("Rate Category: " + rateCategory);
        sc.close();
    }
}
