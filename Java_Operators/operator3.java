import java.util.Scanner;
public class operator3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int workingHours = sc.nextInt();
        int attendance = sc.nextInt();

        if (workingHours > 40 && attendance > 90) {
            System.out.println("Bonus Eligible");
        } else {
            System.out.println("Not Eligible");
             sc.close();
        }
    }
}
    

