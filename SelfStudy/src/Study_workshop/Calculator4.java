package Study_workshop;

import java.util.Scanner;

public class Calculator4 {
	
	public static void add() {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println(a +"+"+ b +"="+ (a+b));
		return;
	}
	public static void multi() {
		Scanner scanner = new Scanner(System.in);
		int a2 = scanner.nextInt();
		int b2 = scanner.nextInt();
		System.out.println(a2+"*"+b2+"="+(a2*b2));
		return;
	}
	public static void sub() {
		Scanner scanner = new Scanner(System.in);
		int a3 = scanner.nextInt();
		int b3 = scanner.nextInt();
		System.out.println(a3+"-"+b3+"="+(a3-b3));
		return;
	}
	public static void divi() {
		Scanner scanner = new Scanner(System.in);
		int a4 = scanner.nextInt();
		int b4 = scanner.nextInt();
		System.out.println(a4+"/"+b4+"="+(a4-b4));
		return;
	}

	public static void main(String[] args) {
		System.out.println("����Ϸ��� ��Ģ������ ��ȣ�� �Է��ϼ���. 1:����  2:����  3:����  4:������  9:�ٽ��ϱ�  0:����");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
	
		switch(n) {
		case 1:
			System.out.println("���Ϸ��� �� ���� �Է��ϼ���.");
			Calculator4.add();
			break;
		case 2:
			System.out.println("���Ϸ��� �� ���� �Է��ϼ���.");
			Calculator4.multi();
			break;
		case 3:
			System.out.println("������ �� ���� �Է��ϼ���.");
			Calculator4.sub();
			break;
		case 4:
			System.out.println("�������� �� ���� �Է��ϼ���.");
			Calculator4.divi();
			break;
		}
		
	}

}
