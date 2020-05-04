package Study_workshop;

public class ArrayisPrime {

	public static void main(String[] args) {
		
		int n =10110;
		boolean isPrime = true; //isPrime이라는 변수를 선언하고 true로 초기화를 한다.
/*		for(int i=2; i<=n/2; i++) { //n이 소수 인지 아닌지 구하려면먼저 n이 약수가 있는지 알아봐야함. i는 2부터 시작하고 증가해서 n을 2로 나눈것 까지이다. 
 * 									//n/2말고도 또는 루트n까지만 돌면 된다. 왜? 약수는 항상 짝이 존재하기 때문이다.
 * 									//다른 말로는 i*i(즉, i의 제곱이 루트n)과 같가는 뜻이다.
			if(n % i == 0) {//만약 n을 i로 나누어서 나머지가 0으로 똑 떨어진다면 i는 n의 약수가 된다. 반대로 나누어 떨어지지 않는 다면 소수(prime number)이다.
				isPrime =false;//나누어 떨어지는 숫자가 하나라도 있으면 소수가 아니다. 
				break; // 계속 돌지 않도록 break를 써서 빠져나올 수 있도록 한다. 
			} //또는 아래와 같이 쓸 수 있다.
*/			
		for(int i=2; i*i<=n && isPrime; i++) { // && isPrime이라는 조건을 이곳에 넣는다.for문이 돌다가 isPrime = false라는 조건을 만나면 즉기 멈춘다.
			if(n % i == 0) {//만약 n을 i로 나누어서 나머지가 0으로 똑 떨어진다면 i는 n의 약수가 된다. 반대로 나누어 떨어지지 않는 다면 소수(prime number)이다.
				isPrime =false;//나누어 떨어지는 숫자가 하나라도 있으면 소수가 아니다. 
				}
		}
		
		if(isPrime) //isPrime이 만약 true라면
			System.out.println(n + "  는/은   소수입니다."); //소수이기 때문에 n을 출력해 준다. 
			

	}

}
