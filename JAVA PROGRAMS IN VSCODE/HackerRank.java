import java.util.*;

import javax.sound.midi.Synthesizer;




class HackerRank{
    public static void arrayCoversion(int arr[]){
        int temp[]= new int[arr.length];
        int k=arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            temp[i]=arr[k];
            k--;
        }
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i]+" ");
        }
    }
    public static void main(String args[]) {
    Scanner input = new Scanner(System.in);        
    // Binary to Decimal Conversion 
        /* 
    int a[]= {1,1,1,1,0,1};
    System.out.print("Binary Number : ");
    for (int i = 0; i < a.length; i++) {
        System.out.print(a[i]);
    }
    System.out.println();
    double decimal=0;
    int j=0;
    for (int i = a.length-1; i>=0 ; i--) {
            decimal=decimal + a[i]*Math.pow(2,j);
            j++;
        }
    System.out.print("After Coverting in Decimal : "+decimal);
    */
    
    // Decimal to Binary Conversion 
    int decimal = 61;
    int binary[]= new int[6];
    String binary_1 = Integer.toBinaryString(decimal);
    System.out.println(binary_1);
    for (int i = 0; i < binary.length; i++) {
        if(decimal%2==0){
            binary[i]=0;
        } else {
            binary[i]=1;
        }
        decimal/=2;
    }
    for (int j = 0; j < binary.length; j++) {
        System.out.print(binary[j]+" ");
    }
    System.out.println(" ");
    arrayCoversion(binary);
    System.out.println(" ");
    int cons=1;
    System.out.println(cons);
    for (int i = 0; i < binary.length; i++) {
        if(binary[i]==1 ){
            if(binary[i+1]==1){
                cons+=1;
            }
        }  
    }
    System.out.println(cons);

    }
}