import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first operand: ");
        double operand1 = input.nextDouble();

        System.out.print("Enter the operator (+, -, *, /): ");
        String operator = input.next();

        System.out.print("Enter the second operand: ");
        double operand2 = input.nextDouble();

        double result = 0;
        switch (operator) {
            case "+":
                result = operand1 + operand2;
                break;
            case "-":
                result = operand1 - operand2;
                break;
            case "*":
                result = operand1 * operand2;
                break;
            case "/":
                result = operand1 / operand2;
                break;
        }

        System.out.println("The result is: " + result);
    }
}