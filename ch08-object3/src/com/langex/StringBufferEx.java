/* StringBuffer
 * 
 * ��ü ����
 * Ư�� �ε����� ���� ����
 * ���ڿ� ���� ���ڿ� ���̱�
 * ���ڿ� ��ü
 * ���ڿ� ����
 * ���ڿ� ����Ϸ��� ��Ʈ������ �����ϱ�
 */

package com.langex;

public class StringBufferEx {

	public static void main(String[] args) {
		//
		StringBuffer sb = new StringBuffer("�ڹ� ���� ����!!");
		//�ڹ�   ����   ����! !
		//0 1  2 3 4  5 6 7 8 9
		System.out.println("1: " + sb);
		
		//Ư�� �ε����� ���� ����
		sb.insert(2, '��');
		System.out.println("2: " +sb);
		
		//���ڿ� ���� ���ڿ� ���̱�
		sb.append("����Ŭ��");
		System.out.println("3: " +sb);
				
		sb.append(" ����ִ�");
		System.out.println("4: " +sb);
		
		//���ڿ� ��ü
		sb.replace(0,  3, "C#");
		System.out.println("5: " +sb);
		
		//���ڿ� ����
		sb.delete(0, 3);
		System.out.println("6: " +sb);
		
		//���ڿ� ����Ϸ��� ��Ʈ������ �����ϱ�
		String str = sb.toString();
		System.out.println("7: " +str);
	}

}
