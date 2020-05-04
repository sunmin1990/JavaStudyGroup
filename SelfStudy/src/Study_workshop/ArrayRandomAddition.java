package Study_workshop;

import java.util.Scanner;

public class ArrayRandomAddition {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int num = key.nextInt();
		int [] data = new int [num];

		for(int i=0; i<num; i++)
			data[i] = key.nextInt();
		key.close();

		int max=0; //왜 0이냐? 문제: 이들 중에서 0개 이상의 연속된 정수들을 더하여....
		//또는 이렇게 구할 수도 있다. 
		for(int i=0; i<num; i++) {
			int sum = 0; //sum을 이 곳 에서 초기화를 하고
			for(int j=i; j<num; j++) {
				sum += data[j]; //i에서 j까지의 합을 구하는것 / 이전에 더해놓았덙 sum에 새로운j의 값만 더해주며 또다른 sum이 구해진다. 
				if(sum>max)
					max=sum;
			}
		}
	/*	for(int i=0; i<num; i++) { //i를 시작점이라고 할때 i부터 num까지 증가한다. 
			//그리고 그 i의 시작점에서 각각의 가지고 가는 끝점을 j라고 한다면?
			for(int j=i; j<num; j++) { //j가 0에서 시작할 필요는 없음. i부터 num까지 증가하는 것으로 충분함. 
				//j=i라는 뜻은 시작점과 끝점이 같다는 것 = 길이가 1인 구간

				int sum=0; //합을 구하자
				//이제 할일은 data[i] 부터 data[j]까지의 합을 구하는것 어떻게 해야할까? 아래를 보자. for문이 필요하다.
				for(int k=i; k<=j; k++) // k는 i부터 시작해서 j까지 하나씩 증가시킨다. 그리고 sum에 data[k]를 더해준다면?
					sum += data[k];
				if(sum>max) //sum 이 현재 내가 알고 잇는 max최대값보다 크다면?
					max = sum; //이것이 새로운 최대값이 된다. 
			// add data [i] ...[j], if the sum >max , max = the sum;
			}
		} */
		System.out.println(max);
	}
}
