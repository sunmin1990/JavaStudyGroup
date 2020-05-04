package Study_workshop;

import java.util.Scanner;

public class ArrayShift {

	public static void main(String[] args) {
		Scanner kb4 = new Scanner(System.in);
		int n = kb4.nextInt(); //먼저  정수의 개수 n개를 입력 받고
		
		int [] data = new int [n]; //n개의 정수를 저장할 배열을 만들고 
		
		for(int i =0; i < n; i++)
			data[i] = kb4.nextInt(); // n개의 정수를 사용자로부터 입력받아 배열 data에 저장을 하고 
		kb4.close();
		
		
		int tmp = data[n-1]; //배열의 맨 마지막 값[n-1]을 tmp라는 임시 변수에 저장을 해두기로 함.
		for(int j = n-2; j>=0; j--) //끝(n)에서 두번째 값부터(n-2) 한칸씩 뒤로 shift하는 것 / 돌때마다 i의 값을 감소시키는 것 (역순 코드)
			//i는 끝에서 두번째 값(i=n-2)부터 0(i>=0)이 될때까지 
			data[j+1] = data[j]; //data [i]를 한칸 뒤로 보내 data[i+1] -> 의 값이 data[i]의 값이 된다. 
		
		data[0] = tmp; //맨 마지막에 있던 tmp를 맨 앞으로(data[0])보낸다면
		
		for(int i=0; i<n; i++)
			System.out.println(data[i]);
	}

}
