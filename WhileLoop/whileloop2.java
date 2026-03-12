import java.util.Scanner;

public class whileloop2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;
        int sum = 0;
        int count = 0;

        num = sc.nextInt();

        while (num != 0) {
            sum = sum + num;
            count++;

            System.out.print("Enter number: ");
            num = sc.nextInt();
        }

        System.out.println("Total sum: " + sum);
        System.out.println("Count: " + count);

        sc.close();
    }
}