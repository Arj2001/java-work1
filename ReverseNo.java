import java.util.Scanner;

public class ReverseNo {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = in.nextInt();
        int reverse = 0;
        int d;
        while (num != 0) {
            d = num % 10;
            reverse = reverse * 10 + d;
            num = num / 10;
        }
        System.out.println(reverse);
    }
}

