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

		int max=0; //�� 0�̳�? ����: �̵� �߿��� 0�� �̻��� ���ӵ� �������� ���Ͽ�....
		//�Ǵ� �̷��� ���� ���� �ִ�. 
		for(int i=0; i<num; i++) {
			int sum = 0; //sum�� �� �� ���� �ʱ�ȭ�� �ϰ�
			for(int j=i; j<num; j++) {
				sum += data[j]; //i���� j������ ���� ���ϴ°� / ������ ���س��҈� sum�� ���ο�j�� ���� �����ָ� �Ǵٸ� sum�� ��������. 
				if(sum>max)
					max=sum;
			}
		}
	/*	for(int i=0; i<num; i++) { //i�� �������̶�� �Ҷ� i���� num���� �����Ѵ�. 
			//�׸��� �� i�� ���������� ������ ������ ���� ������ j��� �Ѵٸ�?
			for(int j=i; j<num; j++) { //j�� 0���� ������ �ʿ�� ����. i���� num���� �����ϴ� ������ �����. 
				//j=i��� ���� �������� ������ ���ٴ� �� = ���̰� 1�� ����

				int sum=0; //���� ������
				//���� ������ data[i] ���� data[j]������ ���� ���ϴ°� ��� �ؾ��ұ�? �Ʒ��� ����. for���� �ʿ��ϴ�.
				for(int k=i; k<=j; k++) // k�� i���� �����ؼ� j���� �ϳ��� ������Ų��. �׸��� sum�� data[k]�� �����شٸ�?
					sum += data[k];
				if(sum>max) //sum �� ���� ���� �˰� �մ� max�ִ밪���� ũ�ٸ�?
					max = sum; //�̰��� ���ο� �ִ밪�� �ȴ�. 
			// add data [i] ...[j], if the sum >max , max = the sum;
			}
		} */
		System.out.println(max);
	}
}
