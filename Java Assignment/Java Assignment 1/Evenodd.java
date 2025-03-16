//Write a Java program that checks if a number is even or odd.

import java.util.Scanner;

class Evenodd {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in) ;

        System.out.print("Input a number: ");
        int num = sc.nextInt() ;

		if(num%2==0){
        System.out.println("The number " + num + " is even");
		}
		else{
			System.out.println("The number " + num + " is odd");
		}
			
    }
}