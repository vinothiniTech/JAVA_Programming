import java.util.Scanner;

public class ifelse17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        String cardTier = sc.nextLine();
        String purchaseCategory = sc.nextLine();
        double transactionAmount = sc.nextDouble();
        sc.nextLine(); 
        String promotionalStatus = sc.nextLine();

        double baseRate = 1.0;
        double categoryBonus = 1.0;
        double tierMultiplier = 1.0;
        double promotionalMultiplier = 1.0;
        String rewardsTier = "";

        
        if (purchaseCategory.equals("Groceries")) {
            categoryBonus = 2.0;
        } else if (purchaseCategory.equals("Dining")) {
            categoryBonus = 2.5;
        } else if (purchaseCategory.equals("Travel")) {
            categoryBonus = 3.0;
        } else if (purchaseCategory.equals("Gas")) {
            categoryBonus = 2.0;
        } else {
            categoryBonus = 1.0;
        }

        if (cardTier.equals("Basic")) {
            tierMultiplier = 1.0;
            rewardsTier = "Standard";
        } else if (cardTier.equals("Gold")) {
            tierMultiplier = 1.25;
            rewardsTier = "Enhanced";
        } else if (cardTier.equals("Platinum")) {
            tierMultiplier = 1.5;
            rewardsTier = "Premium";
        } else if (cardTier.equals("Black")) {
            tierMultiplier = 2.0;
            rewardsTier = "Elite";
        }

    
        if (promotionalStatus.equals("Double-Points")) {
            promotionalMultiplier = 2.0;
        } else if (promotionalStatus.equals("Triple-Points")) {
            promotionalMultiplier = 3.0;
        } else {
            promotionalMultiplier = 1.0;
        }

        
        double pointsEarned = transactionAmount * baseRate * categoryBonus * tierMultiplier * promotionalMultiplier;
        double cashValue = pointsEarned * 0.01;


        System.out.println("Card Tier: " + cardTier);
        System.out.println("Purchase Category: " + purchaseCategory);
        System.out.println("Transaction Amount: $" + transactionAmount);
        System.out.println("Promotional Status: " + promotionalStatus);
        System.out.println("Base Points Rate: " + baseRate + " points per dollar");
        System.out.println("Category Bonus: " + categoryBonus + "x");
        System.out.println("Tier Multiplier: " + tierMultiplier + "x");
        System.out.println("Promotional Multiplier: " + promotionalMultiplier + "x");
        System.out.println("Points Earned: " + pointsEarned);
        System.out.printf("Equivalent Cash Value: $%.2f\n", cashValue);
        System.out.println("Rewards Tier: " + rewardsTier);

        sc.close();
    }
}