/* ���� �ڷ���: ȣ�� ���� ���� - �� ĳ����/�ٿ� ĳ����
 * 
 * ��ü ������ �ڷ����� �θ��ڷ������� ��ü����
 * ���������� ����
 * �θ�Ŭ���� �ν��Ͻ������� �ڽ�Ŭ������ �ν��Ͻ� ���� ȣ��
 * */

package com.ext3;

//�θ� Ŭ����
class Parent{
	int a = 100;	
}

//�ڽ� Ŭ����
class Child extends Parent{
	int b = 200;
}

public class Exten01 {

	public static void main(String[] args) {

		Child ch = new Child();
		System.out.println(ch.a);
		System.out.println(ch.b);

		System.out.println("\n ��ĳ����");
		/*
		�� ĳ����: �ڽ� Ŭ���� Ÿ�Կ��� �θ� Ŭ���� Ÿ������ ����, �ڵ������� ����ȯ	
		�ڽ� Ŭ���� Ÿ�������� ȣ�⿵��: �θ�Ŭ���� + �ڽ�Ŭ����  
		�θ� Ŭ���� Ÿ�������� ȣ�⿵��: �θ�Ŭ����*/
//		��ü ������ �ڷ����� �θ��ڷ����� ����
		Parent pa = ch;
		System.out.println(pa.a);
		//ȣ������� ��� ȣ���Ⱑ
		//System.out.println(pa.b);	//ERROR: b cannot be resolved or is not a fields

		
		System.out.println("\n �θ� Ŭ���� -> �ڽ�Ŭ������ ����� ����ȯ: ");
		//�κ�(�θ�) -> ��ü(�ڽ�)�� ����ȯ�� ��������� ��� 
		Child ch2 = (Child)pa;
		System.out.println(ch2.a);
		System.out.println(ch2.b);
		
	}

}
