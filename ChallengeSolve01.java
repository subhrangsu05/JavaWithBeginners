import java.util.Random;
import java.util.Scanner;
public class ChallengeSolve01 {
    public static void main(String[] args) {
        Scanner scObj = new Scanner(System.in);
        Random randObj = new Random();
        int randInteger = randObj.nextInt(4);
        String compInput = "";
        switch (randInteger) {
            case 1 -> compInput = "Scissors";
            case 2 -> compInput = "Rock";
            case 3 -> compInput = "Paper";
            default -> System.out.println("Random Number Generation Failed");
        }
        String userStringInput = "";
        do {
            System.out.println("1 stands for Scissor\n2 stands for Rock\n3 stands for Paper ");
            System.out.format("Please enter your input: ");
            byte userInput = scObj.nextByte();
            switch (userInput) {
                case 1 -> userStringInput = "Scissors";
                case 2 -> userStringInput = "Rock";
                case 3 -> userStringInput = "Paper";
                default -> System.out.println("User didn't put their input");
            }
            if (!compInput.equals(userStringInput)) {
                System.out.println("Try Again!");
            }
        } while (!compInput.equals(userStringInput));
        System.out.println("It's a tie! Both chose " + userStringInput);
        scObj.close();
    }
}
