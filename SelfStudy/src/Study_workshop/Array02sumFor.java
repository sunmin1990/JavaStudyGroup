package Study_workshop;

import java.util.Scanner;

public class Array02sumFor {

	public static void main(String[] args) {
		Scanner kb3 = new Scanner(System.in);
		int n = kb3.nextInt(); //n 개의 정수를 입력 받을 거기 때문에 (kb3.nextInt = Scanner.nextInt)
		int [] data = new int [n]; //입력받은 정수를 저장할 배열이 있어야 하니까!길이가 n개인 배열을 만든다.
		for(int i=0; i<n; i++) //for문은 n번을 돌게됨. 한번돌때마다 하나의 정수(n)을 입력 받으면 됨
			data[i] = kb3.nextInt();
		kb3.close();
		//n개의 정소를 키보드로부터 입력받는 일 완료! // 그래서 처음 입력하는 숫자가 배열의 개수를 나타낸다.
		
//		int sum =0; 
//		int max = data[0]; // 실제 데이타 중의 하나를 max의 최대값으로 만든다. 
//	//	int max = 0; //최대값을 구하겠다. max라는 변수 선언
//		for(int i =0; i <n; i++) {
//			sum += data[i]; //합을 구하는 가장 기본적인 코드 sum = sum + data[i]; 를 줄인 것 
//			if(data[i] > max) //데이터를 순서대로 본다 (data[i]) / 그런데 현재보는 것이 내가 알고 있는 최대값(max)보다 크다면, 
//				max = data[i]; //그것이(data[i]) 새로운 최대값(max)이다. 
//		}
//		
//		System.out.println("The sum is  "  + sum);
//		System.out.println("The max is  "  + max);
	}

}
