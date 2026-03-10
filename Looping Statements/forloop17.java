import java.util.Scanner;

public class forloop17 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        double totalRevenue=0;
        int urgent=0;

        for(int i=1;i<=n;i++)
        {
            String name=sc.next();
            String type=sc.next();
            int days=sc.nextInt();

            double fee=0;

            if(type.equals("Basic"))
                fee=50;
            else if(type.equals("Premium"))
                fee=100;
            else
                fee=200;

            int discount=0;

            if(days>=45)
                discount=20;
            else if(days>=30)
                discount=15;
            else if(days>=15)
                discount=10;

            double finalFee=fee*(1-discount/100.0);

            String priority;

            if(days<10){
                priority="Urgent";
                urgent++;
            }
            else if(days<=30)
                priority="High";
            else
                priority="Normal";

            totalRevenue+=finalFee;

            System.out.println("Member: "+name);
            System.out.println("Membership: "+type);
            System.out.println("Days Until Expiry: "+days);
            System.out.println("Renewal Fee: $"+fee);
            System.out.println("Discount: "+discount+"%");
            System.out.println("Final Fee: $"+finalFee);
            System.out.println("Priority: "+priority);
            System.out.println();
        }

        System.out.println("Total Members: "+n);
        System.out.println("Urgent Renewals: "+urgent);
        System.out.println("Total Renewal Revenue: $"+totalRevenue);
        System.out.println("Average Renewal Fee: $"+(totalRevenue/n));
        sc.close();
    }
}