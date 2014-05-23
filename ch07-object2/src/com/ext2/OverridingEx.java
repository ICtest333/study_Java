/* Overriding
 * 
 * �θ�Ŭ���� ��ӹ��� �ڽ� Ŭ��������
 * �θ�Ŭ������ ����޼ҵ带 �������մϴ�. 
 * 
 */

package com.ext2;

//�θ� Ŭ����
class Parent{
	public void make(){
		System.out.println("�θ� Ŭ����");
	}
}

//�ڽ� Ŭ����
class Child extends Parent{
	
	//�޼��� ���������(�޼ҵ� ������)
	@Override
	public void make(){
		System.out.println("�ڽ� Ŭ����");
	}
	
	//@Override: JDK 5.0�̻���� ��� ����
	//�����ǰ� ������ �°� ����Ǿ����� ����
	/*@Override
	public void meke(){
		System.out.println("�ڽ� Ŭ����");
	}*/
	//ERROR:The method meke() of type Child must override or implement a supertype method	
	
}

public class OverridingEx {
	
	public static void main(String[] args){
		Child ch = new Child();
		ch.make();
	}
}
