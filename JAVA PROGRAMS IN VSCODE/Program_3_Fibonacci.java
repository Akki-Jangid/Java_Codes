import java.util.Scanner;

public class Program_3_Fibonacci {
    public static void main(String args[]) {
        int a = 0, b = 1, c, num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number :");
        num = input.nextInt();
        for (int i = 1; i <= num; i++) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }

}
