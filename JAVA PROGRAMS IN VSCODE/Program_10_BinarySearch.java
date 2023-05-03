import java.util.*;

public class Program_10_BinarySearch {

    public static void display(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print("  "+arr[i]);
        }
    }

    public static void binarySearch(int arr[], int element){
        int low, mid, high;
        low = arr[0];
        high = arr.length-1;
        mid = (low+high)/2;
        // System.out.println("");
        for (int i = 0; i < arr.length; i++) {
            while(arr[i]!=element)
            if(arr[mid]<element){
                low=mid;
            }
            if(arr[mid]>element){
                high=mid;
            }
            if(arr[i]==element){
                System.out.println(element+" Element Found at "+i+" index.");
            }break;
        }
                // if(arr[i]!=element){
                // System.out.println(element+" is Not Found in this...");
            // }continue;
    }
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int arr[]= {1,2,3,4,5,6,7,8,9,10};
        System.out.println("\n Array length : "+arr.length);
        display(arr);
        System.out.print("\nEnter the Element You want to Search : ");
        int element= input.nextInt();
        binarySearch(arr, element);
    }
    
}
