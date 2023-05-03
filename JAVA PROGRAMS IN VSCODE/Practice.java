import java.util.*;

class Practice{
    public static void main(String []args) {
        Scanner input = new Scanner(System.in);
        int choice, a, b, operation;;
        System.out.println("1.ADDITION  2.SUBTRACTION   3.MULTIPLICATION    4.DIVISION.");
        System.out.print("Which Operation U Wants to Perform : ");
        choice = input.nextInt();
        switch(choice){
            case 1: System.out.println("|| ADDITION ||");
                    System.out.print("Enter Ist Number : ");
                    a = input.nextInt();
                    System.out.print("Enter IInd Number : ");
                    b = input.nextInt();
                    operation = a+b;
                    System.out.print("Addition of "+a+" and "+b+" is "+operation);
                    break;

            case 2: System.out.println("|| SUBTRACTION ||");
                    System.out.print("Enter Ist Number : ");
                    a = input.nextInt();
                    System.out.print("Enter IInd Number : ");
                    b = input.nextInt();
                    operation = a-b;
                    System.out.print("Subtraction of "+b+" from "+a+" is "+operation);
                    break;

            case 3: System.out.println("|| MULTIPLICATION ||");
                    System.out.print("Enter Ist Number : ");
                    a = input.nextInt();
                    System.out.print("Enter IInd Number : ");
                    b = input.nextInt();
                    operation = a*b;
                    System.out.print("Multiplication of "+a+" and "+b+" is "+operation);
                    break;

            case 4: System.out.println("|| DIVISION ||");
                    System.out.print("Enter Dividend : ");
                    a = input.nextInt();
                    System.out.print("Enter Divisor : ");
                    b = input.nextInt();
                    operation = a/b;
                    System.out.print("Division of "+a+" by "+b+" is "+operation);
                    break;

            default:
                    System.out.println("Choose the Correct Option!");
                    return ;
        }
    }
}