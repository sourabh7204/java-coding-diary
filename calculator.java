import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Add two numbers");
        System.out.println("2. Subtract two numbers");
        System.out.println("3. Multiply two numbers");
        System.out.println("4. Divide two numbers");
        System.out.println("5. Find remainder (Modulus)");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        int a = 0, b = 0;

        switch (choice) {

            case 1: // Addition
                System.out.print("Enter first number: ");
                a = sc.nextInt();
                System.out.print("Enter second number: ");
                b = sc.nextInt();
                System.out.println("Answer: " + (a + b));
                break;

            case 2: // Subtraction
                System.out.print("Enter first number: ");
                a = sc.nextInt();
                System.out.print("Enter second number: ");
                b = sc.nextInt();
                System.out.println("Answer: " + (a - b));
                break;

            case 3: // Multiplication
                System.out.print("Enter first number: ");
                a = sc.nextInt();
                System.out.print("Enter second number: ");
                b = sc.nextInt();
                System.out.println("Answer: " + (a * b));
                break;

            case 4: // Division
                System.out.print("Enter first number: ");
                a = sc.nextInt();
                System.out.print("Enter second number: ");
                b = sc.nextInt();

                if (b != 0) {
                    System.out.println("Answer: " + ((double) a / b));
                } else {
                    System.out.println("You cannot divide by zero!");
                }
                break;

            case 5: // Modulus
                System.out.print("Enter first number: ");
                a = sc.nextInt();
                System.out.print("Enter second number: ");
                b = sc.nextInt();

                if (b != 0) {
                    System.out.println("Answer: " + (a % b));
                } else {
                    System.out.println("You cannot use zero here!");
                }
                break;

            default:
                System.out.println("Wrong choice! Please enter between 1 to 5.");
        }

        sc.close();
    }
}
