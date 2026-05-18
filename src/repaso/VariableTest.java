package repaso;

public class VariableTest {
	public static void main(String[] args) {
		//primitive variables
		var num1 = 1.1;
		int num2 = 1;
		//explicity conversion
		int result = (int)(num1 + num2);
		System.out.println(result);
		result = Calculator.sum((int)num1, num2);
		
		double result2 = num1/num2;
		result2 = Calculator.division(2, num2);
		System.out.println(result2);
		
		System.out.println(Calculator.modulus(3.2f, 3));
		//reference variables
		
		boolean stop = false;
		String color  = "green";
		System.out.println(stop);
		if (color == "green") {
			stop = false;
		} 
		 
		
	}

}
