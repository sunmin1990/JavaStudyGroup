package Study_workshop;
//�ֹε�� ��ȣ�� �߰��� ���Ե� -�� ����� �������� ä���� ����ϴ� ���α׷��� �ۼ��غ���. �� String Builder Ŭ������ Ȱ���Ͽ� ����� ���ڿ��� ������ �߻����� �ʵ��� �ؾ��Ѵ�. 990952-1012999
import java.util.Scanner;
import java.lang.String;

public class StringBuilder {


	public static void main(String[] args) {
		Scanner idNum = new Scanner(System.in);
		System.out.println("Type Your ID Number:");
		String str = idNum.next();
		
		String idn = str.replace("-", " ");
			
		System.out.println(idn);
		
		idNum.close();

	}


}
