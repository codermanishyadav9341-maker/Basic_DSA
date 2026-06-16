package BasicDSA;

import java.util.Scanner;
public class GreaterNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first number:- ");
        int num1 = scan.nextInt();

        System.out.print("Enter your Second number:- ");
        int num2 = scan.nextInt();

       if((num1 > num2)){
           System.out.println(num1+ " is Greater than " +num2);
       }
        else if((num2 > num1)){
            System.out.println(num2+ " is Greater than " +num1);
       }
         else{
             System.out.println("Both are equal");
       }
    }
}
