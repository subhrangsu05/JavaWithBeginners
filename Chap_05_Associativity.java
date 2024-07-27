public class Chap_05_Associativity {
    public static void main(String[]args){
        short a = 6*5-34/2;
        short b = 6/5-34*2;
        System.out.println(a);
        System.out.println(b);

        // Quick Quiz:-
        float x = 20F, y = 10F;
        System.out.println((x-y)/2);
        float b1 = 5F, a1 = 10F, c1 = 15F;
        System.out.println(Math.pow(b1,2)-(4*a1*c1)/(2*a1));
        float v = 10,u = 20;
        System.out.println(Math.pow(v,2)-Math.pow(u,2));
        float a2=1F,b2=2F,c2=3F;
        System.out.println(a2*b2-c2);
    }
}
