import java.util.Scanner;

public class forloop11{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n = sc.nextInt();

        double originalTotal = 0;
        double finalTotal = 0;

        for (int i = 1; i <= n; i++) {

            String seatType = sc.next();
            String customerType = sc.next();

            double basePrice = 0;
            double discount = 0;


            if (seatType.equals("Regular")) {
                basePrice = 12;
            } 
            else if (seatType.equals("Premium")) {
                basePrice = 18;
            } 
            else if (seatType.equals("Recliner")) {
                basePrice = 25;
            }

            
            if (customerType.equals("Child")) {
                discount = 30;
            } 
            else if (customerType.equals("Senior")) {
                discount = 25;
            } 
            else {
                discount = 0;
            }

            double finalPrice = basePrice * (1 - discount / 100);

            originalTotal += basePrice;
            finalTotal += finalPrice;

            System.out.println("Ticket " + i + ": " + seatType + " - " + customerType);
            System.out.println("Base Price: $" + basePrice);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Final Price: $" + finalPrice);
            System.out.println();
        }

        boolean groupDiscount = false;

        if (n >= 5) {
            finalTotal = finalTotal * 0.9; 
            groupDiscount = true;
        }

        double totalDiscount = originalTotal - finalTotal;

        System.out.println("Total Tickets: " + n);
        System.out.println("Original Total: $" + originalTotal);
        System.out.println("Total Discount: $" + totalDiscount);
        System.out.println("Final Total: $" + finalTotal);
        System.out.println("Group Discount Applied: " + (groupDiscount ? "Yes" : "No"));
        sc.close();
    }
}
