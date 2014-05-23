/* HashMap - Ư¡ Ȯ��
 * 
 * ������ ������
 * ������ ȣ�� 
 * Ű�� ���� ������ ȣ�� 
 * ���� Ű������ ������ ���� 
 * key������ null���
 * value������ null���
 * 
 * -------------------------------
 * �������� ��Ģ���� �ڵ� ���ĵ�
 * key���� �ߺ��� ������
 * 
 * �ϰ������� ������ �̾Ƴ� �� Ư������ ������ ��� ���
 * 
 * ȯ�漳���� ���� ���
 */

package com.map;

import java.util.HashMap;

public class HashMapEx01 {

	public static void main(String[] args) {
		// Ű�� ������� Object Ÿ�Է� ��
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("�ظ�", new Integer(95));
		map.put("�츣�̿´�", new Integer(100));
		map.put("��", new Integer(85));
		map.put("�巹����", new Integer(93));
		map.put("�׺�", new Integer(70));
		map.put("��", new Integer(20));
		
		//Ű�� �ߺ��� ������� ����, �׷��� value���� �����
		map.put("�츣�̿´�", new Integer(0));		
		
		System.out.println(map);		
		
		//Ű�� ���� ������ ȣ��
		Integer num = map.get("�츣�̿´�");
		System.out.println( "�츣�̿��� �� ������ "  + num);
		
		//key������ null��� 
		map.put(null,  new Integer(99));
		
		//key�� �λ�� ����, null�� �ĺ��� ó�� �̿���
		System.out.println(map);	
		
		//value������ null��� 
		map.put("�巹��",  null);
		
		//value������ null��밡��
		System.out.println(map);		
	}
}
