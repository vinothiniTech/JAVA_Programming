import java.util.Scanner;
public class operator2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int accountBalance = sc.nextInt();
        int withdrawalAmount = sc.nextInt();
        int dailyLimit = sc.nextInt();

        if (withdrawalAmount <= accountBalance && withdrawalAmount <= dailyLimit) {
            System.out.println("Transaction Approved");
        } else {
            System.out.println("Transaction Declined");
            sc.close();
        }
    }
}