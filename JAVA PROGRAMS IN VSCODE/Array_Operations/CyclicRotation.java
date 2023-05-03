package Array_Operations;

import java.util.Scanner;

public class CyclicRotation {
    public static void main(String args[]){
        Scanner input= new Scanner(System.in);
        int a[]= {1,2,3,4,5};
        System.out.println("|| Before Cyclic Rotation ||");
        for(int i=0; i<a.length;i++){
            System.out.println("a["+i+"] = "+a[i]);
        }
        int k=a[4];
        System.out.println("|| After Cyclic Rotation ||");
        for(int i=a.length-1; i>0;i--){
            a[i]=a[i-1];
        }
        a[0]=k;
        for(int i=0; i<a.length;i++){
            System.out.println("a["+i+"] = "+a[i]);
        }


    }
}
