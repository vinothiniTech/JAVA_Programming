import java.util.Scanner;

public class ifelse8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String locationTier = sc.nextLine();
        int squareFootage = sc.nextInt();
        int propertyAge = sc.nextInt();
        int amenityScore = sc.nextInt();

        double basePricePerSqFt = 0;
        double ageAdjustment = 0;
        double amenityBonus = 0;

        
        if (locationTier.equals("Prime")) {
            basePricePerSqFt = 400;
        } else if (locationTier.equals("Urban")) {
            basePricePerSqFt = 300;
        } else if (locationTier.equals("Suburban")) {
            basePricePerSqFt = 180;
        } else if (locationTier.equals("Rural")) {
            basePricePerSqFt = 100;
        }

        double baseValue = squareFootage * basePricePerSqFt;

    
        if (propertyAge >= 0 && propertyAge <= 5) {
            ageAdjustment = 0;
        } else if (propertyAge <= 10) {
            ageAdjustment = -5;
        } else if (propertyAge <= 15) {
            ageAdjustment = -10;
        } else if (propertyAge <= 25) {
            ageAdjustment = -15;
        } else if (propertyAge <= 30) {
            ageAdjustment = -20;
        } else if (propertyAge <= 40) {
            ageAdjustment = -25;
        } else {
            ageAdjustment = -35;
        }

        double adjustedValue = baseValue * (1 + ageAdjustment / 100);


        if (amenityScore >= 80) {
            amenityBonus = baseValue * 0.10;
        } else if (amenityScore >= 60) {
            amenityBonus = baseValue * 0.05;
        } else if (amenityScore >= 40) {
            amenityBonus = baseValue * 0.02;
        } else {
            amenityBonus = 0;
        }

        double finalValue = adjustedValue + amenityBonus;

        
        String marketCategory;
        if ((locationTier.equals("Prime") || locationTier.equals("Urban")) && propertyAge < 15) {
            marketCategory = "Hot";
        } else if (locationTier.equals("Suburban")) {
            marketCategory = "Stable";
        } else {
            marketCategory = "Slow";
        }

    
        System.out.println("Location Tier: " + locationTier);
        System.out.println("Square Footage: " + squareFootage + " sq ft");
        System.out.println("Property Age: " + propertyAge + " years");
        System.out.println("Amenity Score: " + amenityScore);
        System.out.println("Base Price Per Sq Ft: $" + basePricePerSqFt);
        System.out.println("Age Adjustment: " + ageAdjustment + "%");
        System.out.println("Amenity Bonus: $" + amenityBonus);
        System.out.println("Estimated Property Value: $" + finalValue);
        System.out.println("Market Category: " + marketCategory);

        sc.close();
    }
}
