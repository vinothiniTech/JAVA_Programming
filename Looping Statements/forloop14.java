import java.util.Scanner;

public class forloop14{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double totalFine = 0;
        int overdue = 0;

        for(int i=1;i<=n;i++)
        {
            String type = sc.next();
            int days = sc.nextInt();

            double rate=0, cap=0;

            if(type.equals("Regular")){
                rate=0.5;
                cap=10;
            }
            else if(type.equals("Reference")){
                rate=1.0;
                cap=20;
            }
            else if(type.equals("Magazine")){
                rate=0.25;
                cap=5;
            }

            double calcFine = rate * days;
            double actualFine = calcFine;

            if(calcFine > cap)
                actualFine = cap;

            if(days>0)
                overdue++;

            totalFine += actualFine;

            System.out.println("Book "+i+": "+type);
            System.out.println("Days Late: "+days);
            System.out.println("Daily Fine: $"+rate);
            System.out.println("Calculated Fine: $"+calcFine);
            System.out.println("Actual Fine: $"+actualFine);
            System.out.println("Cap Applied: "+(calcFine>cap?"Yes":"No"));
            System.out.println();
        }

        System.out.println("Total Books: "+n);
        System.out.println("Total Fines Collected: $"+totalFine);
        System.out.println("Books Overdue: "+overdue);
        System.out.println("Average Fine: $"+(totalFine/n));
        sc.close();
    }
}