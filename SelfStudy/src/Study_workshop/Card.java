package Study_workshop;

public class Card {
	
	static int width;
	static int height;
	int number;
	String shape;
	
	public static void main(String[] args) {
		
		Card.width = 40;
		Card.height = 80;
		Card c1 = new Card();
		c1.number=9;
		c1.shape="Heart";
		Card c2 = new Card();
		c2.number=7;
		c2.shape="Spade";
		Card c3 = new Card();
		c3.number=3;
		c3.shape="Diamond";
		
		System.out.println("c1�� ���:"+c1.shape+"c1�� ����:"+c1.number+ "c1�� ���̿� ����:"+ "("+Card.width+","+Card.height+")");
	}

}
