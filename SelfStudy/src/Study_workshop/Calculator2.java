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
		System.out.println("더하려는 두 수를 입력해주세요.");
		int adda = operator();
		int addb = operator();
		System.out.println(adda+"+"+addb+"="+(adda+addb));
		System.out.println("곱하려는 두 수를 입력해주세요.");
		int mula = operator();
		int mulb = operator();
		System.out.println(mula+"x"+mulb+"="+(mula*mulb));
		System.out.println("빼려는 두 수를 입력해주세요.");
		int suba = operator();
		int subb = operator();
		System.out.println(suba+"-"+subb+"="+(suba-subb));
		System.out.println("나누려는 두 수를 입력해주세요.");
		int diva = operator();
		int divb = operator();
		System.out.println(diva+"/"+divb+"="+(diva/divb));
	}

}
