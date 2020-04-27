package Study_workshop;

class Point {
	int xPos;
	int yPos;
	
	public Point(int x, int y) {
		xPos =x;
		yPos =y;
	}
	
	public void showPointInfo() {
		System.out.println("원의 중심좌표:"+ "[" + xPos + "," + yPos + "]");
	}

}

public class Circle { //변수 선언
	int rad; //반지름 변수 int타입의 rad선언
	Point p; //좌표 변수 Point타입의 p선언

	public Circle(int x, int y, int r) { //생성자 
		p = new Point(x,y); //
		rad = r;
	}
	
	public void showCircleInfo() {
		System.out.println("반지름:" + rad);
		p.showPointInfo();
	}

	public static void main(String[] args) {
		Circle c = new Circle(2, 2, 4);
		c.showCircleInfo();
	}

}
