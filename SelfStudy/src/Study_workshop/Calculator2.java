package Study_workshop;

import java.util.Scanner;

public class Calculator2 {
	public static int operator() {
		Scanner sc = new Scanner(System.in);
		int value =sc.nextInt();
		System.out.println(value);
		return value;
	}

	public static void main(String[] args) {
		System.out.println("���Ϸ��� �� ���� �Է����ּ���.");
		int adda = operator();
		int addb = operator();
		System.out.println(adda+"+"+addb+"="+(adda+addb));
		System.out.println("���Ϸ��� �� ���� �Է����ּ���.");
		int mula = operator();
		int mulb = operator();
		System.out.println(mula+"x"+mulb+"="+(mula*mulb));
		System.out.println("������ �� ���� �Է����ּ���.");
		int suba = operator();
		int subb = operator();
		System.out.println(suba+"-"+subb+"="+(suba-subb));
		System.out.println("�������� �� ���� �Է����ּ���.");
		int diva = operator();
		int divb = operator();
		System.out.println(diva+"/"+divb+"="+(diva/divb));
	}

}
