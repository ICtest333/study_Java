/* String Ŭ���� - �߿� �޼ҵ� Ȯ��
 * 
 * ���ڿ� ��ü ����
 * �ε��� ����
 * ���� ����
 * ���ڿ� ����
 * Ư�����ڿ��� ���� ���ڿ� ����������
 * ���ؽ���ŭ ���ڿ� ��������
 * ���ڿ� ���� ���ϱ�
 * �����ڸ� �̿��� ���ڿ� ����
 * 
 */


package com.langex;

public class StringEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name ="Hong Kil Dong";
		//Hong	 Kil   D o  n  g	  
		//0123 4 567 8 9 10 11 12
		int index = name.indexOf('n');
		System.out.println("�� ó�� ���� n�� ��ġ: " + index);
		
		index = name.indexOf("Kil");
		System.out.println("���ڿ� Sun�� ��ġ: " + index);			
		
		index = name.lastIndexOf('n');
		System.out.println("������ ���� n�� ��ġ: " + index);
		
		System.out.println();
		//���� ����
		char c = name.charAt(index);
		System.out.println("������ ����: " +c);
		
		System.out.println();
		//���ڿ� ����
		index = name.indexOf('K');
		System.out.println("���� K�� ��ġ: " + index);
		
		System.out.println();
		//�빮�� K�κ��� ���ڿ� ������ ����
		String str = name.substring(index);
		System.out.println("�빮�� K�κ��� ���ڿ� ������ ����: " + str);
		
		System.out.println();
		index = 5;
		//�ε��� ��ŭ ���ڿ� ��������(endindex�� index -1)
							// 5  ,	 8 -> index 5 6 7
		str = name.substring(index, index+3);
		System.out.println("�ε��� 5~7: " + str);
		
		System.out.println();
		//���ڿ� ���� ���ϱ�
		int length = name.length();
		System.out.println("name�� ���ڿ� ����: " + length);
		
		System.out.println();
		//�����ڸ� �̿��� ���ڿ� ����
		String[] arr = name.split(" ");
		for(int i=0; i<arr.length; i++){
			System.out.println("arr["+i+"]: " + arr[i]);
		}		
	}
}
