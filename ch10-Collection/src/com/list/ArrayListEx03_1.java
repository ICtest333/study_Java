/* ArrayList - ���׸� ǥ��
 * 
 * ���׸� ǥ��:
 * �÷��� �����ӿ�ũ �迭�� Ŭ�������� ��ü�� ������ �� ObjectŸ������ ������.
 * �׷���, ���� Ÿ���� �����͸� ���� �� �� �ֽ��ϴ�.
 * �̷����, ����� �����͸� ������ Ÿ������ �ٿ�ĳ������ �Ұ����ϱ� ������ �۾��� ������
 * �̷� �������� �ذ��ϱ� ���� ��ü ������ Ÿ���� �����ϴ� ����� �����Ͽ����ϴ�.
 * ���׸� ǥ���� ����ϸ� ������ Ÿ������ ��ü�� ���� ��  ������ �� �ֽ��ϴ�. 
 * JDK 5.0�̻���ͻ�밡��
 */

package com.list;

import java.util.ArrayList;

public class ArrayListEx03_1 {

	public static void main(String[] args) {		

		//���׸� ǥ������ �ϳ��� Ÿ�� ����
		ArrayList<String> al = new ArrayList();
		al.add("��Ʈ��");	// String -> Object ��ĳ����
		al.add("ȫ�浿");	// String -> Object ��ĳ����
		al.add("������");	// String -> Object ��ĳ����
		al.add("���ϴ�");	// String -> Object ��ĳ����
		
		//���׸� ǥ���� ���� StringŸ���� ��ü�� �����ϰ� ����ؼ� �ٸ� Ÿ���� ��ü�� ���� �Ұ���
		//�����Ͻÿ� �ɷ���
		//al.add(new Integer(100));	//ERROR: The method add(String) in the type ArrayList<String> is not applicable for the arguments (Integer)
		al.add("���̾��");		
		
		for(int i=0; i<al.size(); i++){
			
			//����ȯ ���ʿ�
			String name = al.get(i);
			
			//���
			System.out.println(name);
		}
	}
}
