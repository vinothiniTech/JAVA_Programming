import java.util.Scanner;

public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    double gpa=sc.nextDouble();
    double familyInclome=sc.nextDouble();
    sc.nextLine();
    int extracurricularScore=sc.nextInt();
    String scholarshipType=sc.nextLine();
    sc.nextLine();

        if (gpa >= 2.5) {

        
            if (type == 1) {

                if (gpa >= 3.8 && extracurricular >= 80) {
                    System.out.println("Merit Scholarship: Full - $25000");
                }
                else if (gpa >= 3.5 && extracurricular >= 70) {
                    System.out.println("Merit Scholarship: Partial - $15000");
                }
                else if (gpa >= 3.0 && extracurricular >= 60) {
                    System.out.println("Merit Scholarship: Minimal - $8000");
                }
                else {
                    System.out.println("Not eligible for Merit Scholarship");
                }
            }

        
            else if (type == 2) {

                if (income <= 30000 && gpa >= 3.5) {
                    System.out.println("Need-Based Scholarship: Full - $30000");
                }
                else if (income <= 50000 && gpa >= 3.0) {
                    System.out.println("Need-Based Scholarship: Partial - $18000");
                }
                else if (income <= 70000 && gpa >= 2.8) {
                    System.out.println("Need-Based Scholarship: Minimal - $10000");
                }
                else {
                    System.out.println("Not eligible for Need-Based Scholarship");
                }
            }

            
            else if (type == 3) {

                if (extracurricular >= 85 && gpa >= 3.0) {
                    System.out.println("Sports Scholarship: Full - $22000");
                }
                else if (extracurricular >= 75 && gpa >= 2.8) {
                    System.out.println("Sports Scholarship: Partial - $20000");
                }
                else if (extracurricular >= 65 && gpa >= 2.5) {
                    System.out.println("Sports Scholarship: Minimal - $12000");
                }
                else {
                    System.out.println("Not eligible for Sports Scholarship");
                }
            }

            else {
                System.out.println("Invalid Scholarship Type");
            }
        }
        else {
            System.out.println("Not eligible. Minimum GPA should be 2.5");
        }

        sc.close();
    }
