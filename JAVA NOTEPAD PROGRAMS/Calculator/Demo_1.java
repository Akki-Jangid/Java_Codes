
import java.util.Scanner;

class Calculator {
  
   Scanner input = new Scanner(System.in);
  
   public void add() {
   System.out.println("---- Enter Two Numbers For Addtion ----");
   System.out.print("First --> ");
   int a = input.nextInt();
   System.out.print("Second --> ");
   int b = input.nextInt();   
   // int c = 0;
   System.out.println("Addtion of "+a+" and "+b+" is "+(a+b));
   }

   public void sub() {
   System.out.println("---- Enter Two Numbers For Subtraction ----");
   System.out.print("First --> ");
   int a = input.nextInt();
   System.out.print("Second --> ");
   int b = input.nextInt();
   System.out.println("Subtraction of "+a+" and "+b+" is "+(a-b));
   }

   public void mul() {
   System.out.println("---- Enter Two Number For Multiplication ----");
   System.out.print("First --> ");
   int a = input.nextInt();
   System.out.print("Second --> ");
   int b = input.nextInt();
   System.out.println("Multiplication of "+a+" and "+b+" is "+(a*b)); 
   }

   public void divide() {
   System.out.println("---- Enter two Numbers For Division ----");
   System.out.print("First --> ");
   int a = input.nextInt();
   System.out.print("Second -->");
   int b = input.nextInt();
   System.out.println("Division of "+a+" and "+b+" is "+(a/b));
   }

}


class Demo_1 {
  public static void main (String [] args) {
  Scanner input = new Scanner(System.in);
  Calculator obj1 = new Calculator();
   
   for(int i=1; i<=4; i++)  {
   System.out.println("\n---- Choice One of Them ----");
   System.out.println(" 1. Addition \n 2. Subtraction \n 3. Multiplication  \n 4. Division \n");
   int a = input.nextInt();
   if (a<1||a>4) {
      System.out.println("Sorry!  --- You Have to Choose One of Them --- ");
   } else 
  
   switch(a) {
   case 1: obj1.add(); continue;
   case 2: obj1.sub(); continue; 
   case 3: obj1.mul(); continue;
   case 4: obj1.divide(); 
            }
         }
     }
}