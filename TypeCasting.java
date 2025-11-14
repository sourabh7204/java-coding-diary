import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {

        //Will get err for this code if we won't use (int) with a, it helps us to convert by force from float to integer
     Scanner sc =new Scanner(System.in);
        float a =7.65f;
        int b= (int)a;
        System.out.println(b);

        //Conveting char to integer, for this will get output because there are some set of numbers assigned to each of the letter in the alphabet
        char ch='*';
        int number =ch;
        System.out.println(number);

    }
}
