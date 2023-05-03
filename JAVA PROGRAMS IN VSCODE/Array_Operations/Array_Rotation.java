package Array_Operations;

class Rotation{
    public static void rotate(int a[], int d,int size){
        int temp[] = new int[size];
        int k=0;
        for(int i=d; i<a.length;i++){
            temp[k]=a[i];
            k++;  
        }
        for(int i=0;i<d;i++){
            temp[k]=a[i];
            k++;
        }
        for(int i=0;i<temp.length;i++){
            a[i]=temp[i];
        }
    }
    public void printArray(int a[]){
        System.out.println("Length After Rotation : "+a.length);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }

}

public class Array_Rotation {
    public static void main(String[] args){
        int arr[]= {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Array Before Rotation :");
        System.out.println("Array Length : "+arr.length);
        for(int i=0;i<arr.length; i++ ){
            System.out.println(arr[i]);
        }
        Rotation r= new Rotation();
        Rotation.rotate(arr, 4,10);
        System.out.println("Array After Rotation :");
        r.printArray(arr);



    }
}
