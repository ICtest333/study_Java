/* ��� - ��� �޼ҵ�
 * 
 */

package com.ext1;

//�θ� Ŭ����
class A{
	public void make(){
		System.out.println("�θ� Ŭ����");
	}
}

//�ڽ� Ŭ���� -> ���
class B extends A{
	public void fun(){
		System.out.println("�ڽ� Ŭ����");
	}
}

public class Exten02 {
	
	public static void main(String[] args){
		
		B bb = new B();
		bb.make();
		bb.fun();		
	}
}