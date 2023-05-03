package Array_Operations;

class Reverse{
    public void reverse_array(int arr[], int start, int end){
        // int n= arr.length;
        int temp;
        while(start<end){
            temp=arr[start];
            arr[start]= arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

}

public class Reversal_Algorithm_1 {
    public static void main(String args[]){
        Reverse r= new Reverse();
        int a[]= {1,2,3,4,5,6,7,8,9,10};
        for (int i=0; i<a.length;i++){
            System.out.println("Array Before Rotation :"+a[i]);
        }
        System.out.println("Array After Rotation :");
        r.reverse_array(a, 0, 1);
        r.reverse_array(a, 2, a.length-1);
        r.reverse_array(a, 0, a.length-1);
        for (int i=0; i<a.length;i++){
            System.out.println("Array Before Rotation :"+a[i]);
        }


    }    
}
