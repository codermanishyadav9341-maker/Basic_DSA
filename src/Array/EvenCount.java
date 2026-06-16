package Array;

import java.util.Scanner;
public class EvenCount {
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

        //--EvenCount
        int eveCount = 0;
        for(int i = 0; i<size; i++){
            if(arr[i]%2 == 0){
                eveCount++;
            }
        }

        System.out.println("EvenCount Digits is:- " +eveCount);
    }
}
