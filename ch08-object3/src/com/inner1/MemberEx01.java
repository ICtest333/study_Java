/* ���� Ŭ���� - ���� Ŭ���� ��ü ����
 * 
 * 
 * �ƿ��� ��ü ����
 * �ƿ��� ��ü�� ���� �γ�Ŭ���� ��ü ����
 * �ƿ��� ������ ���
 * �ƿ����� �γ�Ŭ������ ������ ���
 * 
 */


package com.inner1;

class Outer{
	int x = 100;
	
	//��� ����Ŭ����
	class Inner{
		int y = 200;
	}
}


public class MemberEx01 {
	public static void main(String[] args){
		//�ƿ��� Ŭ���� ��ü ����
		Outer ot = new Outer();
		
		//��� ���� Ŭ���� ��ü ����
		Outer.Inner oi = ot.new Inner();
		
		System.out.println("x=" + ot.x);
		System.out.println("y=" + oi.y);		
	}
}
