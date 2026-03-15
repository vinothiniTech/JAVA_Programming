import java.util.Scanner;

public class whileloop7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice = 0;
        int a, b;

        System.out.println("Calculator Menu:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Exit");

        while (choice != 5) {

            System.out.print("Choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter two numbers: ");
                a = sc.nextInt();
                b = sc.nextInt();
                System.out.println("Result: " + (a + b));
            }

            else if (choice == 2) {
                System.out.print("Enter two numbers: ");
                a = sc.nextInt();
                b = sc.nextInt();
                System.out.println("Result: " + (a - b));
            }

            else if (choice == 3) {
                System.out.print("Enter two numbers: ");
                a = sc.nextInt();
                b = sc.nextInt();
                System.out.println("Result: " + (a * b));
            }

            else if (choice == 4) {
                System.out.print("Enter two numbers: ");
                a = sc.nextInt();
                b = sc.nextInt();
                System.out.println("Result: " + (a / b));
            }

            else if (choice == 5) {
                System.out.println("Goodbye!");
            }

            else {
                System.out.println("Invalid choice!");
                
                sc.close();
            }
        }
    }
}
