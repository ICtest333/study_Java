/* ArrayList - ArrayList ��ü ���� �� ������ ���
 *  
 * import
 * ��ü����
 * ArrayList ��ü�� ������ ����
 * ArrayList�� �����͸� ��� 
 */

package com.list;

import java.util.ArrayList;

public class ArrayListEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add("��Ʈ��");	// String -> Object ��ĳ����
		al.add("ȫ�浿");	// String -> Object ��ĳ����
		al.add("������");	// String -> Object ��ĳ����
		al.add("���ϴ�");	// String -> Object ��ĳ����
		al.add("���۸�");	// String -> Object ��ĳ����
		al.add("�����̴���");	// String -> Object ��ĳ����
		
		for(int i=0; i<al.size(); i++){
			//al.get(i);	//Objcet type
			
			//Object -> String �ٿ�ĳ����
			String name = (String)al.get(i);
			
			//���
			System.out.println(name);			
		}	
	}
}