package BasicDSA;

import java.util.Scanner;
public class IndefiniteNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Starting number:- ");
        int start = scan.nextInt();

        for(int i = start; ; i++){
            System.out.print(i);
        }
    }
}
