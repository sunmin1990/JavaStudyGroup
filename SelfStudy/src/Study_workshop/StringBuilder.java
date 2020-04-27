package Study_workshop;
//주민등록 번호의 중간에 삽입된 -를 지우고 공백으로 채워서 출력하는 프로그램을 작성해보자. 단 String Builder 클래스를 활용하여 빈번한 문자열의 생성이 발생하지 않도록 해야한다. 990952-1012999
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
