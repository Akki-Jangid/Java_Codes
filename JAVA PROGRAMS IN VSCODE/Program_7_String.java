import java.util.*;

public class Program_7_String {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        // char[] b= {'A','K','K','I'};
        // String a= new String(b);
        // System.out.println();

        // EXCEPTION HANDLING
        int a, b;
        System.out.print("Enter the Value of a : ");
        a= input.nextInt();
        System.out.print("Enter the Value of b : ");
        b= input.nextInt();
        // while(b==0){
        //     System.out.println("Choose the Valid Value of B ...");
        //     b= input.nextInt();
        // }
        try{
            if(a%b==0){
                System.out.println(a+ " Divided by "+b+" is "+a/b );
            } else {
                System.out.println(b+ " is not a Factor of "+a);
            }
        } catch (Exception e){
            System.out.println("The Values of b can't be Zero ..." +e);
        } 
        // finally{
            // System.out.println("Choose the Values of b rather than Zero ... ")
        // }

    }
}