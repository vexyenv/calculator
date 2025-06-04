import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double a = scn.nextDouble();
        System.out.print("Enter another number: ");
        double b = scn.nextDouble();
        System.out.print("Choose an operator [+,-,/,*,%]: ");
        String c = scn.next();

        if (c.equals("+")) {
            System.out.println("Sum is = " + (a + b));
        } else if (c.equals("-")) {
            System.out.println("Difference is = " + (a - b));
        } else if (c.equals("*")) {
            System.out.println("Product is = " + (a * b));
        } else if (c.equals("/")) {
            System.out.println("Quotient is = " + (a / b));
        } else if (c.equals("%")) {
            System.out.println("Remainder is = " + (a % b));
        } else {
            System.out.println("Invalid Operator");
        }
    }
}