/* ArrayList - ���׸�ǥ������ ��ü ����
 * 
 * Integer�� ArrayList��ü ����
 * add()�޼ҵ� ���� ������ ����
 *   
 */

package com.list;

import java.util.ArrayList;

public class ArrayListEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(new Integer(10));	//��������� boxing
		al.add(20);		//int -> Integer (Auto boxing)
		al.add(30);		//int -> Integer (Auto boxing)
		
		//Ȯ�� for��
		for(Integer num : al){
			System.out.println(num);
		}
	}
}