/* ArrayList���� ������ �ε��� ������ ����
 * 
 * �Էµ� �������� ¦���� �����ϱ�
 * 
 * ArrayList�� ������ ������ �ε��� ������ �̷ﳪ�� ������
 * �ε��� �ڿ��� ���� �����ؾ� �ε��� ���濡 ���� ������ �ذ��� �� �ִ�.
 * �׷��� ����
 * ������ �ε��� ���� �����ؼ� ���� üũ�ϸ�
 * �ǳʶٴ� �����Ͱ� �߻����� �ʰ� ��� ����� ���� üũ ���� 
 * 
 */

package com.list;

import java.util.ArrayList;

public class ArrayListEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(15);
		al.add(16);
		
		System.out.println(al);
		System.out.println("-------------------------");
		
		for(int num : al)
			System.out.println(num);
		
		System.out.println("-------------------------");
		for(int i=0; i<al.size(); i++ ){
				System.out.println(al.get(i));			
		}	

		//�ε��� ������ ���� ���� üũ
		for(int i=al.size()-1; i>=0; i-- ){
			if(al.get(i)%2 ==0){//¦��
				al.remove(i);				
			}
		}
		System.out.println(al);
	}
}
