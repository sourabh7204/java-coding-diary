import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        // int counter=0;
        // while (counter<100){
        //     System.out.println("Hello World");
        //     counter++;
        // }

        //  int num=1;
        // while (num<=10){
        //     System.out.println(num);
        //     num++;
        // }


    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter n value: ");
    //     int n = sc.nextInt();
    //      int counter =1;
    //     while (counter<=n){
    //         System.out.println(counter);
    //         counter++;
    //     }


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = sc.nextInt();
        int sum =0;
        int i=1;
        while (i<=n){
          sum+=i;
          i++;
        }

        System.out.println("sum is :" +sum);
    
    }
}
