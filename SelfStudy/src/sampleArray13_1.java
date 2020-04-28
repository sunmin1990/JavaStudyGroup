
public class sampleArray13_1 {

	public static void main(String[] args) {
		int max=0;
		int [] array = {1,5,15,8,6};
		
		max=array[0];
		for(int i=0; i<5; i++) {
			if (max<array[i])
				max=array[i];
		}
		System.out.println(max);
	}

}
