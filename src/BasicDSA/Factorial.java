package BasicDSA;

import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        int fact = 1;
        for(int i = 1; i<=num; i++){
            fact *= i;
        }

        System.out.println(num+ " is factorial is:- " +fact);
    }
}
