import java.util.Scanner;

public class Chap_10_SwitchStatement {
    public static void main(String[] args) {
        Scanner scObj = new Scanner(System.in);
        System.out.print("Enter the day no: ");
        byte dayNo = scObj.nextByte();
        switch(dayNo){
            case 1: System.out.println("It\'s Sunday");
                    break;
            case 2: System.out.println("It\'s Monday");
                    break;
            case 3: System.out.println("It\'s Tuesday");
                    break;
            case 4: System.out.println("It\'s Wednesday");
                    break;
            case 5: System.out.println("It\'s Thursday");
                    break;
            case 6: System.out.println("It\'s Friday");
                    break;
            default: System.out.println("It\'s Saturday");
        }
        scObj.close();
    }
}
