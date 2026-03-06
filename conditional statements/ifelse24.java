import java.util.*;

public class ifelse24 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double distance = sc.nextDouble();
        double orderValue = sc.nextDouble();
        sc.nextLine();

        String timeSlot = sc.nextLine();
        String weather = sc.nextLine();

        double baseFee = 3.0;
        double distanceSurcharge = distance * 1.0;

        double peakSurcharge = 0;
        if(timeSlot.equals("Lunch")){
            peakSurcharge = 2.5;
        }
        else if(timeSlot.equals("Dinner")){
            peakSurcharge = 2.0;
        }
        else if(timeSlot.equals("Late-Night")){
            peakSurcharge = 1.5;
        }

        double weatherSurcharge = 0;
        if(weather.equals("Rain")){
            weatherSurcharge = 2;
        }
        else if(weather.equals("Snow")){
            weatherSurcharge = 3;
        }
        else if(weather.equals("Storm")){
            weatherSurcharge = 5;
        }

        double discount = 0;
        if(orderValue >= 30 && orderValue < 50){
            discount = 1;
        }
        else if(orderValue >= 50 && orderValue < 75){
            discount = 3;
        }
        else if(orderValue >= 75){
            discount = 5;
        }

        double finalFee = baseFee + distanceSurcharge + peakSurcharge + weatherSurcharge - discount;

        if(finalFee < 2.99){
            finalFee = 2.99;
        }

        int deliveryTime = (int)(distance * 8);

        if(timeSlot.equals("Lunch") || timeSlot.equals("Dinner")){
            deliveryTime += 10;
        }

        if(weather.equals("Rain")){
            deliveryTime += 5;
        }
        else if(weather.equals("Snow")){
            deliveryTime += 10;
        }
        else if(weather.equals("Storm")){
            deliveryTime += 15;
        }

        String priority;

        if(orderValue > 60){
            priority = "Express";
        }
        else if(timeSlot.equals("Lunch") || timeSlot.equals("Dinner")){
            priority = "High";
        }
        else{
            priority = "Standard";
        }

        System.out.println("Delivery Distance: " + distance + " miles");
        System.out.println("Order Value: $" + orderValue);
        System.out.println("Time Slot: " + timeSlot);
        System.out.println("Weather Condition: " + weather);
        System.out.println("Base Delivery Fee: $" + baseFee);
        System.out.println("Distance Surcharge: $" + distanceSurcharge);
        System.out.println("Peak Time Surcharge: $" + peakSurcharge);
        System.out.println("Weather Surcharge: $" + weatherSurcharge);
        System.out.println("Order Value Discount: $" + discount);
        System.out.println("Final Delivery Fee: $" + finalFee);
        System.out.println("Estimated Delivery Time: " + deliveryTime + " minutes");
        System.out.println("Service Priority: " + priority);

        sc.close();
    }
}