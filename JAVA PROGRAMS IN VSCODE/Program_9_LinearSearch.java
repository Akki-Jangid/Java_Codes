import java.util.*;

class Program_9_LinearSearch{

    public static void display(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print("  "+arr[i]);
        }
    }

    public static void linearSearch(int arr[], int element){

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==element){
                System.out.println(element+" Element Found at "+i+" index.");
            }
        }
            // if(arr[i]!=element){
                // System.out.println(element+" is Not Found in this...");
            // }continue;
    }


    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int arr[]= {1,2,3,4,5,6,7,8,9,10};
        // int element=10;
        display(arr);
        System.out.print("\nEnter the Element You want to Search : ");
        int element= input.nextInt();
        linearSearch(arr, element);
        // int b= (int)a;
    }
}