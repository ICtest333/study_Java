/* HashTable 
 * 
 * -------------------------------------------
 * key, value�� null��� ���� (run time�� ����)
 * ������ ���Խ� nullüũ �ؾ� ��
 * 
 * */

package com.set;

import java.util.Hashtable;

public class HashTableEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String, Double> ht = new Hashtable<String, Double>();
		
		
		ht.put("�̼���", new Double(173.2));
		ht.put("������", new Double(181.8));
		ht.put("������", new Double(192));
		ht.put("������", new Double(165.9));
		
		System.out.println(ht);
		
		Double keynum = ht.get("������");
		System.out.println("�������� Ű�� " + keynum);
		
		
		//Ű�� �ߺ��� ������� ����
		ht.put("������", new Double(111));
		keynum = ht.get("������");
		System.out.println("�������� Ű�� " + keynum);
		
		//key�� null ��� �Ұ� (�����Ͻÿ��� ������ ���� ������ ����� ������)
		//ht.put(null, new Double(222));	//ERROR: java.lang.NullPointerException

		//value�� null ��� �Ұ� (�����Ͻÿ��� ������ ���� ������ ��Ÿ�ӽ� ������)
		//ht.put("��ȣ��", null);	//ERROR:	//ERROR: java.lang.NullPointerException

	}

}
