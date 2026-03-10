import java.util.Scanner;

public class forloop12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double totalRevenue = 0;
        int peakCount = 0;

        for(int i = 1; i <= n; i++) {

            String type = sc.next();
            double hours = sc.nextDouble();

            double rate = 0;
            double cap = 0;

            if(type.equals("Car")) {
                rate = 3;
                cap = 30;
            }
            else if(type.equals("Motorcycle")) {
                rate = 2;
                cap = 20;
            }
            else if(type.equals("Truck")) {
                rate = 5;
                cap = 60;
            }
            else if(type.equals("Bus")) {
                rate = 7;
                cap = 100;
            }

            double fee = hours * rate;
            String capApplied = "No";

            if(fee > cap) {
                fee = cap;
                capApplied = "Yes";
            }

            if(hours > 8) {
                peakCount++;
            }

            totalRevenue += fee;

            System.out.println("Vehicle " + i + ": " + type);
            System.out.println("Hours Parked: " + hours);
            System.out.println("Hourly Rate: $" + rate);
            System.out.println("Parking Fee: $" + fee);
            System.out.println("Cap Applied: " + capApplied);
            System.out.println();
        }

        double avg = totalRevenue / n;

        System.out.println("Total Vehicles: " + n);
        System.out.println("Total Revenue: $" + totalRevenue);
        System.out.printf("Average Fee: $%.2f\n", avg);
        System.out.println("Peak Hour Vehicles (>8 hours): " + peakCount);

        sc.close();
    }
}