package Study_workshop;

//import java.util.Scanner;

public class Array13_1 {
	
	public static int maxValue(int[] arr) {
		int max =0;
		max=arr[0];
		for(int i=0; i<arr.length; i++) {
			if(max<arr[i])
				max=arr[i];
		}
		return max;
		
	}
	public static int minValue(int[] arr) {
		int min = 0;
		min=arr[0];
		for(int j=0; j<arr.length; j++) {
			if(min>arr[j])
				min=arr[j];
		}
		return min;
		
	}
	
	public static void main(String[] args) {
		int max =0;
		int min =0;
		
		int [] arr = new int [5];
		arr[0] = 10;
		arr[1] = 77;
		arr[2] = 135;
		arr[3] = 14;
		arr[4] = 25;
		
		
		
		System.out.println("Maximum:" + maxValue(arr));
		System.out.println("Minimum" +minValue(arr));

	}
}
