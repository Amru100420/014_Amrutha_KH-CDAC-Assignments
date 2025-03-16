//Write a Java program that takes three numbers as input and finds the largest of the three.

import java.util.Scanner;

class Largestnumber {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in) ;

        System.out.print("Input first number: \n");
        int num1 = sc.nextInt() ;

        System.out.print("Input second number: \n");
        int num2 = sc.nextInt() ;

        System.out.print("Input third number: \n");
        int num3 = sc.nextInt() ;

        if(num1 > num2 && num1 > num3) {
            System.out.println("The largest number is " +num1) ;
        }
        else if(num2 > num1 && num2 > num3) {
            System.out.println("The largest number is " +num2) ;
        }
        else {
            System.out.println("The largest number is " +num3) ;
        }

    }
}