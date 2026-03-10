import java.util.Scanner;

public class forloop18 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        double total=0;
        double high=-1000, low=1000;
        int highHour=0, lowHour=0;
        int hot=0, cold=0;

        for(int i=1;i<=n;i++)
        {
            int hour=sc.nextInt();
            double temp=sc.nextDouble();

            String status="Normal";

            if(temp>40 || temp<0)
                status="Extreme";
            else if(temp>=32){
                status="Hot";
                hot++;
            }
            else if(temp<=10){
                status="Cold";
                cold++;
            }

            if(temp>high){
                high=temp;
                highHour=hour;
            }

            if(temp<low){
                low=temp;
                lowHour=hour;
            }

            total+=temp;

            System.out.println("Hour "+hour+": "+temp+"°C");
            System.out.println("Status: "+status);
            System.out.println();
        }

        System.out.println("Total Readings: "+n);
        System.out.println("Average Temperature: "+(total/n)+"°C");
        System.out.println("Highest Temperature: "+high+"°C at Hour "+highHour);
        System.out.println("Lowest Temperature: "+low+"°C at Hour "+lowHour);
        System.out.println("Hot Hours: "+hot);
        System.out.println("Cold Hours: "+cold);
        sc.close();
    }
}
