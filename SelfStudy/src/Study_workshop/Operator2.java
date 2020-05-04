package Study_workshop;

public class Operator2 {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		boolean result;
		
		num1= num1 +10;
		num2 = num2 +10;
		result = ((num1<0) && (num2>0));
		System.out.println("Result = " + result);
		System.out.println("Num1 = " + num1);
		System.out.println("Num2 = " + num2);
		
		num1= num1 +10;
		num2 = num2 +10;
		result = ((num1>0) || (num2>0));
		System.out.println("Result = " + result);
		System.out.println("Num1 = " + num1);
		System.out.println("Num2 = " + num2);
	}

}
