import java.util.Scanner;

public class ifelse4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String loyaltyTier = sc.nextLine();
        double cartValue = sc.nextDouble();
        sc.nextLine(); 

        String productCategory = sc.nextLine();
        String membershipStatus = sc.nextLine();

        double baseDiscount = 0;
        double additionalDiscount = 0;

         if (loyaltyTier.equalsIgnoreCase("Bronze")) {
            baseDiscount = 5;
        } 
        else if (loyaltyTier.equalsIgnoreCase("Silver")) {
            baseDiscount = 8;
        } 
        else if (loyaltyTier.equalsIgnoreCase("Gold")) {
            baseDiscount = 12;
        } 
        else if (loyaltyTier.equalsIgnoreCase("Platinum")) {
            baseDiscount = 15;
        }

        
        if (cartValue >= 500 && cartValue <= 999) {
            additionalDiscount += 3;
        } 
        else if (cartValue >= 1000 && cartValue <= 1999) {
            additionalDiscount += 5;
        } 
        else if (cartValue >= 2000) {
            additionalDiscount += 7;
        }


        if (productCategory.equalsIgnoreCase("Electronics")) {
            if (membershipStatus.equalsIgnoreCase("Prime")) {
                additionalDiscount += 5;
            }
        } 
        else if (productCategory.equalsIgnoreCase("Fashion")) {
            additionalDiscount += 3;
        } 
        else if (productCategory.equalsIgnoreCase("Books")) {
            if (membershipStatus.equalsIgnoreCase("Prime")) {
                additionalDiscount += 5;
            }
        } 
        else if (productCategory.equalsIgnoreCase("Groceries")) {
            if (cartValue > 300) {
                additionalDiscount += 2;
            }
        }

        
        double totalDiscount = baseDiscount + additionalDiscount;
        double finalPrice = cartValue * (1 - totalDiscount / 100);
        double savings = cartValue - finalPrice;

    
        System.out.println("Loyalty Tier: " + loyaltyTier);
        System.out.println("Cart Value: $" + cartValue);
        System.out.println("Product Category: " + productCategory);
        System.out.println("Membership: " + membershipStatus);
        System.out.println("Base Discount: " + (int)baseDiscount + "%");
        System.out.println("Additional Discount: " + (int)additionalDiscount + "%");
        System.out.println("Total Discount: " + (int)totalDiscount + "%");
        System.out.println("Final Price: $" + finalPrice);
        System.out.println("Savings: $" + savings);

        sc.close();
    }
}
