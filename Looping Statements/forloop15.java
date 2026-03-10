import java.util.Scanner;

public class forloop15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double totalDistance=0;
        double totalRevenue=0;

        for(int i=1;i<=n;i++)
        {
            double distance = sc.nextDouble();
            String time = sc.next();

            double base = 3;
            double distanceCharge = distance;
            double surcharge = 0;

            if(time.equals("Evening"))
                surcharge = 3;
            else if(time.equals("Night"))
                surcharge = 5;

            double total = base + distanceCharge + surcharge;

            totalDistance += distance;
            totalRevenue += total;

            System.out.println("Ride "+i);
            System.out.println("Distance: "+distance+" km");
            System.out.println("Time: "+time);
            System.out.println("Base Fare: $"+base);
            System.out.println("Distance Charge: $"+distanceCharge);
            System.out.println("Time Surcharge: $"+surcharge);
            System.out.println("Total Fare: $"+total);
            System.out.println();
        }

        System.out.println("Total Rides: "+n);
        System.out.println("Total Distance: "+totalDistance+" km");
        System.out.println("Total Revenue: $"+totalRevenue);
        System.out.println("Average Fare: $"+(totalRevenue/n));
        sc.close();
    }
}
