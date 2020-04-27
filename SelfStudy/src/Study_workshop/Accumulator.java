package Study_workshop;

public class Accumulator {
	
	static int sum = 0;
	
	public static void main(String[] args) {
		int maxSum = 0;
		for(int i = 0; i<10; i++) {
			sum += i;
			if(sum >maxSum) //굳이 이 두줄을 넣어줘야 될 필요가 있을까?
				maxSum = sum;
		}
		
		System.out.println("The sum is " + sum);

	}

}
