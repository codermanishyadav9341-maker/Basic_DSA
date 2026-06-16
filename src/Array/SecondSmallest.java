package Array;

import java.util.Scanner;
public class SecondSmallest {
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

        //------SecondSmallestElements;
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for(int i = 0; i<size; i++){
            if(arr[i] <= smallest){
                secondSmallest = smallest;
                smallest = arr[i];
            }
             else if(arr[i] < secondSmallest && smallest != arr[i]){
                 secondSmallest = arr[i];
            }
        }

        System.out.println("Smallest Elements:- " +smallest);
        System.out.println("SecondSmallest Elements:- " +secondSmallest);

        scan.close();
    }
}
