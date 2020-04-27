package Study_workshop;

class Point {
	int xPos;
	int yPos;
	
	public Point(int x, int y) {
		xPos =x;
		yPos =y;
	}
	
	public void showPointInfo() {
		System.out.println("���� �߽���ǥ:"+ "[" + xPos + "," + yPos + "]");
	}

}

public class Circle { //���� ����
	int rad; //������ ���� intŸ���� rad����
	Point p; //��ǥ ���� PointŸ���� p����

	public Circle(int x, int y, int r) { //������ 
		p = new Point(x,y); //
		rad = r;
	}
	
	public void showCircleInfo() {
		System.out.println("������:" + rad);
		p.showPointInfo();
	}

	public static void main(String[] args) {
		Circle c = new Circle(2, 2, 4);
		c.showCircleInfo();
	}

}
