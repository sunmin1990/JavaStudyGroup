package Study_workshop;

import java.util.Scanner;

public class ArrayShift {

	public static void main(String[] args) {
		Scanner kb4 = new Scanner(System.in);
		int n = kb4.nextInt(); //����  ������ ���� n���� �Է� �ް�
		
		int [] data = new int [n]; //n���� ������ ������ �迭�� ����� 
		
		for(int i =0; i < n; i++)
			data[i] = kb4.nextInt(); // n���� ������ ����ڷκ��� �Է¹޾� �迭 data�� ������ �ϰ� 
		kb4.close();
		
		
		int tmp = data[n-1]; //�迭�� �� ������ ��[n-1]�� tmp��� �ӽ� ������ ������ �صα�� ��.
		for(int j = n-2; j>=0; j--) //��(n)���� �ι�° ������(n-2) ��ĭ�� �ڷ� shift�ϴ� �� / �������� i�� ���� ���ҽ�Ű�� �� (���� �ڵ�)
			//i�� ������ �ι�° ��(i=n-2)���� 0(i>=0)�� �ɶ����� 
			data[j+1] = data[j]; //data [i]�� ��ĭ �ڷ� ���� data[i+1] -> �� ���� data[i]�� ���� �ȴ�. 
		
		data[0] = tmp; //�� �������� �ִ� tmp�� �� ������(data[0])�����ٸ�
		
		for(int i=0; i<n; i++)
			System.out.println(data[i]);
	}

}
