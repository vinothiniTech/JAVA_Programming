import java.util.Scanner;

public class ifelse22 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int units = sc.nextInt();
        sc.nextLine();
        String type = sc.nextLine();
        String season = sc.nextLine();
        String payment = sc.nextLine();

        double r1=0,r2=0,r3=0,r4=0;

        
        if(type.equals("Residential")){
            r1=0.10; r2=0.15; r3=0.25; r4=0.30;
        } 
        else if(type.equals("Commercial")){
            r1=0.12; r2=0.18; r3=0.25; r4=0.25;
        } 
        else{
            r1=0.08; r2=0.12; r3=0.20; r4=0.20;
        }

        double t1=0,t2=0,t3=0,t4=0;

        if(units>0){
            if(units<=100){
                t1 = units*r1;
            }
            else if(units<=300){
                t1 = 100*r1;
                t2 = (units-100)*r2;
            }
            else if(units<=500){
                t1 = 100*r1;
                t2 = 200*r2;
                t3 = (units-300)*r3;
            }
            else{
                t1 = 100*r1;
                t2 = 200*r2;
                t3 = 200*r3;
                t4 = (units-500)*r4;
            }
        }

        double total = t1+t2+t3+t4;

        
        if(season.equals("Summer")){
            total = total*1.15;
        }
        else if(season.equals("Winter")){
            total = total*0.90;
        }

        
        if(payment.equals("Auto-Pay")){
            total = total*0.95;
        }
        else if(payment.equals("Online")){
            total = total*0.97;
        }

        double avg = total/units;

        System.out.println("Units Consumed: "+units+" kWh");
        System.out.println("Customer Type: "+type);
        System.out.println("Season: "+season);
        System.out.println("Payment Method: "+payment);
        System.out.println("Tier 1 Cost (0-100): $"+t1);
        System.out.println("Tier 2 Cost (101-300): $"+t2);
        System.out.println("Tier 3 Cost (301-500): $"+t3);
        System.out.println("Tier 4 Cost (501+): $"+t4);
        System.out.println("Total Bill: $"+total);
        System.out.println("Average Rate: $"+avg+"/kWh");
        sc.close();
    }
}
