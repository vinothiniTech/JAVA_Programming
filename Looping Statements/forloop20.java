import java.util.Scanner;

public class forloop20{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        double deposit=0, withdraw=0, transfer=0, payment=0;

        for(int i=1;i<=n;i++)
        {
            String type=sc.next();
            double amount=sc.nextDouble();

            String category;

            if(type.equals("Deposit")){
                category="Credit";
                deposit+=amount;
            }
            else if(type.equals("Withdrawal")){
                category="Debit";
                withdraw+=amount;
            }
            else if(type.equals("Transfer")){
                category="Debit";
                transfer+=amount;
            }
            else{
                category="Debit";
                payment+=amount;
            }

            System.out.println("Transaction "+i+": "+type);
            System.out.println("Amount: $"+amount);
            System.out.println("Category: "+category);
            System.out.println();
        }

        double net = deposit - (withdraw + transfer + payment);

        System.out.println("Total Transactions: "+n);
        System.out.println("Total Deposits: $"+deposit);
        System.out.println("Total Withdrawals: $"+withdraw);
        System.out.println("Total Transfers: $"+transfer);
        System.out.println("Total Payments: $"+payment);
        System.out.println("Net Balance Change: $"+net);
        sc.close();
    }
}