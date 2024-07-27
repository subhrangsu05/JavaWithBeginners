public class Chap_02_Datatype {
    public static void main(String[] args) {
        // Primitive DataTypes
        // DataType VaribaleName = Literal;
        String userName = "Subhrangsu Sinha";
        byte busNo = 61;
        short routeNo = 21;
        int age = 26;
        float weight = 50.25f;
        double salary = 18750.25d;
        long packageValue = 4568912164546146L;
        char sign = 's';
        boolean bool = true;
        System.out.println("Username: " + userName);
        System.out.println("busNo: " + busNo);
        System.out.println("routeNo: " + routeNo);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
        System.out.println("Salary: " + salary);
        System.out.println("Package Value: " + packageValue);
        System.out.println("Sign: " + sign);
        System.out.println("bool: " + bool);

        // Q. Write a java program to add three numbers
        byte num1 = 10, num2 = 20, num3 = 30;
        short sum = (short)(num1+num2+num3); 
        System.out.println("Sum result of three numbers is: "+sum);
    }
}