/* Annonymous ���� Ŭ���� - �������
 * 
 * 
 * �θ�Ŭ������ disp���
 * 
 * �θ�Ŭ���� disp�������� ���
 * 
 * -------------------------------------------
 * ���Ǻ�	class Inner extends Inner2{}
 * ������	new Inner();
 * 
 * ���Ǻ� + ������
 * new Inner2()
 * {};	//�������ϴ� ���� 
 * 
 */


package com.inner4;

//
class Inner3{
	//
	public void disp(){
		System.out.println("�θ�Ŭ������ disp");
	}
}

public class AnonymousEx03 {
		
	public void innerTest(){
		
		//���Ǻο� �����θ� ���� ����� ���·� ����
		//�͸� ���� Ŭ������ �޼ҵ� �ٷ� ȣ��
		new Inner3(){
			@Override
			public void disp(){
				System.out.println("�͸� ����Ŭ���� ����� disp");				
			}
		}.disp();		
	}
	
	public static void main(String[] args) {
		// ��ü ������ ��� �޼ҵ� ȣ��
		AnonymousEx03 an = new AnonymousEx03();
		an.innerTest();
	}
}
