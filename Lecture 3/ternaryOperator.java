import java.util.Scanner;

public class ternaryOperator {
    public static void main(String[] args) {
         int number = 3;

         //ternary operator
        String type= (number%2 == 0)? "even" : "odd";
        System.out.println (type);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks :");
        int marks = sc.nextInt();
        
        String result = (marks>=33)? "PASS" : "FAIL";
        System.out.println ("The Result is : " +result);



    }
}
