package Study_workshop;

public class Accumulator2 {
	static int sum = 0;
	
	static void add(int n) {
		sum += n;
	}
	
	static void showResult() {
		System.out.println("sum:" + sum);
	}

	public static void main(String[] args) {
		for(int i = 0; i<10; i++) 
			Accumulator2.add(i);
		Accumulator2.showResult();
	}

}
