import java.util.Scanner;

public class forloop19 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int active=0, expiring=0, expired=0;

        for(int i=1;i<=n;i++)
        {
            String id=sc.next();
            String type=sc.next();
            int used=sc.nextInt();

            int period=0;

            if(type.equals("Electronics"))
                period=12;
            else if(type.equals("Appliance"))
                period=24;
            else
                period=36;

            int remain=period-used;
            if(remain<0)
                remain=0;

            String status;

            if(remain==0){
                status="Expired";
                expired++;
            }
            else if(remain<=3){
                status="Expiring Soon";
                expiring++;
            }
            else{
                status="Active";
                active++;
            }

            System.out.println("Product ID: "+id);
            System.out.println("Type: "+type);
            System.out.println("Warranty Period: "+period+" months");
            System.out.println("Months Used: "+used);
            System.out.println("Remaining: "+remain+" months");
            System.out.println("Status: "+status);
            System.out.println();
        }

        System.out.println("Total Products: "+n);
        System.out.println("Active Warranties: "+active);
        System.out.println("Expiring Soon: "+expiring);
        System.out.println("Expired Warranties: "+expired);
        sc.close();
    }
}