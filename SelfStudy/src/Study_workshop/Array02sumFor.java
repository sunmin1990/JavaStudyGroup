package Study_workshop;

import java.util.Scanner;

public class Array02sumFor {

	public static void main(String[] args) {
		Scanner kb3 = new Scanner(System.in);
		int n = kb3.nextInt(); //n ���� ������ �Է� ���� �ű� ������ (kb3.nextInt = Scanner.nextInt)
		int [] data = new int [n]; //�Է¹��� ������ ������ �迭�� �־�� �ϴϱ�!���̰� n���� �迭�� �����.
		for(int i=0; i<n; i++) //for���� n���� ���Ե�. �ѹ��������� �ϳ��� ����(n)�� �Է� ������ ��
			data[i] = kb3.nextInt();
		kb3.close();
		//n���� ���Ҹ� Ű����κ��� �Է¹޴� �� �Ϸ�! // �׷��� ó�� �Է��ϴ� ���ڰ� �迭�� ������ ��Ÿ����.
		
//		int sum =0; 
//		int max = data[0]; // ���� ����Ÿ ���� �ϳ��� max�� �ִ밪���� �����. 
//	//	int max = 0; //�ִ밪�� ���ϰڴ�. max��� ���� ����
//		for(int i =0; i <n; i++) {
//			sum += data[i]; //���� ���ϴ� ���� �⺻���� �ڵ� sum = sum + data[i]; �� ���� �� 
//			if(data[i] > max) //�����͸� ������� ���� (data[i]) / �׷��� ���纸�� ���� ���� �˰� �ִ� �ִ밪(max)���� ũ�ٸ�, 
//				max = data[i]; //�װ���(data[i]) ���ο� �ִ밪(max)�̴�. 
//		}
//		
//		System.out.println("The sum is  "  + sum);
//		System.out.println("The max is  "  + max);
	}

}
