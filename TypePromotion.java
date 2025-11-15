public class TypePromotion {
    public static void main(String[] args) {

        //Here the char is directly conveting into int
        // char a='a';
        // char b='b';
        // System.out.println((int)a);
        // System.out.println((int)b);
        // System.out.println(b-a);

        //Will get error here
        char d='a';
        char e='b';
        char g=(int) (d+e);
        System.out.println(g);
    }
}
