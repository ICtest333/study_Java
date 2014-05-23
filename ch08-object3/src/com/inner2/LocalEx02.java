/* ���� ���� Ŭ���� 
 * 
 * ���� ���� Ŭ������ ���ó��� Ŭ������ ��ġ�� �޼ҵ��� �������� ȣ�� �Ұ���
 * �׷���, ���ȭ�ϸ� ȣ�Ⱑ���ϴ�.
 */


package com.inner2;

public class LocalEx02 {
	//��� ����
	int a = 100;
	
	//��� �޼ҵ�
	public void innerTest(){
		//���� ����
		int b = 200;
		
		//���� ���� Ŭ����
		class Inner{
			int c = 300;
			final int NUM = 400;
			
			public void getData(){
				
				System.out.println("a = " + a);
				
				//���� ���� Ŭ������ ���ó��� Ŭ������ ��ġ�� �޼ҵ忡�� �������� ȣ�� �Ұ���
				//System.out.println("b = " + b);
				System.out.println("c = " + c);
				System.out.println("NUM = " + NUM);
			}
		}
		
		//��ü ����
		new Inner().getData();
	}
	
	
	public static void main(String[] args) {
		// 		
		LocalEx02 le2 = new LocalEx02();
		le2.innerTest();
	}
}
