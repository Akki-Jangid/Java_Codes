import java.util.*;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("This is ARRAY Class.");
        System.out.println("Enter the ELements in the Array.");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Arr["+i+"] = ");
            arr[i] =  input.nextInt();
        }
    }
}