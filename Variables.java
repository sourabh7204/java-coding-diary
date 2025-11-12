public class Variables {
    public static void main(String[] args) {
        int a=5;
        int b=10;
        System.out.println(a);
        System.out.println(b);
        
        //Stings
        String name ="Sourabh Vishwakarma";
        System.out.println(name);

        //Chnaging Value of a 
        a=50; //Here the value of a will be treated as 50 not 5
        System.out.println(a);

        //Assigning other values by using identifiers
        a=b; //it will use the value which is assigned first example with int a=5 and b=10 
        System.out.println(a);
    }
}
