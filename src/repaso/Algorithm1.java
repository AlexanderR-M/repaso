package repaso;

import java.util.Scanner;
//conecta todas las cifras para formar un numero entero
/*
 * a the highest digit
 * b
 * c the lowest digit
 * the combined integer
 */
public class Algorithm1 {

	public static void main(String[] args) {
		//inputs: three numbers can be represented by three variables
		int a, b, c;
		//create a scanner object to establish comunication between our app and the console
		Scanner sc = new Scanner(System.in);
		//read three numbers from the console
		a =  sc.nextInt();
		b =  sc.nextInt();
		c =  sc.nextInt();
		long strartTime = System.nanoTime();
		System.out.println("the result is " +combineDigits(a,b,c));;
		long endTime = System.nanoTime();
		
		System.out.println("the time consumed" + (endTime - strartTime));
		
		
		sc.close();
	}

	private static int combineDigits(int a, int b, int c) {
		// logical operator: or ||, and && not !
		if (a > 9 || a < 0 || b > 9 || b < 0 || c > 9 || c < 0) {
			System.out.println("your number should be a single digit and non negative");
			//throw new InvalidAr
			return 0;
		}
		//implementation of the algorithm
		a *= 100;
		
		b *= 100;
		
		c *= 100;
		
		return a + b + c;
	}
}
