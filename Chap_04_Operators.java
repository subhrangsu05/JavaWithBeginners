/*
    Arithmetic Operators ==> +,-,*,/,%,++,--
    Assignment Operators ==> =,+=,-=,*=,/=
    Comparison Operators ==> ==,>=,<=
    Logical Operators ==> &&, ||, !
    Bitwise Operators ==> &,|
 */
public class Chap_04_Operators {
    public static void main(String[] args) {
        // Arithmetic Operators ---->
        int a = 10, b = 20;
        System.out.printf("Sum: %d \n", (a + b));
        System.out.println("Sub: " + (a - b));
        System.out.format("Mul: %d \n", (a * b));
        System.out.println("Divide: " + (a / 2));
        ++a;
        System.out.printf("Prepand with Positive Iterator: %d \n",a);
        a++;
        System.out.printf("Append with Positive Iterator: %d \n",a);
        --a;
        System.out.printf("Prepand with Negative Iterator: %d \n",a);
        a--;
        System.out.printf("Prepand with Negative Iterator: %d \n",a);

        // Assignment Operators ---->
        int c = 125;
        int d = c ;
        System.out.println(d);
        d+=2;
        System.out.println(d);
        d-=1;
        System.out.println(d);
        d*=6;
        System.out.println(d);
        d/=2;
        System.out.println(d);
        // Comparison Operators ---->
        int x = 12, y = 14;
        boolean bool = true;
        System.out.println(x==y?true:false);
        System.out.println(14>=x?true:false);
        System.out.println(y<=12?true:false);
        // Logical Operators ---->
        System.out.println(x==y && x>0?true:false);
        System.out.println(x>=y || y>=x ?true:false);
        System.out.println(!bool?true:false);
        // Bitwise Operator ---->
        System.out.println(4&7);
    }
}
