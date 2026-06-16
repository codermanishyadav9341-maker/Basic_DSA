package BasicDSA;

import java.util.Scanner;
public class Number {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your numbers:- ");
        int num = scan.nextInt();

        System.out.println("Value of num is:- " +num);

        scan.close();
    }
}
