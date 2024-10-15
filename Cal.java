import java.util.InputMismatchException;
import java.util.Scanner;

public class Cal {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        boolean validInput = false;
        double num1 = 0, num2 = 0;
        int choice = 0;
        System.out.println("Console based calcii");
        System.out.println("Select an operation:");
        System.out.println("1:Addition (+)");
        System.out.println("2:Subtraction (-)");
        System.out.println("3:Multiplication (*)");
        System.out.println("4:Division(/)");

        while (!validInput) {
            try {
                System.out.print("Enter your choice(1-4):");
                choice = sc.nextInt();
                if (choice < 1 || choice > 4) {
                    throw new InputMismatchException("Invalid operation choice");
                }
                validInput = true;

            } catch (InputMismatchException e) {
                System.out.println("Invalid input.Please enter a number between 1 and 4.");
                sc.nextLine();
            }
        }
        validInput = false;
        while (!validInput) {
            try {
                System.out.println("Enter first number:");
                num1 = sc.nextDouble();
                validInput = true;

            } catch (InputMismatchException e) {
                System.out.println("Invalid input.Please enter a valid number.");
                sc.nextLine();
            }
        }
        validInput = false;

        while (!validInput) {
            try {
                System.out.println("Enter second number):");
                num2 = sc.nextDouble();
                validInput = true;

            } catch (InputMismatchException e) {
                System.out.println("Invalid input.Please enter a valid number.");
                sc.nextLine();
            }
        }
        System.out.println("Do you want do another");
        try

        {
            double result = 0;
            switch (choice) {
                case 1:
                    result = num1 + num2;
                    break;
                case 2:
                    result = num1 - num2;
                    break;
                case 3:
                    result = num1 * num2;
                    break;
                case 4:
                    if (num2 == 0) {
                        throw new ArithmeticException("Division by zero is not allowed");
                    }
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Unknown operation");

            }
            System.out.println("Result: " + result);
        }

        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
