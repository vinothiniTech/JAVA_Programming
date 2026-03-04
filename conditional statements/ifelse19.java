import java.util.Scanner;

public class ifelse19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String movieFormat = sc.nextLine();
        String showTime = sc.nextLine();
        String seatCategory = sc.nextLine();
        String customerType = sc.nextLine();

        double basePrice = 12.0;
        double formatSurcharge = 0;
        double seatUpgrade = 0;
        double timeAdjustment = 0;
        double customerDiscount = 0;
        String concessionVoucher = "No";
        String pricingCategory = "";

        
        if (movieFormat.equals("2D")) formatSurcharge = 0;
        else if (movieFormat.equals("3D")) formatSurcharge = 5;
        else if (movieFormat.equals("IMAX")) formatSurcharge = 8;
        else if (movieFormat.equals("4DX")) formatSurcharge = 10;

    
        if (seatCategory.equals("Standard")) seatUpgrade = 0;
        else if (seatCategory.equals("Premium")) seatUpgrade = 4;
        else if (seatCategory.equals("Recliner")) seatUpgrade = 7;

        
        if (showTime.equals("Matinee")) timeAdjustment = -30;
        else if (showTime.equals("Evening")) timeAdjustment = 0;
        else if (showTime.equals("Prime-Time")) timeAdjustment = 20;
        else if (showTime.equals("Late-Night")) timeAdjustment = -20;

        
        if (customerType.equals("Adult")) customerDiscount = 0;
        else if (customerType.equals("Senior")) customerDiscount = 25;
        else if (customerType.equals("Student")) customerDiscount = 15;
        else if (customerType.equals("Child")) customerDiscount = 30;

        
        if (showTime.equals("Matinee") || 
            customerType.equals("Senior") || 
            customerType.equals("Student") || 
            customerType.equals("Child")) {
            concessionVoucher = "Yes";
        }

        double baseWithSurcharges = basePrice + formatSurcharge + seatUpgrade;
        double adjustedPrice = baseWithSurcharges * (1 + timeAdjustment / 100);
        double finalPrice = adjustedPrice * (1 - customerDiscount / 100);

        
        if (finalPrice < 10) pricingCategory = "Value";
        else if (finalPrice < 20) pricingCategory = "Standard";
        else if (finalPrice < 30) pricingCategory = "Premium";
        else pricingCategory = "Luxury";

        
        System.out.println("Movie Format: " + movieFormat);
        System.out.println("Show Time: " + showTime);
        System.out.println("Seat Category: " + seatCategory);
        System.out.println("Customer Type: " + customerType);
        System.out.println("Base Ticket Price: $" + basePrice);
        System.out.println("Format Surcharge: $" + formatSurcharge);
        System.out.println("Seat Upgrade Fee: $" + seatUpgrade);
        System.out.println("Time-Based Adjustment: " + (int)timeAdjustment + "%");
        System.out.println("Customer Discount: " + (int)customerDiscount + "%");
        System.out.printf("Final Ticket Price: $%.2f\n", finalPrice);
        System.out.println("Concession Voucher: " + concessionVoucher);
        System.out.println("Pricing Category: " + pricingCategory);

        sc.close();
    }
}