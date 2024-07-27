import java.util.Scanner;

public class Chap_03_UserInput {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        // Getting user name
        System.out.print("Tell me your name, please! ");
        String userName = userInput.nextLine();
        
        // Getting birth year and calculating age
        System.out.print("Please enter your birth year: ");
        int birthYear = userInput.nextInt();
        int age = 2024 - birthYear;
        
        // Getting weight
        System.out.print("Please enter your weight: ");
        float weight = userInput.nextFloat();
        
        // Getting salary
        System.out.print("Please enter your salary: ");
        long salary = userInput.nextLong();
        
        // Getting satisfaction
        System.out.print("Are you happy with this salary? ");
        userInput.nextLine(); // Consume the newline character left by nextLong()
        String satisfactionInput = userInput.nextLine();
        boolean satisfaction = satisfactionInput.equalsIgnoreCase("yes");
        
        // Closing the scanner
        userInput.close();
        
        // Displaying the collected information
        System.out.println("Your name is: " + userName);
        System.out.println("Your age is: " + age);
        System.out.println("Your weight is: " + weight);
        System.out.println("Your annual salary is: " + salary);
        System.out.println("Are you satisfied? " + (satisfaction ? "Yes" : "No"));
    }
}