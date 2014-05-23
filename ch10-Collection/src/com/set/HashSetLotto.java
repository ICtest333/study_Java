/* Lotto ���α׷� - HashSet
 * 
 * 
 * �����ϱ�
 */

package com.set;

import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class HashSetLotto {

	public static void main(String[] args) {
		// HashSet ��ü ����
		// HashSet <Integer> hs = new HashSet<Integer>();
		
		Set <Integer> set = new HashSet<Integer>();
		//�ʱ⿡ SetŸ������ ��ü�����Ͽ� �����͸� ������		
		
		while(set.size() < 6){
			// 1~45���� �߻�
			//hs.add( (int)(Math.random()*45+1) );
			int num = (int)(Math.random()*45+1);
			set.add(new Integer(num));		
		}		
		System.out.println(set);		
		
		//�����ϱ�
		//Collections.sort(hs);	//ERROR: The method sort(List<T>) in the type Collections is not applicable for the arguments (HashSet<Integer>)
		//Collections.sort�� ����ƮŸ���̿��� setŸ���� ����Ʈ Ÿ������ �ݵ����� �մϴ�.
				
		//Set -> Collection -> List
		//Set�� ������ ���ϹǷ� ListŸ������ ��ȯ
		List<Integer> list = new ArrayList<Integer>(set);
		
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println("\n" + list);
	}
}
