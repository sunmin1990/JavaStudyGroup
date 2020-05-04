package Study_workshop;
import java.util.Scanner;

public class Scanerpractice {

	public static void main(String[] args) {
		String str = "Hello";
		String input = null; //내가 입력하지 않은 변수를 null로 초기화해준다. 
		//input은 하나의 문자열을 저장할수 있는 	변수 이지만 null=아직 문자열이 입력되지 않았다. input=kb.next();라인에 있는 input이 작동할 때 입력된다. 
		Scanner kb = new Scanner(System.in);
		System.out.println("Please type a string");
		input = kb.next(); //next함수는 사용자가 입력한 첫번째 단어만(띄어쓰기 부터 x) 입력이 된다. 
				
				if(str.equals(input)) { //프리미티브 타입의 변수들은 if(int == input)으로 쓴다. str은 프리미티브 타입이 아니기에 equals를 쓴다. 
					System.out.println("Strings match! :)");
				}
				else {
					System.out.println("Strings are not match! :(");
				}
				kb.close();
	}

}
