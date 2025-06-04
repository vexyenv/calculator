import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        userInput();
    }

    static void userInput() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double a = scn.nextDouble();
        System.out.print("Enter another number: ");
        double b = scn.nextDouble();
        System.out.print("Choose operator [+,-,*,/,%]: ");
        String c = scn.next();
        function(a, b, c);
    }

    static void function(double a, double b, String c) {
        switch (c) {
            case "+":
                System.out.println("Sum is = " + (a + b));
                break;
            case "-":
                System.out.println("Difference is = " + (a - b));
                break;
            case "*":
                System.out.println("Product is = " + (a * b));
                break;
            case "/":
                System.out.println("Quotient is = " + (a / b));
                break;
            case "%":
                System.out.println("Remainder is = " + (a % b));
                break;
            default:
                System.out.println("Invalid Operator");
                break;
        }
    }
}