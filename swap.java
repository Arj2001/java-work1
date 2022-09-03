import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("Before swapping: a = "+ a +" b = "+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: a = "+ a +" b = "+b);

    }
}
