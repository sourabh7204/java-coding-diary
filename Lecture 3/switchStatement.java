import java.util.Scanner;

public class switchStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. What is your Name");
        System.out.println("2. What you can do for me");
        System.out.println("3. What is 89 + 30");

        System.out.print("Enter the Choice : ");
        int choice = sc.nextInt();

        switch(choice) {
            case 1:
                System.out.println("Sourabh Vishwakarma");
                break;

            case 2:
                System.out.println("Anything");
                break;

            case 3:
                System.out.println(89 + 30);
                break;

            default:
                System.out.println("Enter correct choice");
        }
    }
}
