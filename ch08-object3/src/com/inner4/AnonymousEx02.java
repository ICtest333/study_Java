/* Annonymous ���� Ŭ���� - �͸���Ŭ���� ����
 * 
 * 
 * �θ�Ŭ������ disp() ���
 * 
 * �θ�Ŭ���� disp() �� ������ ���
 * 
 * -----------------------------------------------
 * ���Ǻ�	class Inner extends Inner2{}
 * ������	new Inner();
 * 
 * ���Ǻ� + ������: Anonymous ���� Ŭ���� ���� ����
 * new Inner2()
 * {};	//�������ϴ� ���� 
 * 
 */


package com.inner4;

class Inner2{
	
	public void disp(){
		System.out.println("�θ�Ŭ������ disp");
	}
}

public class AnonymousEx02 {
	
	public void innerTest(){
		
		//�͸� ���� Ŭ����
		Inner2 i = new Inner2(){
			//�θ�Ŭ������ �޼ҵ� ������
			@Override
			public void disp(){
				System.out.println("�͸� ����Ŭ������ disp");				
			}
		};
		i.disp();		
	}
	
	public static void main(String[] args) {
		// ��ü ������ ��� �޼ҵ� ȣ��
		AnonymousEx02 an = new AnonymousEx02();
		an.innerTest();
	}
}
