/* super
 *  
 * �����ڸ� �̿��� �θ�Ŭ������ �޼ҵ� ȣ��
 * ������ �޼ҵ带 ���� �θ�Ŭ������ �޼ҵ� ȣ��
 * �޼ҵ� ������
 * */

package com.ext2;

//�θ� Ŭ����
class A{
	
	int a = 100;
	
	public void play(){
		System.out.println("�θ� Ŭ������ play");
	}
}

//�ڽ� Ŭ����
class B extends A{
	
	int a = 100; 
	//super.a�� �θ�Ŭ������ a�� ȣ���Ѵ�.
	//int a = super.a;
	
	
	//�̿����� �����ϴ� ������
	//super.a ȣ���ؼ� �θ�Ŭ���� ���� Ȯ���ϴ� ���̿���
	//super.a�� 500�� ���ε��� �����ϰ� �ȴ�.
	//super.a = 500;
	
	//�����ڸ� �̿��� �θ�Ŭ������ �޼ҵ� ȣ��
	public B(){
		//�θ� Ŭ������ play()�޼��� ȣ��
		super.play();
		System.out.println("super.a: " + super.a);		
	}
	
	//������ �޼ҵ带 ���� �θ�Ŭ������ �޼ҵ� ȣ��
	public void getParentPlay(){
		super.play();
		System.out.println("super.a: " + super.a);
	}
	
	//�޼ҵ� ������
	@Override
	public void play(){
		System.out.println("�ڽ� Ŭ������ play");
	}
}

public class SuperEx01 {
	
	public static void main(String[]  args){
		
		System.out.println("�����ڸ� ���� �θ� �޼ҵ� ȣ��:");
		B bb = new B();
		bb.play();
		
		System.out.println();
		System.out.println("�ڽ�Ŭ�������� ���� �޼ҵ带 �����Ͽ� �θ� �޼ҵ� ȣ��:");
		bb.getParentPlay();
		
		System.out.println();
		System.out.println(bb.a);
	}
}
