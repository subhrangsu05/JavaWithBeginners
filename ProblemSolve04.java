
/* Q.1) What will be the output of this below program:
            int a = 10;
            if(a=11){
                System.out.println("I'm 11");
            }
            else{
                System.out.println("I'm not 11");
            }
    Q.2) Write a program to find out whether a student is pass or fail; if it requires total 40% and at least 33% in each subject to pass. Assume 3 subjects and take marks as an input from the user.

    Q.3) Calculate income tax paid by an employee to the government as per the slots mentioned below:
                    Income Slots            Tax
                    2.5L - 5.0L             5%
                    5.0L - 10.0L            20%
                    Above 10.0L             30%
         Note: There is no tax below 2.5L. Take input as amount from the user
    
    Q.4) Write a java program to find out the day of the week given the number [1 for Monday]
*/
import java.util.Scanner;

public class ProblemSolve04 {
    public static void main(String[] args) {
        // Solution 1 ---->
        // It throws an syntax error
        Scanner scObj = new Scanner(System.in);

        // Solution 2 ---->
        System.out.println("Enter the student name: ");
        String studentName = scObj.nextLine();
        System.out.println("Enter the marks of english: ");
        byte english = scObj.nextByte();
        System.out.println("Enter the marks of math: ");
        byte math = scObj.nextByte();
        System.out.println("Enter the marks of computer: ");
        byte computer = scObj.nextByte();
        float totalPercentage = (english + math + computer) / 3;
        if (totalPercentage >= 40 && english >= 33 && math >= 33 && computer >= 33) {
            System.out.println("Hey " + studentName + ", you are pass");
        } else {
            System.out.println("Sorry " + studentName + ", you're fail");
        }

        // Solution 3 ---->
        scObj.nextLine();
        System.out.println("Please enter your employee name: ");
        String employeeName = scObj.nextLine();
        System.out.println("Please enter your annual package: ");
        Long annualPackage = scObj.nextLong();
        if (annualPackage >= 250000 && annualPackage <= 500000) {
            System.out.println("Hi " + employeeName + ", you have to pay your tax around " + (annualPackage * 5 / 100));
        } else if (annualPackage > 500000 && annualPackage <= 1000000) {
            System.out
                    .println("Hi " + employeeName + ", you have to pay your tax around " + (annualPackage * 20 / 100));
        } else if (annualPackage > 1000000) {
            System.out
                    .println("Hi " + employeeName + ", you have to pay your tax around " + (annualPackage * 30 / 100));
        } else {
            System.out.println("You're not eligible for the tax regime");
        }

        // Solution 4 ---->
        System.out.println("Enter the week day no: ");
        byte weekDays = scObj.nextByte();
        switch (weekDays) {
            case 1 -> System.out.println("MUHN day");
            case 2 -> System.out.println("TYOOZ day");
            case 3 -> System.out.println("WENDZ day");
            case 4 -> System.out.println("THURZ day");
            case 5 -> System.out.println("FRY day");
            case 6 -> System.out.println("SAT-uhr day");
            default -> System.out.println("SUHN day");
        }
        scObj.close();
    }
}
