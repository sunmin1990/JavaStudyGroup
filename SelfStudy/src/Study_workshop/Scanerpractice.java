package Study_workshop;
import java.util.Scanner;

public class Scanerpractice {

	public static void main(String[] args) {
		String str = "Hello";
		String input = null; //���� �Է����� ���� ������ null�� �ʱ�ȭ���ش�. 
		//input�� �ϳ��� ���ڿ��� �����Ҽ� �ִ� 	���� ������ null=���� ���ڿ��� �Էµ��� �ʾҴ�. input=kb.next();���ο� �ִ� input�� �۵��� �� �Էµȴ�. 
		Scanner kb = new Scanner(System.in);
		System.out.println("Please type a string");
		input = kb.next(); //next�Լ��� ����ڰ� �Է��� ù��° �ܾ(���� ���� x) �Է��� �ȴ�. 
				
				if(str.equals(input)) { //������Ƽ�� Ÿ���� �������� if(int == input)���� ����. str�� ������Ƽ�� Ÿ���� �ƴϱ⿡ equals�� ����. 
					System.out.println("Strings match! :)");
				}
				else {
					System.out.println("Strings are not match! :(");
				}
				kb.close();
	}

}
