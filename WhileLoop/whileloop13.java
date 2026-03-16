import java.util.Scanner;

public class whileloop13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int original = num;
        int count = 0;
        int temp = num;

        
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }

        temp = num;
        int sum = 0;

        
        while (temp != 0) {
            int digit = temp % 10;
            int power = 1;
            int i = 0;

            
            while (i < count) {
                power = power * digit;
                i++;
            }

            sum = sum + power;
            temp = temp / 10;
        }

    
        if (sum == original) {
            System.out.println(original + " is an Armstrong number");
        } else {
            System.out.println(original + " is not an Armstrong number");
        }
      sc.close();
    }
}
