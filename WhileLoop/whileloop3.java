import java.util.Scanner;

public class whileloop3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int secretNumber = sc.nextInt();
        int guess = 0;
        int attempts = 0;

        while (guess != secretNumber) {

            System.out.print("Guess the number (1100): ");
            guess = sc.nextInt();
            attempts++;

            if (guess > secretNumber) {
                System.out.println("Too high!");
            }
            else if (guess < secretNumber) {
                System.out.println("Too low!");
            }
            else {
                System.out.println("Correct! Attempts: " + attempts);
                sc.close();
            }
        }
    }
}
