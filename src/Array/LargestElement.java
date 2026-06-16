package Array;

import java.util.Scanner;
public class LargestElement {
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

        //-----------Largest elements-------------
        int largest = arr[0];

        for(int i = 0; i<size; i++){
            if(arr[i] >= largest){
                largest = arr[i];
            }
        }
        System.out.println("Largest elements:- " +largest);
    }
}
