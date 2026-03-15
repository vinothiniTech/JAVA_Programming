import java.util.Scanner;

public class whileloop6{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int balance = sc.nextInt();
        int amount;

        System.out.println("Balance: " + balance);

        do {
            System.out.print("Enter withdrawal amount: ");
            amount = sc.nextInt();

            if (amount > balance) {
                System.out.println("Insufficient funds! Try again.");
            }
            else if (amount <= 0) {
                System.out.println("Invalid amount! Try again.");
            }

        } while (amount > balance || amount <= 0);

        balance = balance - amount;

        System.out.println("Withdrawal successful! Remaining balance: " + balance);
        sc.close();
    }
}
