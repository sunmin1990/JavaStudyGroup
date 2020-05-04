package Study_workshop;

import java.util.Scanner;

public class Array07 {
	public static void main(String[] args) {
		Scanner keb = new Scanner(System.in);
		
		int n = keb.nextInt();
		int [] data = new int [n];
		
		for(int i =0; i<n; i++)
			data[i] = keb.nextInt();
		keb.close();
		
		int max =0;
		for(int i=0; i<n; i++) {
			for(int j=i; j<n; j++) {
				
				//convert data[i]... data[j] into an integer
				int val =0;
				for(int k=i; k<=j; k++)
					val = val *10 + data[k];

				//text if it is a prime
				boolean isPrime = true;
				for(int k=2; k*k<=val && isPrime; k++) 
					if(val % k == 0)
						isPrime = false;
	
				//if yes, compare to the max
				if(isPrime && val >max)
					max = val;
			}
		}
		if(max>0)
		System.out.println(max);
		else
			System.out.println("There is no Prime number.");
	}

}
