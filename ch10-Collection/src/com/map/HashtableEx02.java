/* Hashtab - Enumeration�������̽� �̿�
 * 
 * 
 * 
 */

package com.map;

import java.util.Hashtable;
import java.util.Enumeration;


public class HashtableEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<String, Object> ht = new Hashtable<String, Object>();
		ht.put("name", "ȫ�浿");
		ht.put("age", "27");
		ht.put("phone", "010-1234-5678");
		ht.put("address", "�����");
		
		Enumeration<String> en = ht.keys();
		
		while(en.hasMoreElements()){
			String key = en.nextElement();
			System.out.println(key + "," + ht.get(key));
		}
		
		
	}

}
