/* Lotto ���α׷� - ArrayList 
 * 
 * contains�޼ҵ带 �̿��ؼ� �ߺ�üũ
 * Colloections.sort �޼ҵ带 �̿��ؼ� ����
 * 
 */

package com.list;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ArrayListLotto {

	public static void main(String[] args) {
		
		//ArrayList ��ü ����
		List<Integer> list = new ArrayList<Integer>();
		
		Random random = new Random();		
		
		//��ü ���� �� �ʱ�ȭ
		Integer it = null;
		
		
		//���� üũ		
		while(list.size() < 6){
			it = new  Integer(random.nextInt(45)+1);	// 1~45
			//contains�޼ҵ带 �̿��ؼ� �ߺ�üũ
			if(!list.contains(it)){
				list.add(it);
			}
		}
		
		//Colloections.sort �޼ҵ带 �̿��ؼ� ����
		Collections.sort(list);;
		
		//���
		for(Integer i : list){
			System.out.println(i+ "\t");
		}
	}
}