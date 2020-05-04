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
		System.out.println("사용하려는 사칙연산의 번호를 입력하세요. 1:덧셈  2:곱셈  3:뺄셈  4:나눗셈  9:다시하기  0:종료");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
	
		switch(n) {
		case 1:
			System.out.println("더하려는 두 수를 입력하세요.");
			Calculator4.add();
			break;
		case 2:
			System.out.println("곱하려는 두 수를 입력하세요.");
			Calculator4.multi();
			break;
		case 3:
			System.out.println("빼려는 두 수를 입력하세요.");
			Calculator4.sub();
			break;
		case 4:
			System.out.println("나누려는 두 수를 입력하세요.");
			Calculator4.divi();
			break;
		}
		
	}

}
