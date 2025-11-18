import java.util.Scanner;

public class largestof2no {
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
     System.out.print("Enter the value of a :");
    int a=sc.nextInt();
    System.out.print("Enter the value of b :");
    int b=sc.nextInt();
    

    if(a>b){
         System.out.print("The largest among a & b is :"+a);
    } else{
         System.out.print("The largest among a & b is :"+b);
    }
}
    
}
