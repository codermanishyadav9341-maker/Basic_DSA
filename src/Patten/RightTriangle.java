package Patten;

import java.util.Scanner;
public class RightTriangle {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Rows:- ");
        int rows = scan.nextInt();

        System.out.print("Enter Columns:- ");
        int columns = scan.nextInt();

        for(int i = 1; i<=rows; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
