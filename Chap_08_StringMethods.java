public class Chap_08_StringMethods {
    public static void main(String[]args){
        String str1 = "Subhrangsu Sinha";
        String strObj1 = new String("Sinha Subhrangsu");
        System.out.println(str1);
        System.out.println(strObj1);
        System.out.println(str1.length());
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());
        String str2 = "    Subhrangsu   ";
        System.out.println(str2.length());
        System.out.println(str2.trim().length());
        for(int i=0;i<str1.length();i++){
            System.out.println(str1.charAt(i));
        }
        System.out.println(str1.substring(2,str1.length()-3));
        System.out.println(str1.replace('s', 'z'));
        System.out.println(str1.startsWith("Subh"));
        System.out.println(str1.endsWith("ha"));
        System.out.println(str1.charAt(5));
        System.out.println(str1.indexOf('s'));
        System.out.println(str1.toLowerCase().indexOf('s',9));
        System.out.println(str1.lastIndexOf('s'));
        System.out.println(str1.toLowerCase().lastIndexOf('s',9));
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println("Hi, I\'m subhrangsu.\nI\'m working at CTS.\nWhich is worst company\t.\\");
    }
}
