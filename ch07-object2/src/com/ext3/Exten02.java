/* ���� �ڷ���: ȣ�� ���� ���� - �� ĳ����/�ٿ� ĳ���� 
 * 
 * �� ĳ���ð� �ٿ� ĳ������ 
 * ���������� ����
 * �θ�Ŭ���� �ν��Ͻ� �޼ҵ� ȣ��/�ڽ�Ŭ������ �ν��Ͻ� �޼ҵ� ȣ��
 * */

package com.ext3;

class A{
	public void make(){
		System.out.println("AŬ����");
	}
}

class B extends A{
	public void play(){
		System.out.println("BŬ����");
	}
}

public class Exten02 {

	public static void main(String[] args) {

		System.out.println("\n�ڽ� ��ü ����: ");
		B nB = new B();
		nB.make();
		nB.play();
		
		System.out.println("\n�� ĳ����: ");
		//�ڽ� Ŭ���� Ÿ�� -> �θ� Ŭ���� Ÿ�� ����ȯ
		//�� ĳ����, �ڵ������� ����ȯ
		A nA = nB;
		nA.make();
		//ȣ�� ������ ��� ȣ�� �Ұ�
		//nA.play();	//ERROR: The method play() is undefined for the type A
		
		System.out.println("\n�ٿ� ĳ����: ");
		//�θ� Ŭ���� Ÿ�� -> �ڽ� Ŭ���� Ÿ�� ����ȯ
		//�ٿ� ĳ����, ��������� ����ȯ
		B nB2 = (B)nA;
		nB2.make();
		nB2.play();
	}
}
