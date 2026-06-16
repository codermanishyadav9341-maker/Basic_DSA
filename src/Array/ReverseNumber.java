package Array;

import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = scan.nextInt();

        if(size <= 0){
            System.out.println("Array is empty");
            return;
        }

        int[] arr = new int[size];

        System.out.println("Enter your Array elements:- ");
        for(int i = 0; i<size; i++){
            arr[i] = scan.nextInt();
        }

        //---------Reverse elements----------
        System.out.print("Array elements:- ");
       for(int i = size-1; i>=0; i--){
           System.out.print(arr[i] +" ");
       }

       scan.close();
        }

}
