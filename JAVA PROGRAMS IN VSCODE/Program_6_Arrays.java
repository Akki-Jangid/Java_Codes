import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Program_6_Arrays {
        public static void main(String args[]){
         Scanner input = new Scanner(System.in);   
        //  int a[]= new int[10];   // --> 1
        //  int b[]= {1,2,3,4,5,6,7,8,9,10};
        //  String c[]= new String[3];
        //  System.out.println("Enter the Values in Array (a) ");
        //  InputStreamReader in = new InputStreamReader(System.in);
        //  BufferedReader br = new BufferedReader(in);
        // Accessing and Printing Array Elements
        // for (int i=0; i<a.length; i++){
            // System.out.print("a["+i+"] = ");
            // a[i]= input.nextInt();
        // }
        //  for (int i=0; i<a.length; i++){
            // System.out.println(a[i]);
        // }
        // FIBONACCI SERIES
        int a=0, b=1;
        int c= a+b;
        System.out.println("Enter the number of Series");   
        int n= input.nextInt();
        System.out.println(a+" "+b+" "+c);   
        for(int i=0; i<=n; i++){
            a=b;
            b=c;
            System.out.print((c=a+b)+"  ");   
        }
    }
}