/* ���� Ŭ���� - InnerŬ�������� Outer ������� ȣ��
 *  
 * ��� ���� Ŭ�������� �ƿ��� Ŭ������ ��� ���� ȣ��
 * �������� ������  (�������� �������1 / �������2)
 * �γ�Ŭ������ �޼ҵ� ȣ�� 
 * 
 * -----------------------------------------------------------
 * �������� ������� 1
 * 1) �ƿ��� ��ü ����
 * 2) �ƿ��� ��ü�� ���� �γ� ��ü ����
 * 
 * �������� ������� 2
 * 1) �ƿ��� ��ü ������ ���ÿ� �γ� ��ü ����  
 * 
 */

package com.inner1;

class Outer2{
	//��� ���� ����
	int x = 100;
	//��� ���� Ŭ����
	class Inner2{
		int y = 200;
		
		public void getData(){
			System.out.println("x =" + x);	//Outer2�� �������
			System.out.println("y =" + y);	//Inner2�� �������
		}		
	}	
}

public class MemberEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer2 ot2 = new Outer2();
		Outer2.Inner2 oi2 = ot2.new Inner2();
		
		//���� ������ ���ٷ� ����
		Outer2.Inner2 oi3 = new Outer2().new Inner2();
		
		oi2.getData();
		oi3.getData();
	}
}
