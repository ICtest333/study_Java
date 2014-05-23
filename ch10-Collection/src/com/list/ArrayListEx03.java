/* ArrayList - �����߻� (�ٿ�ĳ���ý�)
 * 
 * String���� �ƴ� �ٸ� ���������� �ԷµǾ� 
 * �ٿ�ĳ���ý� �����߻�(�����Ͻ� ������ ������ ����� �����߻�)
 * ���׸� ǥ������ ���� ����(ArrayList03_1.java)�Ͽ� �ذ�  
 */

package com.list;

import java.util.ArrayList;

public class ArrayListEx03 {

	public static void main(String[] args) {
		// 
		ArrayList al = new ArrayList();
		al.add("��Ʈ��");	// String -> Object ��ĳ����
		al.add("ȫ�浿");	// String -> Object ��ĳ����
		al.add("������");	// String -> Object ��ĳ����
		al.add("���ϴ�");	// String -> Object ��ĳ����

		al.add(new Integer(100));	//Integer -> Object ��ĳ����
		al.add("��ũ");		
		
		//�����Ͻ� ������ ������ ����� �����߻�
		for(int i=0; i<al.size(); i++){
			String name = (String)al.get(i);	//ERROR: java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
			//���
			System.out.println(name);
		}
	}
}
