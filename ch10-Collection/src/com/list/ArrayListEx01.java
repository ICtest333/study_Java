/* ArrayList - ArrayList�� ��ü�� ������� ������� Ȯ��
 * 
 * import
 * ArrayList�� ��ü�� ����
 * ArrayList�� ��ü�� ������� ������� Ȯ���ϱ�
 * ObjectŬ������ ToString()�������ؼ� �����Ͱ� ��� Ȯ���ϱ� 
 */

package com.list;

import java.util.ArrayList;

class A{
	
	//Object�� �ִ� toString()������: ������ ��µǴ� ���� �����Ͱ��� ��µǵ��� ������
	@Override
	public String toString(){
		return "A";
	}	
}

public class ArrayListEx01 {

	public static void main(String[] args) {
		//ArrayList�� ��ü�� ����
		ArrayList a1 = new ArrayList();
		//add()���� ������ ����
		a1.add(new A());			//A -> Object
		a1.add(new Integer(100));	//Integer -> Object
		a1.add("����");				//String -> Object
		
		System.out.println(a1);
		//[com.list.A@40671416, 100, ����]	//�������� ��ȯ�� ���� Ȯ��
		
		//toString()������ �� ���
		//[A, 100, ����]	//toString()�����Ǹ� ���� �������� �ƴ� ���ϵ� �����Ͱ� ���
	}
}