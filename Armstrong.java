import java.util.Scanner;

public class Armstrong {
    
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the range:");
        System.out.print("From: ");
        int from = in.nextInt();
        System.out.print("Until: ");
        int until = in.nextInt();
        for (int i = from; i < until; i++) {
            if(arm(i)){
                System.out.print(" " + i);
            }
        }
        
    }
    public static boolean arm(int num) {

        int n = num;
        double digit = 0;
        int sum = 0; 
        double length = String.valueOf(num).length();
        while(n != 0){
            digit = n % 10;
            sum =(int)(sum + Math.pow(digit, length));
            n = n/10;
        }
        return sum == num ? true : false;
    }
}
