import java.io.*;
import java.util.Scanner;

class Akki_1 {
    public void name_1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number :");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Number :");
        int b = sc.nextInt();
        System.out.println("Addition of A and B is :" + (a + b));
        // System.out.println("Addition of A and B is :");
        // return (a + b);
        sc.close();
    }
}

class Akki_2 extends Akki_1 {
    public void name() {
        System.out.println("This is INHERITANCE...");
    }

}

class Akki {
    public static void main(String args[]) {
        Akki_2 obj_1 = new Akki_2();
        obj_1.name();
        obj_1.name_1();
    }
}