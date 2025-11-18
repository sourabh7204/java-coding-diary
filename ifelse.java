import java.util.Scanner;

public class ifelse {
   public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
     System.out.print("Enter the age: ");
    int age=sc.nextInt();
    if(age>=18){
        System.out.println("Adult , He/She can vote");
    }
    if(age >13 && age<18 ){
         System.out.println("You are in your teenager");
    }
    else{
        System.out.println("He/She is not Adult");
    }
   } 
}
