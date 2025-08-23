import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          
          System.out.println("Enter first integer: ");
          float num1 = sc.nextFloat();
          System.out.println("Enter second integer: ");
          float num2 = sc.nextFloat();
          sc.nextLine();
          System.out.print("Enter an arithmetic operator ");
          String input = sc.nextLine();
          
          if (input.equals("+")) {
            System.out.println("your sum is "+(num1+num2));
          }
          else if(input.equals("-")){
            System.out.println("your subtract is " + (num1-num2));
          }
          else if(input.equals("*")){
            System.out.println("your product is " + (num1*num2));
          }
          else if(input.equals("/")){
            System.out.println("your division is " + (num1/num2));
          }
          else{
            System.out.println("enter correct operator");
          }

    }
}
