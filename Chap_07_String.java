import java.util.Scanner;
public class Chap_07_String {
    public static void main(String[]args){
        String myName = "Subhrangsu Sinha";
        System.out.println(myName);
        String strObject = new String("Sinha Subhrangsu");
        System.out.print(strObject+"\n");
        myName = "Hello World!";
        System.out.printf("%s \n",myName);

        Scanner scObj = new Scanner(System.in);
        String myString1 = scObj.nextLine();
        System.out.println(myString1);
        Long sal = scObj.nextLong();
        System.out.println(sal);
        scObj.nextLine();
        String myString2 = scObj.nextLine();
        System.out.println(myString2);
        scObj.close();
    }
}
