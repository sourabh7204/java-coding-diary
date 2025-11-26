import java.util.Scanner;

public class largestof3no {
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
     System.out.print("Enter the value of a :");
    int a=sc.nextInt();
    System.out.print("Enter the value of b :");
    int b=sc.nextInt();
    System.out.print("Enter the value of c :");
    int c=sc.nextInt();
    

    if((a>=b) && (a>=c)){
         System.out.print("The largest among a,b & c is :"+a);
    } else if(b>=c){
         System.out.print("The largest among a,b & c is :"+b);
    }else{
        System.out.print("The largest among a,b & c is :"+c);
    }
}
    
}
