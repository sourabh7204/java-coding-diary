import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
          Scanner sc =new Scanner(System.in);
     System.out.print("Enter the value of n :");
    int n=sc.nextInt();
    // System.out.print("Enter the value of b :");
    // int b=sc.nextInt();

    if(n%2 == 0){
        System.out.print(+n+ " is even");
    }else{
        System.out.print(+n+ " is odd");
    }
    }
}
