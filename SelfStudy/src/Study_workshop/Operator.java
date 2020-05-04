package Study_workshop;

public class Operator {

    /*
    = 연산자는 결합 방향이 오른쪽에서 왼쪽으로 진행된다. 
    따라서 위의 문장은 다음과 같다. 
    num1 = (num2 = num3);        
  */

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		num1 = num2 = num3;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
	}

}
