/* String Ŭ���� - �Ͻ��� ��ü ����/����� ��ü ����
 * 
 * <�Ͻ��� ��ü ����>
 * ��Ʈ�� ��ü ����-���ͷ��� �̿��Ͽ� ���ڿ� ����
 * ��ü �� 
 * ��ü�� ����(���ڿ�) ��
 * 
 * 
 * <����� ��ü ����>
 * ����� ��ü ����- new�����ڸ� �̿��Ͽ� ���ڿ� ����
 * ��ü ��- ������ġ�� �����ϴ��� ���� �˻�
 * ��ü�� ����(���ڿ�) ��
 * - ��������� ��ü ������ �ٸ� ��ü�̸� hashCode() ���� �����ϰ� ���͵� �ٸ� ���̴�. �׷��� ��ü �񱳸� �غ��� ��ü�� �ٸ��� Ȯ�� �� �� �ִ�.
 * �̴� ���������� String�� �ٸ��� ó���� �ְ� �ֱ� �����Դϴ�. 
 * 
 * (�߿�) ���ڿ� �񱳽� equals()�� ���ؾ� �մϴ�.
 * 
 * */

package com.langex;

public class StringEx01 {

	public static void main(String[] args) {
		// �Ͻ��� ��ü ����
		String str1 ="Hello";
		String str2 ="Hello";

		//��ü �� 
		if( str1 == str2){
			System.out.println("str1�� str2�� ���� ��ü");
		}else{
			System.out.println("str1�� str2�� �ٸ� ��ü");
		}
				
		//��ü�� ����(���ڿ�)��
		if(str1.equals(str2)){
			System.out.println("str1�� str2�� ������ ����");
		}else{
			System.out.println("str1�� str2�� ������ �ٸ���");
		}
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println("\n================================");
		//����� ��ü ����
		String msg1 = new String("World");
		String msg2 = new String("World");
		
		//��ü ��- ������ġ�� �����ϴ��� ���� �˻�
		if( msg1 == msg2){	
			System.out.println("msg1�� msg2�� ���� ��ü");
			//������ World���ڿ������� �Ź� ���Ӱ� �����Ǳ� ������ ��ġ���� ���� �ٸ��� �ȴ�.
		}else{
			System.out.println("msg1�� msg2�� �ٸ� ��ü");
		}
		
		//��ü�� ���� ��
		if(msg1.equals(msg2)){
			System.out.println("msg1�� msg2�� ������ ����");
		}else{
			System.out.println("msg1�� msg2�� ������ �ٸ���");
		}
		
		System.out.println(msg1.getClass());
		System.out.println(msg2.getClass());
		System.out.println(msg1.hashCode());
		System.out.println(msg2.hashCode());
		System.out.println(msg1);
		System.out.println(msg2);
	}

}
