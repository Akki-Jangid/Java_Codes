import java.util.Scanner;

public class Program_2_Factorial {
    public static void main(String args[]) {
        // This is the Program for Factorial of the Number...
        int fact = 1, num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        num = input.nextInt();
        /*
         * for (int i = num; i > 1; i--) {
         * fact = fact * i;
         * }
         */
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        /*
         * while (num > 1) {
         * fact = (fact * num);
         * num--;
         * }
         */
        System.out.println("Factorial is :" + fact);
        input.close();
    }
}
