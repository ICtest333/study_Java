/* �������̽� - ���� ���
 * 
 * �������̽� ����
 * �������̽� ���� ���
 * Ŭ�������� �������̽� ����
 * Ŭ������ ��ü ������ �������̽� ȣ��
 * �������̽� �߰� ����
 * Ŭ������ ���� ����
 * */


package com.inter1;


interface Inter1{	
	//�߻� �޼ҵ�
	public int getA();
}

interface Inter2{
	//�߻� �޼ҵ�
	public abstract int getB();
}

//�������̽� ���� ���
interface Inter3 extends Inter1, Inter2{
	public int getData();
}


interface Inter4{
	public abstract int getC();
	
}

// Ŭ�������� ���� ����
public class InterEx03 implements Inter3, Inter4{
	
	@Override
	public int getA(){
		return 100;
	}
	
	@Override
	public int getB(){
		return 200;
	}
	
	@Override
	public int getData(){
		return 300;
	}
	@Override
	public int getC(){
		return 400;
	}

	public static void main(String[] args) {
		
		//Ŭ���� ��ü ����
		InterEx03 in3 = new InterEx03();
		System.out.println(in3.getA());
		System.out.println(in3.getB());
		System.out.println(in3.getC());
		System.out.println(in3.getData());

	}

}
