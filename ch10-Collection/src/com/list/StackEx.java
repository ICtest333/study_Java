/* Stack
 * 
 * push()
 * pop()
 *  
 * String ��ü ����
 * ��ü�� ��Ҹ� ���ÿ� �ֱ�
 * ������ ��������Ұ� ���� pop�Ǹ鼭 ������ �� Ȯ��
 * 
 * ---------------
 * ���Լ��� Ȯ��
 * ������ �ִ� �������� ����
 */

package com.list;

import java.util.Stack;

import javax.print.DocFlavor.STRING;

public class StackEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"����","����","�뱸","�λ�","���","����", "��õ"};
		
		//String�����͸� Stack�� �ֱ�
		Stack<String> stk = new Stack<String>();
		
		for(int i =0; i< arr.length; i++){
			stk.push(arr[i]);
		}
		System.out.println(stk);
		
		System.out.println("===================================");
		//���� Stack�� ����ִ��� Ȯ��
		while(!stk.isEmpty()){
			//���� Stack�� ����� ��ü�� ���� ��
			System.out.println(stk.pop());
		}
		
		//���� Stack�� ��ü�� ����Ǿ� �ִ��� Ȯ��
		System.out.println(stk);
	}
}
