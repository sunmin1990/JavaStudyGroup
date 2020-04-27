package Study_workshop;
//07-1 밑변과 높이 정보를 저장할 수 있는 Triangle클래스를 정의하자. (그 안에 적절한 생성자도 정의하자.) 
//그리고 밑변과 높이 정보를 변경할 수 있는 메소드와 삼각형의 넓이를 계산해서 반환하는 메소드도 함께 정의하자. 
//물론 이 클래스의 활용의 예를 보이는 main메소드도 함께 작성해야 한다. 
public class TriangleArea { //클래스 정의 
	int baseLine;
	int height;
	int area;
	
	public TriangleArea(int bsln, int hgts) { //생성자를 만들자 
	
		baseLine = bsln; //밑변 초기화
		height = hgts;	 //높이 초기화
		area = baseLine*height/2;
	}
	
//	public int calculate(int area) {
//		area = baseLine*height/2; //계산한 값을 반환하자
//		return  area;
//	} 굳이 이렇게 쓰지 않고(불필요함) 밖으로 빼주어서 쓸 수 있다. 
	
	public void answer() {
		System.out.println("삼각형의 밑변"+ baseLine +"그리고" + "삼각형의 높이"+ height +"를 곱하고 2로 나누면 삼각형의 넓이가 됩니다.");
		System.out.println(baseLine + "x" + height + "/2=" + area);
		System.out.println("삼각형의 넓이는"+  area + "입니다.");
	}

	public static void main(String[] args) { //생성자를 호출할 메서드
		TriangleArea triangle1 = new TriangleArea(4, 6); 
		triangle1.answer(); //triangle1이  참조하는 인스턴스(TriangleArea)의 answer메서드 호출 
	}

}
