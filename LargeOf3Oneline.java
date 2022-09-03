/**
 * LargeOf3
 */
import java.util.Scanner;;

public class LargeOf3Oneline {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1st Digit");
        int a = in.nextInt();
        System.out.println("Enter 2nd Digit");
        int b = in.nextInt();
        System.out.println("Enter 3rd Digit");
        int c = in.nextInt();
        // if (a>b) {
        //     if (a>c) {
        //         System.out.println("Largest is "+a);
        //     }else{
        //         System.out.println("Largest is "+c);
        //     }
        // }else{
        //     if (b>c) {
        //         System.out.println("Largest is "+b);
        //     }else{
        //         System.out.println("Largest is "+c);
        //     }

        // }
        /*
        int max = a;
        if (max < b) {
            max = b;
        }
        if (c>max) {
            max = c;
        }
        */
        // int max = (a > b) ? ((a >c) ? a:c) : ((b > c) ? b: c);
        System.out.println("Largest no. is "+( (a > b) ? ((a >c) ? a:c) : ((b > c) ? b: c)) );
    }
}