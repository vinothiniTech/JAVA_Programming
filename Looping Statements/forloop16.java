import java.util.Scanner;

public class forloop16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int pass=0, fail=0;
        int highest=0;
        int totalScore=0;

        for(int i=1;i<=n;i++)
        {
            String name=sc.next();
            int correct=sc.nextInt();
            int wrong=sc.nextInt();
            int un=sc.nextInt();

            int score=(correct*4)-(wrong*3);

            System.out.println("Student: "+name);
            System.out.println("Correct: "+correct);
            System.out.println("Wrong: "+wrong);
            System.out.println("Unattempted: "+un);
            System.out.println("Score: "+score);

            if(score>=32){
                System.out.println("Result: Pass");
                pass++;
            }
            else{
                System.out.println("Result: Fail");
                fail++;
            }

            if(score>highest)
                highest=score;

            totalScore+=score;

            System.out.println();
        }

        System.out.println("Total Students: "+n);
        System.out.println("Pass Count: "+pass);
        System.out.println("Fail Count: "+fail);
        System.out.println("Class Average: "+(totalScore/(double)n));
        System.out.println("Highest Score: "+highest);
        sc.close();
    }
}