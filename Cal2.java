import java.util.Scanner;

public class Cal2 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

          System.out.println("******************************************CALCULATOR****************************************");
          System.out.println("Enter first integer: ");
          float num1 = sc.nextFloat();
          System.out.println("Enter second integer: ");
          float num2 = sc.nextFloat();
          sc.nextLine();
          System.out.print("Enter an arithmetic operator : ");
          String input = sc.nextLine();

    switch (input) {
        case "+":
        System.out.println("your sum is "+(num1+num2));
            break;
        case "-":
        System.out.println("your subtract is "+(num1-num2));
            break;
        case "*":
        System.out.println("your sum product "+(num1*num2));
            break;
        case "/":
        System.out.println("your division is "+(num1/num2));
            break;
    
        default:
        System.out.println("enter correct operator");
            break;
    }

    System.out.println("************************************************************************************************");

    }
}
