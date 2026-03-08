import java.util.Scanner;

public class forloop3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int lowStock = 0;
        int critical = 0;
        int totalReorder = 0;

        for(int i = 1; i <= n; i++) {

            String name = sc.next();
            int current = sc.nextInt();
            int min = sc.nextInt();

            int reorder = 0;
            String status;

            if(current >= min) {
                status = "Adequate";
                reorder = 0;
            }
            else if(current >= min/2) {
                status = "Low Stock";
                reorder = (min - current) + (min/2);
                lowStock++;
            }
            else {
                status = "Critical";
                reorder = (min - current) + (int)(min * 1.5);
                critical++;
            }

            totalReorder = totalReorder + reorder;

            System.out.println("Product: " + name);
            System.out.println("Current Stock: " + current);
            System.out.println("Minimum Stock: " + min);
            System.out.println("Status: " + status);
            System.out.println("Reorder Quantity: " + reorder);
            System.out.println();
        }

        System.out.println("Total Products: " + n);
        System.out.println("Low Stock Items: " + lowStock);
        System.out.println("Critical Items: " + critical);
        System.out.println("Total Reorder Quantity: " + totalReorder);
        sc.close();
    }
}
