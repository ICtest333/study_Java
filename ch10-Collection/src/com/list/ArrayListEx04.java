/* Ȯ�� For��, ArrayList ������ ����/����
 * 
 * ArrayList�� ������ ����
 * ArrayList�� �����͸� Ȯ��For������ ��� 
 * ArrayList�� ������ ����-index����
 * ArrayList�� ������ ����-��ü(���)����
 *  
 * JDK5.0�̻� ���� ��밡��
 * ���������� indexing�ϸ鼭 �����͸� �̾��ְ� �˴ϴ�. 
 */

package com.list;

import java.util.ArrayList;

public class ArrayListEx04 {

	public static void main(String[] args) {
		// ���׸� ǥ������ ��Ʈ���� �Է¹޵��� ����
		ArrayList<String> al = new ArrayList<String>();
		al.add("��Ʈ��");	// String -> Object ��ĳ����
		al.add("ȫ�浿");	// String -> Object ��ĳ����
		al.add("���ϴ�");	// String -> Object ��ĳ����
		al.add("������");	// String -> Object ��ĳ����
		
		//Ȯ�� for������ ���
		for(String name : al){
			System.out.println(name);
		}
		
		System.out.println();
		//����
		al.remove(2);	//�ش� �ε��� ����

		for(String name : al){
			System.out.println(name);
		}

		System.out.println();
		//����
		al.remove("ȫ�浿");	//�ش� ��ü(���) 

		for(String name : al){
			System.out.println(name);
		}
		
		
	}

}
