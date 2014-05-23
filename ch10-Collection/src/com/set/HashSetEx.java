/* HashSet - Iterator�������̽� �̿�
 * 
 * ��ü ������ ���� Ȯ��
 * �ߺ��� �����Ͱ� ���ŵȰ� Ȯ�� (�߿�!!!! �ߺ��� ������� ����)
 * ������ �� �ε����� ����
 * iterator()�� ���� Iterator��ü�� �����ؼ� hasNext()�� ����� ����.
 * 
 * 
 * ���ͷ����� ��üŸ�� ������ ��
 * ������ ������ ���� 
 * �����͸� �о�ͼ� ����ϱ�
 */

package com.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

	public static void main(String[] args) {
		// ��ü ����
		String[] arr = {"�ڹ�", "JSP", "Android", "�ڹ�", "HTML5", "����Ŭ", "JSP"};
		
		
		//Set�������̽�����Ŭ������ HashSetŬ���� ����
		HashSet<String> hs1 = new HashSet<String>();
		
		for(String n : arr){
			hs1.add(n);
		}
		System.out.println(hs1);
		
		// ���ͷ�����Ÿ���� ��ü ���� �� ������ ����
		Iterator<String> itr = hs1.iterator();
		
		while(itr.hasNext()){
			//�����͸� �о�ͼ� ���
			System.out.println(itr.next());
		}
	}

}
