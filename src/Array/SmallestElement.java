package Array;

import java.util.Scanner;
public class SmallestElement {
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

        //---------Smallest Elements-----------
        int smallest = arr[0];
        for(int i = 0; i<size; i++){
            if(smallest >= arr[i]){
                smallest = arr[i];
            }
        }

        System.out.println("Smallest elements:- " +smallest);
    }
}
