import java.util.Scanner;

public class Calculator {

    static int add(int a, int b) {
        return a + b;
    }

    static int subtract(int a, int b) {
        return a - b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;

        do {
            System.out.println("Calculator");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Result: " + add(num1, num2));
                    break;

                case 2:
                    System.out.println("Result: " + subtract(num1, num2));
                    break;

                case 3:
                    System.out.println("Result: " + multiply(num1, num2));
                    break;

                case 4:
                    if (num2 != 0)
                        System.out.println("Result: " + divide(num1, num2));
                    else
                        System.out.println("Cannot divide by zero");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

            System.out.print("Do you want to continue? (y/n): ");
            ch = sc.next().charAt(0);

        } while (ch == 'y' || ch == 'Y');

        sc.close();
        System.out.println("Calculator closed.");
    }
}
