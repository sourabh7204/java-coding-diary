import java.util.Scanner;

public class continueStatement {
    public static void main(String[] args) {
        // for (int i =1; i<=5; i++){
        //     if(i==3){
        //         continue;
        //     }
        //     System.out.println(i);
        // }

            
         //break question

         Scanner sc = new Scanner(System.in);
         
         do{
             System.out.print("Enter your number: ");
            int num = sc.nextInt();
            if(num%10 == 0){
                continue;
            }
            System.out.println("number was : "+num);
         }while(true);
    }
}
