package Study_workshop;
//07-1 �غ��� ���� ������ ������ �� �ִ� TriangleŬ������ ��������. (�� �ȿ� ������ �����ڵ� ��������.) 
//�׸��� �غ��� ���� ������ ������ �� �ִ� �޼ҵ�� �ﰢ���� ���̸� ����ؼ� ��ȯ�ϴ� �޼ҵ嵵 �Բ� ��������. 
//���� �� Ŭ������ Ȱ���� ���� ���̴� main�޼ҵ嵵 �Բ� �ۼ��ؾ� �Ѵ�. 
public class TriangleArea { //Ŭ���� ���� 
	int baseLine;
	int height;
	int area;
	
	public TriangleArea(int bsln, int hgts) { //�����ڸ� ������ 
	
		baseLine = bsln; //�غ� �ʱ�ȭ
		height = hgts;	 //���� �ʱ�ȭ
		area = baseLine*height/2;
	}
	
//	public int calculate(int area) {
//		area = baseLine*height/2; //����� ���� ��ȯ����
//		return  area;
//	} ���� �̷��� ���� �ʰ�(���ʿ���) ������ ���־ �� �� �ִ�. 
	
	public void answer() {
		System.out.println("�ﰢ���� �غ�"+ baseLine +"�׸���" + "�ﰢ���� ����"+ height +"�� ���ϰ� 2�� ������ �ﰢ���� ���̰� �˴ϴ�.");
		System.out.println(baseLine + "x" + height + "/2=" + area);
		System.out.println("�ﰢ���� ���̴�"+  area + "�Դϴ�.");
	}

	public static void main(String[] args) { //�����ڸ� ȣ���� �޼���
		TriangleArea triangle1 = new TriangleArea(4, 6); 
		triangle1.answer(); //triangle1��  �����ϴ� �ν��Ͻ�(TriangleArea)�� answer�޼��� ȣ�� 
	}

}
