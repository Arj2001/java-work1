/**
 * LargeOf3
 */
import java.util.Scanner;

public class LargeOf3 {
    public static void main(String[] args) {
        try{
            Scanner in = new Scanner(System.in);
            System.out.println("Enter 1st Digit");
            int a = in.nextInt();
            System.out.println("Enter 2nd Digit");
            int b = in.nextInt();
            System.out.println("Enter 3rd Digit");
            int c = in.nextInt();

            int max = a;
            if (max < b) {
                max = b;
            }
            if (c > max) {
                max = c;
            }
            System.out.println("Largest no. is "+max);
        } catch (Exception e) {}
    }
}