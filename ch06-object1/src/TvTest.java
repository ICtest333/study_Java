/* TV ä�κ����ϱ� - ��ü ������ ��ü�� ����޼ҵ� ȣ���� ���� ��� ���� ����
 *  
 */

//�� Ŭ������ public���� �� �� �ִ�.
class Tv{	
	//��� ����(�Ӽ�)
	String color;	//����
	boolean power;	//��������
	int channel;	//ä��
	
	//��� �޼ҵ�(����)
	//���� ���� ��ȯ ��Ű��
	public void power(){
		power = ! power;		
	}
	
	//ä�� �ø���
	public void channelUp(){
		++channel;
	}
	
	//ä�� ������
	public void channelDown(){
		--channel;
	}
}

// �� Ŭ����
public class TvTest {
	
	//main�� ��ü�� ���Ե��� ����.
	//�׳� �����Լ��θ� ���
	//Ŭ���� �δ��� main�� �޸𸮿� �ø��� 
	//�� ���� ��ü�� �����մϴ�. ��� �޼ҵ常 ��ü�� ���Ե˴ϴ�.
	public static void main(String[] args) {
		Tv t = new Tv();
		
		System.out.println("TV ���� ���� : " + t.power);
		// ���� �ѱ�
		t.power();
		System.out.println("TV ���� ���� : " + t.power);		
		
		System.out.println();
		System.out.println("���� ä�� : " + t.channel);
		//ä�� �����ϱ�
		t.channel = 7;
		System.out.println("����� ä�� : " + t.channel);
				
		//ä�� ��/�ٿ�
		t.channelDown();
		System.out.println("����� ä�� : " + t.channel);
		
		t.channelUp();
		System.out.println("����� ä�� : " + t.channel);		
		
		System.out.println();
		// TV���� ����
		t.power();
		System.out.println("TV ���� ���� : " + t.power);
		
		t.color = "blue";
	}
}
