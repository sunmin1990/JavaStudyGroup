package Study_workshop;

import java.util.Scanner;

public class Calculator3 {
	public static int multiOperator() {
		Scanner scan = new Scanner(System.in);
		int val =scan.nextInt();
		return val;
	}

	public static void main(String[] args) {
		System.out.println("��Ģ������ �� �� ���� �Է��ϼ���.");
		int a = multiOperator();
		int b = multiOperator();
		System.out.println("����");
		System.out.println(a+"+"+b+"="+(a+b));
		System.out.println("����");
		System.out.println(a+"x"+b+"="+(a*b));
		System.out.println("����");
		System.out.println(a+"-"+b+"="+(a-b));
		System.out.println("������");
		System.out.println(a+"/"+b+"="+(a/b));
		

	}

}
