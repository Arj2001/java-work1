import java.util.Scanner;

public class ASCII {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a character");
        char chr = in.next().charAt(0);
        int ascii = chr;
        System.out.println("ASCII value of "+ chr + " is "+ ascii);
        
    }
}
