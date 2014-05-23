/* �߻�Ŭ����, �߻�޼���, �Ϲ�Ŭ�������� �߻�޼��� ��üȭ
 * 
 * �θ� Ŭ���� (�߻� Ŭ���� + �߻� �޼ҵ�)
 * �ڽ� Ŭ���� (�߻� Ŭ���� + �߻� �޼ҵ�)*/ 

package com.abs3;


//�߻� Ŭ����(�θ�)
abstract class AbsEx1{
	int a = 100;
	public int getA(){
		return a;
	}
	
	//�߻� �޼ҵ�
	abstract public int getB();
	abstract public int getC();
}

//�߻� Ŭ����(�ڽ�)
abstract class AbsEx2 extends AbsEx1{
	String msg = "�ż���";
	
	//�߻� Ŭ�����̹Ƿ� �θ� Ŭ������ �߻�޼ҵ带 �ݵ�� ��üȭ�ؾ� �� �ʿ�� �����ϴ�.
	//�߻� �޼ҵ� ��üȭ
	@Override
	public int getB(){
		return 200;
	}
	
	//�߻� �޼ҵ�
	public abstract String getMsg();
}


public class AbstractTest extends AbsEx2{

	@Override
	public String getMsg(){
		return msg;
	}
	
	@Override
	public int getC(){
		return 300;
	}
	
	
	public static void main(String[] args) {
		
		AbstractTest ab = new AbstractTest();
		System.out.println(ab.getA());
		System.out.println(ab.getB());
		System.out.println(ab.getC());
		System.out.println(ab.getMsg());
		
		

	}

}
