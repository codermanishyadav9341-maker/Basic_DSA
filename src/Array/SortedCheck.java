package Array;

import java.util.Scanner;
public class SortedCheck {
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

        //Sorted check:-
        boolean isCheck = true;
        for(int i = 0; i<size-1; i++){
            if(arr[i] > arr[i+1]){
                isCheck = false;
                break;
            }
        }

        if(isCheck){
            System.out.println("Array is sorted");
        }
         else{
             System.out.println("Array is not sorted");
        }
    }
}
