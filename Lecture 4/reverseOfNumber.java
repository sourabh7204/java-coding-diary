import java.util.Scanner;

public class reverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = sc.nextInt();
       
        //This is one type we can reverse a number 
    //    while(n>0){
    //     int lastdigit =n%10;
    //     System.out.print( +lastdigit );
    //     n = n/10;
    //    }
    //     System.out.println();

//This is a sencond type we can reverse the number
    int rev = 0;
    while(n>0){
        int lastdigit =n%10;
        rev = (rev*10)+lastdigit;
        n = n/10;
       }
        System.out.println(rev);
    }
}
