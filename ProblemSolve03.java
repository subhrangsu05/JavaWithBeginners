// Q.1) Write a java program to convert string to lowercase
// Q.2) write a java program to replace spaces with underscores
// Q.3) write a java program to fill in a letter template which looks like below,
        // letter = "Dear <|name|>, Thanks a lot"
        // Replace the <|name|> with a string(some name)
// Q.4) Write a java program to detect double and triple spaces in a string
// Q.5) Write a program to format the following letter using escape sequence charcters.
        // letter = "Dear Subho, This java course is nice, Thanks"
public class ProblemSolve03 {
    public static void main(String[] args) {
        // Solution 1 ---->
        String strObj = new String("Subhrangsu");
        System.out.println(strObj.toLowerCase());

        // Solution 2 ----->
        String str1 = "  Subhr   angsu Si n ha";
        System.out.println(str1.replace("", "_"));

        // Solution 3 ---->
        System.out.println("Dear "+strObj+", Thanks a lot");

        // Solution 4 ---->
        System.out.println("Double space in index no: "+((str1.indexOf("  ")!=-1)?str1.indexOf("  "): "No double spaces detected"));
        System.out.println("Triple space in index no: "+((str1.lastIndexOf("   ")!=-1)?str1.lastIndexOf("  "): "No Triple spaces detected"));

        // Solution 5 ---->
        System.out.println("Dear Subho,\nThis java course is nice,\nThanks");

    }
}
