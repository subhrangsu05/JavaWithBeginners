// Q.1) What will be the result of the following expression
            // float a = 7/4*9/2
// Q.2) Write a java program to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade.
// Q.3) Use comparison operators to find out whether a given number is greater than the user entered number or not!
// Q.4) Write the following expression in a java program;
            // (v^2-u^2)/2b5
// Q.5) Find out the value of the following expression:
            // int x = 7; int c = 7*49/7+35/7; Find the value of c =? 
import java.util.Scanner;
import java.util.Random;
public class ProblemSolve02 {
    public static void main(String[] args) {
        // Solution 1 ---->
        float a = 7/4.0f*9/2.0f;
        System.out.println(a);

        // Solution 2 ---->
        char grade = 'B';
        System.out.println((grade+=8.0)+"The number encrypted with  8: "+(char)grade);
        System.out.println((grade-=8.0)+"The number decrypted with  8: "+(char)grade);

        // Solution 3 ---->
        Scanner obj = new Scanner(System.in);
        Random rand = new Random();
        int randInteger = rand.nextInt(11);
        int num = 0;
        do{
            System.out.print("Enter the number: ");
            num = obj.nextInt();
            if(num>randInteger){
                System.out.println("your value is greater than random number");
            }
            else if(num<randInteger){
                System.out.println("your value is lesser than random number");
            }
            else{
                System.out.println("Yea, You're correct. The number is: "+randInteger);
            }
        }while(num!=randInteger);
        obj.close();

        // Solution 4 ---->
        int v = 20, u = 10, b = 5;
        System.out.println("The Solution of Expression is: "+(Math.pow(v,2)-Math.pow(u,2))/(2*b*5));

        // Solution 5 ---->
        int c = 7*49/7+35/7;
        System.out.println("The result of the expression: "+c);
    }
}
