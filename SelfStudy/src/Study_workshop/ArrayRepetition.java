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
		//��, �Ǵ� ¦�� �´��� ������ �ΰ��� ��ø�� for���� �ʿ��ϴ�. 
		for(int i=0; i<num; i++) {
			for(int j=i+1; j<num; j++) {
			//�̷��� �Ͽ� data[i]�� data[j]�� ���� ��� �˻��� �� �� �ִ�.
				if( data[i] == data[j]) //i�� j�� �ٸ��ٴ� ������ �־����. 
					//�� ������ ���� ���, (1,1,) (2,2), (3,3)�� ���� ��찡 ���� / ���� 1,2,3 �� �־��ٸ� 3���� ����. 
					count++;
			}
		}
		System.out.println(count);
		
	}
}
