package Study_workshop;

import java.util.Scanner;

public class ArrayRepetition {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int num = key.nextInt();
		int [] data = new int [num];
		
		for(int i=0; i<num; i++)
			data[i] = key.nextInt();
		key.close();
		
		
		int count = 0;
		//쌍, 또는 짝이 맞는지 보려면 두개의 중첩된 for문이 필요하다. 
		for(int i=0; i<num; i++) {
			for(int j=i+1; j<num; j++) {
			//이렇게 하여 data[i]와 data[j]의 쌍을 모두 검사해 볼 수 있다.
				if( data[i] == data[j]) //i와 j가 다르다는 조건을 주어야함. 
					//저 조건이 없을 경우, (1,1,) (2,2), (3,3)과 같은 경우가 생김 / 만약 1,2,3 을 주었다면 3개가 나옴. 
					count++;
			}
		}
		System.out.println(count);
		
	}
}
