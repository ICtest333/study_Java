/* ����� �������̵� / �� �ɽ���
 * ���� ��Ģ) ��ӽ� �޼ҵ� �������̵� �Ǿ� ������ Ȯ��Ǿ� �ִ� ���� ȣ��ȴ�.
 * 
 * 
 * */

package com.ext3;

class Parent3{
	int a = 100;
	public void play(){
		System.out.println("�θ� Ŭ����");
	}
}

class Child3 extends Parent3{
	int a = 200;

	@Override
	public void play(){
		System.out.println("�ڽ� Ŭ����");
	}
}

public class Exten03 {

	public static void main(String[] args) {
		
		Child3 ch3 = new Child3();		
		System.out.println(ch3.a);
		ch3.play();
		
		System.out.println("\n���ɽ���: ");
		//�θ� Ŭ���� Ÿ������
		Parent3 np3 = ch3;
		System.out.println(np3.a);
		np3.play();
		
		
		

	}

}
