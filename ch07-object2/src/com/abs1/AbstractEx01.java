/* �߻� Ŭ����*/

package com.abs1;

//�߻� Ŭ����
//�ܵ����� ��ü������ �Ұ����ϰ� ��ӵǾ����� ���Ǿ����� ��
//�߻� Ŭ������ �߻�޼��尡 ���� ��쵵 ������ �Ϲ������� �߻�޼ҵ带 �Ѱ� �̻� ���� ����
abstract class A{

	int a=100;
	
	//�߻� �޼ҵ�:
	public abstract void number();	//�̱����� �޼���
									//�ݵ�� �ڽ� Ŭ�������� �Ϲ� �޼ҵ�� ������ ��� �մϴ�.
	
	//�Ϲ� �޼ҵ�
	public void setA(int a){this.a = a;};
	
}
class B extends A{
	int b = 200;
	
	//�߻� �޼ҵ� -> �Ϲ� �޼ҵ�� ����
	//AŬ������ �߻� �޼��� number()�� �Ϲݸ޼ҵ� number()�� ����
	@Override
	public void number(){
		System.out.println("number �޼���");
	}
}

public class AbstractEx01 {

	public static void main(String[] args) {

		//�߻� Ŭ������ ��ü ���� �Ұ���
		//�θ� Ŭ���� ���� �� �մϴ�.
		//A a1 = new A(); //ERROR: Cannot instantiate the type A
		
		B b1 = new B();
		System.out.println(b1.a);
		System.out.println(b1.b);
		b1.number();
		
		
	}
}
