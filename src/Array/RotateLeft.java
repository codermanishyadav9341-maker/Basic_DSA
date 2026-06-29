package Array;

import java.util.Scanner;
public class RotateLeft {
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

        //Left Rotate;
        int first = arr[0];

        for(int i = 0; i<size-1; i++){
            arr[i] = arr[i+1];

        }

        arr[size - 1] = first;

        // Print Rotated Array
        System.out.println("Array after Left Rotate:");

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
