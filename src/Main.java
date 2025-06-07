import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        while (true) {
            userInput(scn);

            System.out.print("Do you wish to quit [Yes(y)/No(n)]: ");
            String choice = scn.next();

            if (choice.equalsIgnoreCase("y")) {
                break;
            }
        }
    }

    static void userInput(Scanner scn) {
        System.out.print("Enter a number: ");
        double a = scn.nextDouble();
        System.out.print("Enter another number: ");
        double b = scn.nextDouble();
        System.out.print("Choose operator [+,-,*,/,%]: ");
        String c = scn.next();
        calculate(a, b, c);
    }

    static void calculate(double a, double b, String c) {
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
                if (a == 0) {
                    System.out.println("Cannot divide by zero");
                } else {
                    System.out.println("Quotient is = " + (a / b));
                }
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