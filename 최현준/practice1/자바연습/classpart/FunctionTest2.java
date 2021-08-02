package classpart;

public class FunctionTest2 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
									
		int sum1 = add(num1, num2);	
		System.out.println(num1 + " + " + num2 + " = " + sum1 + "입니다.");
		
		int sum2 = sub(num1, num2);	
		System.out.println(num1 + " - " + num2 + " = " + sum2 + "입니다.");
		
		int sum3 = mul(num1, num2);	
		System.out.println(num1 + " * " + num2 + " = " + sum3 + "입니다.");
		
		int sum4 = div(num1, num2);	
		System.out.println(num1 + " / " + num2 + " = " + sum4 + "입니다.");
		
		
	}
	
	public static int add(int n1, int n2) {		
		int result = n1 + n2;	
		return result;	
	}
	public static int sub(int n1, int n2) {		
		int result = n1 - n2;	
		return result;	
	}
	public static int mul(int n1, int n2) {		
		int result = n1 * n2;	
		return result;	
	}
	public static int div(int n1, int n2) {		
		int result = n1 / n2;	
		return result;	
	}

}
	// add - 덧셈 <sub>stract - 뺄셈 <mul>tiply - 곱셈	<div>ision - 나누기