/* String Ŭ���� - �߿� �޼ҵ� Ȯ��
 *  
 * �յڿ� ���� �ΰ��� �����ִ� ���ڿ� ����
 * �������� �ʱ�ȭ
 * ���ڿ� ��ü
 * �����ڸ� �빮�ڷ�
 * �����ڸ� �ҹ��ڷ�
 * ���� ����
 * Ư�� ���ڿ� ���� ���� �˻�
 */

package com.langex;

public class StringEx03 {

	public static void main(String[] args) {
		// 
		String str = "  aaaaabbAAABB  ";
		
		//null�� ��ü�� ������ ���� �ȵǾ�����
		//������ �ȳ��� �� �������� null 
		String msg1 = null;
		
		//���ڿ�
		//char[]�� �����Ǿ String�� ��������� ���ڿ��̸� �����Ͱ� ������ �ʱ�ȭ �� �� ����մϴ�.
		//�����Ͱ� ���� ��ü�� ����
		String msg2 = "";
		
		//���ڿ� ��ü
		msg2 = str.replace("aa", "b");
		System.out.println("msg2: " + msg2);
		
		//�����ڸ� �빮�ڷ�
		msg1 = str.toUpperCase();
		System.out.println("msg1: " + msg1);
		//�����ڸ� �ҹ��ڷ�
		msg1 = msg1.toLowerCase();
		System.out.println("msg1: " + msg1);
		
		//���� ����
		msg2 = str.trim();
		System.out.println("msg2: " + msg2);
		
		//Ư�� ���ڿ� ���� ���� �˻�
		boolean f = str.contains("aa");
		System.out.println("f: " + f);		
	}
}
