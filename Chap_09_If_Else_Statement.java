import java.util.Scanner;
public class Chap_09_If_Else_Statement {
    public static void main(String[]args){
        Scanner scObj = new Scanner(System.in);
        System.out.print("Enter the age: ");
        byte age = scObj.nextByte();
        if(age>18 && age<60){
            System.out.println("You can Drive");
        }
        else{
            System.out.println("You can't Drive");
        }
        scObj.nextLine();
        System.out.print("Enter your name: ");
        String name = scObj.next();
        if(!name.isEmpty()){
            System.out.println("Hey "+name+", Whatsup!");
        }
        else{
            System.out.println("Pls enter your name");
        }
        scObj.close();
    }
}