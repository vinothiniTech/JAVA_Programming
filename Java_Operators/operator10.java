import java.util.Scanner;

public class operator10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int units = sc.nextInt();
        int fluctuation = sc.nextInt();

        if (units > 500 || fluctuation == 1) {
            System.out.println("Alert Triggered");
        } else {
            System.out.println("Normal Usage");
            sc.close();
        }
    }
}