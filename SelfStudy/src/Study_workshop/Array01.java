package Study_workshop;

public class Array01 {

	public static void main(String[] args) {
		
		//int [] grades; // int��  grades �迭 Ÿ���� �����̰� �� ������ []�ȿ� �����Ѵ�.
		//grades = new int[5]; //�׸��� �� grades�迭�� 5���̴�. 
		int [] grades = new int [5]; //<-�ѹ������� ����ڴ�. 
		
		//���� ���� �Ǽ��� �迭�� ����ڴ�. 
		//double [] height;
		//height = new double[100];
		//�� �������� ��ġ�� ->double [] height = new double[100];
		
		//���� ���� ������ �迭�� ����ڴ�.
		//char [] word;
		//word = new char[10];
		//�� �������� ��ġ�� -> char [] word = new char[10];
		
		//assign some values to the array  
		//�ϳ��� �迭�� ����. �� �迭�� ũ�Ⱑ 5���� �ϳ��� �迭�� ���� 5���� ������ �����ϰ� ������ ������ ����ϴ� �� 
		grades[0] = 100;
		grades[1] = 76;
		grades[2] = 92;
		grades[3] = 95;
		grades[4] = 14;
		
		//print out each value �Ʒ��� ��� 5�� ���ٴ� for���� �̿��ϴ� ���� ����.
/*		System.out.println(grades[0]);
		System.out.println(grades[1]);
		System.out.println(grades[2]);
		System.out.println(grades[3]);
		System.out.println(grades[4]);
*/		
		for(int i =0; i<grades.length; i++) { //���⼭ i<grades.length;�� grades.length�� 5�� ���⿡ �� �κ��� 5�� �ٲپ ����� �ȴ�. 
			System.out.println("Grade" + (i+1) + ":" + grades[i]); //i+1�� �� ������ �迭�� 0���� �����ϱ⶧���� ��� ����� 1���� �̰� ���� �� +1�Ѵ�.
			
		//���� while���� ����ϰ� �ʹٸ�
/*		int i =0;
		while( i < grades.length) {
			System.out.println("Grade" + (i+1) + ":" +grades[i]);
			i++}
*/		
		}
	}

}
