import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temprature to check the fever :");
        double temp = sc.nextDouble();

        if(temp>100){
            System.out.println("You have a fever");
        }else{
             System.out.println("You don't have a fever");
        }

    }
}
