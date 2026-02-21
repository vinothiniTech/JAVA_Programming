import java.util.Scanner;
public class operator5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int salary = sc.nextInt();
        int creditScore = sc.nextInt();

        if (salary > 25000 && creditScore > 700) {
            System.out.println("Loan Approved");
        } else {
            System.out.println("Loan Rejected");
            sc.close();
        }
    }
}