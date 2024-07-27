public class Chap_06_TypeCasting {
    public static void main(String[]args){
        int a = 654 + 6;
        float b = (float)a;
        String num = Integer.toString(a);
        System.out.println(((Object)b).getClass().getName());
        System.out.println(((Object)num).getClass().getName());
        for(int i=0;i<num.length();i++){
            System.out.println(num.charAt(i));
        }
    }
}
