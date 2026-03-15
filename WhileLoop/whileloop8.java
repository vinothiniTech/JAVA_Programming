import java.util.Scanner;

public class whileloop8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int temp = number;
        int sum = 0;

        while (temp > 0) {
            sum = sum + (temp % 10);
            temp = temp / 10;
        }

        System.out.println("Number: " + number);
        System.out.println("Sum of digits: " + sum);
        sc.close();
    }
}
