import java.util.*;

public class Calculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("|| Welcome To Programmed Calculator ||\nWhich Operation You Wants to Perform :"
                                +"\n1. ADDITION\n2. SUBTRACTION\n3. MULTIPLICATION\n4. DIVISION ");
        int choice= input.nextInt();
        if(choice>=1 && choice<=4){
            System.out.print("Enter First Number : ");
            double number_1= input.nextDouble();
            System.out.print("Enter Second Number : ");
            double number_2= input.nextDouble();
            switch(choice){
                case 1: System.out.println("The Addition of "+number_1+" and "+number_2+" is "+(number_1+number_2));
                break;
                case 2: System.out.println("The Subtraction of "+number_2+" From "+number_1+" is "+(number_1-number_2));
                break;
                case 3: System.out.println("The Multiplication of "+number_1+" and "+number_2+" is "+(number_1*number_2));
                break;
                case 4: System.out.println("The Division of "+number_1+" by "+number_2+" is "+(number_1/number_2));
                break;
            }
        } else {System.out.println("Choose the Correct Operation to Perform ...");}


    }
}
