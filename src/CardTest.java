class CardTest{
	public static void main(String args[]) {
		System.out.println("Card.width = "  + Card.width);
		System.out.println("Card.height = " + Card.height);  //Ŭ������.Ŭ�������� (��ü����x)

		Card c1 = new Card();  //c1�̶�� Card �ν��Ͻ�(��ü) ����
		c1.kind = "Heart";    // kind �Ӽ��� �ν��Ͻ� ���� �� ����
		c1.number = 7;        // ���� �Ӽ��� �ν��Ͻ� ���� �� ����

		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;

		System.out.println("c1�� " + c1.kind + ", " + c1.number + "�̸�, ũ��� (" + c1.width + ", " + c1.height + ")" );
		System.out.println("c2�� " + c2.kind + ", " + c2.number + "�̸�, ũ��� (" + c2.width + ", " + c2.height + ")" );		

		System.out.println("c1�� width�� height�� ���� 50, 80���� �����մϴ�.");
		c1.width = 50;   // Ŭ���� ������ �� ���� ����
		c1.height = 80;   // c1�� c2�� Ŭ���������� �����ϱ� ������ c2������ Ŭ���������� �ٲ� ���� ��´�

		System.out.println("c1�� " + c1.kind + ", " + c1.number + "�̸�, ũ��� (" + c1.width + ", " + c1.height + ")" );
		System.out.println("c2�� " + c2.kind + ", " + c2.number + "�̸�, ũ��� (" + c2.width + ", " + c2.height + ")" );
	}
 }

class Card {
	String kind ;				// ī���� ���� - �ν��Ͻ� ����
	int number;				    // ī���� ���� - �ν��Ͻ� ����
	static int width = 100;		// ī���� ��  - Ŭ���� ����
	static int height = 250;	// ī���� ���� - Ŭ���� ����
}
