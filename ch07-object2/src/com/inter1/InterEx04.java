/* �������̽� - �ڷ������� ���
 * 
 * �������̽� ����
 * Ŭ����Ÿ�� -> �������̽�Ÿ������ �ڵ������� ����ȯ
 * �������̽�Ÿ�� -> Ŭ���� Ÿ�� ����� ����ȯ
 * 
 * */

package com.inter1;

interface Inter5{
	public abstract void play();
}

//�������̽� ����
public class InterEx04 implements Inter5{
	
	@Override
	public void play(){
		System.out.println("play �޼ҵ�");
	}
	
	public void make(){
		System.out.println("Make �޼ҵ�");
	}

	public static void main(String[] args) {
		// 
		InterEx04 it04 = new  InterEx04();
		it04.play();
		it04.make();
		
		System.out.println();
		//Ŭ����Ÿ�� -> �������̽�Ÿ������ �ڵ������� ����ȯ
		Inter5 it5 = it04;	 
		it5.play();
		
		//ȣ�� ������ ��� ȣ�� �Ұ���
		//it5.make();	//ERROR: The method make() is undefined for the type Inter5
		
		System.out.println();
		//�������̽� -> Ŭ����Ÿ������ ��������� ����ȯ
		InterEx04 it02 = (InterEx04)it5;		
		it02.play();
		it02.make();
	}
}
