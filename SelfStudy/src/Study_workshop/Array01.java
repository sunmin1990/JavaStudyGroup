package Study_workshop;

public class Array01 {

	public static void main(String[] args) {
		
		//int [] grades; // int는  grades 배열 타입의 정수이고 그 정수를 []안에 저장한다.
		//grades = new int[5]; //그리고 그 grades배열은 5개이다. 
		int [] grades = new int [5]; //<-한문장으로 만들겠다. 
		
		//만약 내가 실수형 배열을 만들겠다. 
		//double [] height;
		//height = new double[100];
		//한 문장으로 합치면 ->double [] height = new double[100];
		
		//만약 내가 문자형 배열을 만들겠다.
		//char [] word;
		//word = new char[10];
		//한 문장으로 합치면 -> char [] word = new char[10];
		
		//assign some values to the array  
		//하나의 배열을 선언. 그 배열의 크기가 5개인 하나의 배열을 선언 5개의 정수를 저장하고 각각의 변수를 출력하는 것 
		grades[0] = 100;
		grades[1] = 76;
		grades[2] = 92;
		grades[3] = 95;
		grades[4] = 14;
		
		//print out each value 아래의 출력 5번 보다는 for문을 이용하는 것이 좋다.
/*		System.out.println(grades[0]);
		System.out.println(grades[1]);
		System.out.println(grades[2]);
		System.out.println(grades[3]);
		System.out.println(grades[4]);
*/		
		for(int i =0; i<grades.length; i++) { //여기서 i<grades.length;의 grades.length는 5와 같기에 이 부분을 5로 바꾸어도 출력은 된다. 
			System.out.println("Grade" + (i+1) + ":" + grades[i]); //i+1을 한 이유는 배열이 0부터 시작하기때문에 출력 결과를 1부터 뽑고 싶을 때 +1한다.
			
		//만약 while문을 사용하고 싶다면
/*		int i =0;
		while( i < grades.length) {
			System.out.println("Grade" + (i+1) + ":" +grades[i]);
			i++}
*/		
		}
	}

}
