  import java.util.*;

public class TypeConversion {
    public static void main(String[] args) {

        //Will get error for this because we can't convert float into interger because there will a loss of data that java didn't allow us to convert directly for that we use "Type Casting"
        float a=5;
        int b=a;
        System.out.println(b);

       //For below code we will get output, if we try to float into integer then will get error.
        Scanner sc =new Scanner(System.in);
          System.out.println("Enter floating number:");
            float number =sc.nextInt();
     


    }
}

