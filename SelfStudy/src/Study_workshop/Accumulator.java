package Study_workshop;

public class Accumulator {
	
	static int sum = 0;
	
	public static void main(String[] args) {
		int maxSum = 0;
		for(int i = 0; i<10; i++) {
			sum += i;
			if(sum >maxSum) //���� �� ������ �־���� �� �ʿ䰡 ������?
				maxSum = sum;
		}
		
		System.out.println("The sum is " + sum);

	}

}
