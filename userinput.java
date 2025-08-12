import java.util.Scanner;
public class userinput{

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number :");
        int marks = sc.nextInt();
        System.out.println(marks);

        System.out.println( "Enter the first number");
        int a = sc.nextInt();
        System.out.println( "Enter the second number :");
        int b = sc.nextInt();
        System.out.println("The sum of number is :" +(a+b));

    }
}
