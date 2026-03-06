import java.util.*;

public class ifelse23 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int stockPercentage = sc.nextInt();
        int investmentYears = sc.nextInt();
        sc.nextLine();

        String riskTolerance = sc.nextLine();
        String marketVolatility = sc.nextLine();

        int bondPercentage = 100 - stockPercentage;

        int score = stockPercentage;

        if (investmentYears >= 1 && investmentYears <= 5) {
            if (stockPercentage > 50) {
                score += 20;
            }
        } 
        else if (investmentYears >= 6 && investmentYears <= 10) {
            if (stockPercentage > 60) {
                score += 10;
            }
        } 
        else if (investmentYears >= 11 && investmentYears <= 20) {
            if (stockPercentage > 80) {
                score += 5;
            }
        }

        if (marketVolatility.equalsIgnoreCase("Medium")) {
            score += 10;
        } 
        else if (marketVolatility.equalsIgnoreCase("High")) {
            score += 20;
        }

        String riskCategory;

        if (score <= 30) {
            riskCategory = "Low";
        } 
        else if (score <= 60) {
            riskCategory = "Moderate";
        } 
        else if (score <= 80) {
            riskCategory = "High";
        } 
        else {
            riskCategory = "Very High";
        }

        String alignment;

        if (riskTolerance.equalsIgnoreCase("Conservative")) {
            if (riskCategory.equals("Low")) {
                alignment = "Well Aligned";
            } 
            else if (riskCategory.equals("Moderate")) {
                alignment = "Acceptable";
            } 
            else {
                alignment = "Misaligned";
            }
        } 
        else if (riskTolerance.equalsIgnoreCase("Moderate")) {
            if (riskCategory.equals("Moderate")) {
                alignment = "Well Aligned";
            } 
            else if (riskCategory.equals("Low") || riskCategory.equals("High")) {
                alignment = "Acceptable";
            } 
            else {
                alignment = "Misaligned";
            }
        } 
        else {
            if (riskCategory.equals("High") || riskCategory.equals("Very High")) {
                alignment = "Well Aligned";
            } 
            else if (riskCategory.equals("Moderate")) {
                alignment = "Acceptable";
            } 
            else {
                alignment = "Misaligned";
            }
        }

        String recommendation;
        String rebalance;

        if (alignment.equals("Well Aligned")) {
            recommendation = "Portfolio is appropriately balanced for your profile";
            rebalance = "No action needed";
        } 
        else if (alignment.equals("Acceptable")) {
            recommendation = "High risk level acceptable given long horizon and tolerance";
            rebalance = "Monitor closely, consider slight reduction if volatility persists";
        } 
        else {
            if (riskTolerance.equalsIgnoreCase("Conservative")) {
                recommendation = "Portfolio risk significantly exceeds tolerance level";
                rebalance = "Reduce stocks to 30-40%, increase bonds and cash";
            } 
            else {
                recommendation = "Portfolio is too conservative for your risk tolerance";
                rebalance = "Increase stocks to 80-90% for better growth potential";
            }
        }

        System.out.println("Stock Allocation: " + stockPercentage + "%");
        System.out.println("Bond Allocation: " + bondPercentage + "%");
        System.out.println("Investment Horizon: " + investmentYears + " years");
        System.out.println("Risk Tolerance: " + riskTolerance);
        System.out.println("Market Volatility: " + marketVolatility);
        System.out.println("Portfolio Risk Score: " + score + "/100");
        System.out.println("Risk Category: " + riskCategory);
        System.out.println("Alignment Status: " + alignment);
        System.out.println("Recommendation: " + recommendation);
        System.out.println("Suggested Rebalancing: " + rebalance);

        sc.close();
    }
}