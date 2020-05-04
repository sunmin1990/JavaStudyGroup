package Study_workshop;

import java.util.Scanner;

public class ScanerStudy02 {

	public static void main(String[] args) {
		String name;
		int age;
		String gender;
		
		Scanner kb2 = new Scanner (System.in); //키보드(kb2)를 표현하는 스캐너를 새로 만들었음. 
		System.out.println("Please type your name, your age and gender");
		name = kb2.next();
		age = kb2.nextInt();
		gender = kb2.next();
		
		if(gender.equals("male"))
			System.out.println(name+ ", you're " + age +" years old man.");
		else if(gender.equals("female"))
			System.out.println(name+ ", you're " + age +" years old woman.");
		else
			System.out.println("Hmmm.... interesting.");
		
		kb2.close();
		
		

	}

}
