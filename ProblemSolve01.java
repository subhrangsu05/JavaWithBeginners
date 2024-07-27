// Q.1) Write a program to calculate percentage of a given student in CBSE board exam. His marks from 5 subjects must be taken as input from the keyboard (marks are out of 100).

// Q.2) Write a java program to convert KM to M.

// Q.3) Write a java program to detect whether a number entered by user is integer or not! 
import java.util.Scanner;
public class ProblemSolve01 {
    public static void main(String[]args){
        // Solution 1 -->
        Scanner studentInput = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String studentName = studentInput.nextLine();
        System.out.print("Enter the marks in Math: ");
        byte mathMarks = studentInput.nextByte();
        System.out.print("Enter the marks in English: ");
        byte englishMarks = studentInput.nextByte();
        System.out.print("Enter the marks in Computer: ");
        byte computerMarks = studentInput.nextByte();
        System.out.print("Enter the marks in Chemistry: ");
        byte chemistryMarks = studentInput.nextByte();
        System.out.print("Enter the marks in Physics: ");
        byte physicsMarks = studentInput.nextByte();
        System.out.println("-------------------------------------------------------------");
        int cgpa = mathMarks+englishMarks+computerMarks+chemistryMarks+physicsMarks;
        System.out.println("Hi Mr. "+studentName+", You are "+((cgpa/5)>=30?"PASSED":"FAILED"));
        
        // Solution 2 -->
        Scanner userInput1 = new Scanner(System.in);
        System.out.print("Please enter your KM range: ");
        float kilometer = userInput1.nextFloat();
        System.out.println("Meter will be: "+(kilometer*1000)+" Meter");

        // Solution 3 -->
        Scanner userInput2 = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        boolean validation = userInput2.hasNextInt();
        System.out.println("User given input is: "+(validation==true?" an Integer":" not an Integer"));
        studentInput.close();
        userInput1.close();
        userInput2.close();
    }
}