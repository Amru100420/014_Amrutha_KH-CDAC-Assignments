import java.util.Scanner;

class Swapping {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter first number");
		int num1 = sc.nextInt() ;
		System.out.println("Enter second number");
		int num2 = sc.nextInt() ;
		
		num1 = num1^num2 ;
		num2 = num1^num2 ;
		num1 = num1^num2 ;
		
		System.out.println("Swaped value of first number: "+num1);
		System.out.println("Swaped value of second number: "+num2);
	}
}