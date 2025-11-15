import java.util.*;

public class InputInJava {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //It will print the String upto a word or sapce only it won't print the line after it
        String input = sc.next();
        System.out.println(input);

        //If we use nextLine then the full line of input will be displayed   
        String name =sc.nextLine();
        System.out.println(name);

        //It will print a number till space eg:7238 it won't display the number like 723 2942 2937
         int number = sc.nextInt();
         System.out.println(number);

        //nextBoolean - will display only true or false 
        boolean decimal =sc.nextBoolean();
        System.out.println(decimal);

        //nextShort - 
        short nxtsort=sc.nextShort();
        System.out.println(nxtsort);


    }
}
