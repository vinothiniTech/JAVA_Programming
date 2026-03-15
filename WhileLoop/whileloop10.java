import java.util.Scanner;

public class whileloop10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i = 2;
        boolean prime = true;

        while (i <= Math.sqrt(n)) {
            if (n % i == 0) {
                prime = false;
                break;
            }
            i++;
        }

        if (prime)
            System.out.println(n + " is prime");
        else
            System.out.println(n + " is not prime");
        sc.close();
    }
}
