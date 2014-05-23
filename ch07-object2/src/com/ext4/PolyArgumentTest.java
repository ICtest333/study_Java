/* �������̵�, 
 * �������� �̿��� �޼ҵ��� ���� ����*/

package com.ext4;

class Product{
	int price;		//��ǰ ����
	int bonusPoint;	//���ʽ� ����
	
	public Product(int price){
		this.price = price;
		bonusPoint = price/10;	//��ǰ������ 10%				
	}
	
	public String getName(){
		return "��ǰ";		
	}	
}

class Tv extends Product{
	public Tv(){
		super(100);	//100����		
	}
	
	@Override
	public String getName(){
		return "TV";
	}
}

class Computer extends Product{
	public Computer(){
		super(200);
	}
	
	@Override
	public String getName(){
		return "COMPUTE";
	}
}

class Audio extends Product{
	public Audio(){
		super(300);
	}
	
	@Override
	public String getName(){
		return "Audio";
	}
}

class Buyer{
	int money = 1000;	//���� �ݾ�
	int bonusPoint = 0;	//���� ���ʽ� ����Ʈ
	
	//Ư�� ��ǰŸ���� ����� ���
	//public void buy(Tv p){
	
	//�θ�Ŭ���� Ÿ������ ���
	public void buy(Product p){
		if(money < p.price){
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			//void ���϶��� return;�ϸ� �ݺ����� ����ȴ�.
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p.getName() + "��(��) �����ϼ̽��ϴ�.");		
	}
}

public class PolyArgumentTest {

	public static void main(String[] args) {
		
		//������ ����
		Buyer b1 = new Buyer();
		//��ǰ ����
		Tv t1 = new Tv();
		Computer c1 = new Computer();
		Audio a1 = new Audio();
		
		System.out.println("���� �ݾ���" + b1.money + "�����Դϴ�");
		
		System.out.println("\n Ƽ���� ����:" + t1.price + "����");
		//TV ����
		b1.buy(t1);		// Tv -> Product Ÿ������ �ڵ������� ����ȯ
		System.out.println("���� ���� ����" + b1.money + "�����Դϴ�");
		System.out.println("���� ���ʽ� ����Ʈ��" + b1.bonusPoint + "���Դϴ�");
		//buy(Tv v) -> buy(Product p)�� �ٲ�� ��� ��ǰ�� ������ �� �ֽ��ϴ�.
		//b1.buy(c1);	//ERROR: The method buy(Tv) in the type Buyer is not applicable for the arguments (Computer)
				
		//COMPUTER����
		System.out.println("\n ��ǻ�� ����:" + c1.price + "����");
		b1.buy(c1);		// Computer -> Product Ÿ������ �ڵ������� ����ȯ
		System.out.println("���� ���� ����" + b1.money + "�����Դϴ�");
		System.out.println("���� ���ʽ� ����Ʈ��" + b1.bonusPoint + "���Դϴ�");
		
		//AUDIO����
		System.out.println("\n ����� ����:" + a1.price + "����");
		b1.buy(a1);		// Audio  -> Product Ÿ������ �ڵ������� ����ȯ
		System.out.println("���� ���� ����" + b1.money + "�����Դϴ�");
		System.out.println("���� ���ʽ� ����Ʈ��" + b1.bonusPoint + "���Դϴ�");
	}
}
