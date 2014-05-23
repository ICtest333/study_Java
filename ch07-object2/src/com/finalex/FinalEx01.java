/*����� final ����*/

package com.finalex;

public class FinalEx01 {
	
	//����
	int var1 = 100;
	
	//���(��ü ��� ���ȭ)
	final int var2 = 300;
	
	//��� (����ƽ ���ȭ)
	public static final int VAR3 = 400;

	public static void main(String[] args) {
		
		FinalEx01 f1 = new FinalEx01();
		System.out.println("f1.var1 ���� �� ��: ");
		System.out.println(f1.var1);
		
		
		f1.var1 = 200;
		System.out.println("f1.var1 ���� �� ��: ");
		System.out.println(f1.var1);		
		
		//����� ����Ұ�
		//f1.var2 = 300;	//ERROR:The final field FinalEx01.var2 cannot be assigned
		System.out.println("final ���(f1.var2) ȣ��: ");
		System.out.println(f1.var2);
		
		//STATIC��� ȣ��
		System.out.println("STATIC���(VAR3) ȣ��: ");
		System.out.println(VAR3);
		
		//��� (�������� ���ȭ)
		final int NUM = 100;
		System.out.println("���������� ���ȭ: ");
		System.out.println(NUM);
	}

}
