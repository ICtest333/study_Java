/* LinkedList
 *   
 * 
 * -------------------------
 * Queue���� (FIFOȮ��)
 * '����'���� '��'�� �����δ� �Ͱ� ����
 * 
 */

package com.queue;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"���","���Ȳ�","����ȭ","����","���","������", "�ҹ̲�"};
		
		//Queue ����
		LinkedList<String> stk = new LinkedList<String>();
		
		//Queue�� arr�� ������ ����
		for(int i=0; i<arr.length; i++){
			stk.offer(arr[i]);
		}
		System.out.println(stk);

		//������ �̾Ƴ���		
		while(stk.peek()!= null){	//peek() ������ �ִ����� �˻�
			System.out.println(stk.poll());	//������ ������ �ش� �����ʹ� ����
		}
		
		System.out.println("=====================");
		System.out.println(stk);
	}
}