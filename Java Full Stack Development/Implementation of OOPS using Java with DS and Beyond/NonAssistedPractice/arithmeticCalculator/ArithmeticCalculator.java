package NonAssistedPractice.arithmeticCalculator;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 19/07/22
 * Time: 12:43
 */


public class ArithmeticCalculator {

    static double add(double a, double b) {
        return (a + b);
    }

    static double subtract(double a, double b) {
        return (a - b);
    }

    static double multiply(double a, double b) {
        return (a * b);
    }

    static double divide(double a, double b) {
        return (a / b);
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.println("");
        boolean flag = true, err = false;
        while (flag) {
            System.out.print("Please enter your first value for calculation (please be sure about order of numbers): ");
            double a = SC.nextDouble();

            System.out.print("Please enter your second value for calculation (please be sure about order of numbers): ");
            double b = SC.nextDouble();

            System.out.print("Please enter your operator (please be sure about order of numbers): ");
            char operator = SC.next().charAt(0);

            double result;
            switch (operator) {
                case '+':
                    result = add(a, b);
                    break;
                case '-':
                    result = subtract(a, b);
                    break;
                case '*':
                    result = multiply(a, b);
                    break;
                case '/':
                    result = divide(a, b);
                    break;
                default:
                    err = true;
                    result = 0;
                    System.out.println("\n\nPlease enter a valid operator !!\n\n");
            }

            if(!err) {
                System.out.println("\n\nResult is : " + result + "\n\n");
            }

            System.out.println("Do you want to exit from the calculator, please press 0 and 1 if not.");
            int opt = SC.nextInt();
            if (opt == 0) {
                flag = false;
            }
        }
    }
}
