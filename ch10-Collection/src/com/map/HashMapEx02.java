/* HashMap - Ű�� ���� �ϰ������� ������ ���ϱ� (Iterator �������̽� �̿�)
 * 
 * 
 * Ű�� ���ϱ� ����  Iterator���� �޼ҵ� ȣ���Ͽ� ������ ���ϱ�
 *
 * ��ü����
 * HashMap�� ������ ����
 * 
 * �ܰ躰 (HashMap -> Set /  Set -> Iterator) 
 * �Ѳ����� (HashMap -> Set -> Iterator)
 * 
 * 
 * -------------------------------------
 * ���������� ����
 *  * 
 * Iterator ��ü ������ �� ��ü�� ������ ����
 */

package com.map;


import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;

public class HashMapEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] msg = {"Seoul", "New York", "London", "Paris", "Berlin", "Tokyo", "Hanoi"};
		
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		for(int i =0; i<msg.length; i++){
			//Map�� key, value ����
			map.put(i,  msg[i]);
		}
		
		System.out.println(map);
		System.out.println();
		
		
		/* �ܰ躰 ������� 
		//HashMap -> Set
		Set<Integer> s = map.keySet();
		//Set -> Iterator
		Iterator<Integer> keys = s.iterator();*/		
		
		//HashMap -> Set -> Iterator
		Iterator<Integer> keys = map.keySet().iterator();		
		
		//key�� �Ѳ����� ��������
		while(keys.hasNext()){
			Integer key = keys.next();
			System.out.println(key + ", " + map.get(key));
		}
	}
}
