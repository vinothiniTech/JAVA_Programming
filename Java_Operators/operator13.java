import java.util.Scanner;

public class operator13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int connectionValue = sc.nextInt();
        int mask = sc.nextInt();

        if ((connectionValue & mask) != 0) {
            System.out.println("Appliance Active");
        } else {
            System.out.println("Appliance Inactive");
            sc.close();
        }
    }
}
