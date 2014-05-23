/* ����ó�� - finally 
 * 
 * ���ܰ� �߻����� ���� ���
 * ���ܰ� �߻��� �߻��� ���
 * 
 * finally���� ���ܰ� �߻��ϰ� �߻����� �ʰǰ��� �׻� ����Ǿ����� �� �ڵ带 ���
 * ��ü�� �Ҹ��� ���α׷��� ��Ʈ�� �� �� ������
 * IO�� DB�� ����� ���踦 ���� �뵵�� ����մϴ�. 
 * 
 */

package com.basic;

public class ExceptionEx06 {
	
	
	public static void main(String[] args) {
		// ���ܰ� �߻����� ���� ���
		System.out.println("���α׷� ����!");
		try{
			System.out.println("1");
			
		}catch(Exception e){
			System.out.println("2");
		}finally{
			System.out.println("�߿�޽���");
		}
		System.out.println("���α׷� ����!");
		
		System.out.println("\n=============== \n");
		// ���ܰ� �߻��� �߻��� ���
		System.out.println("���α׷� ����!");
		try{
			System.out.println("1");
			System.out.println(50/0);	//���ܹ߻�
			System.out.println("2");
			
		}catch(Exception e){
			System.out.println("3");	//����ó��
		}finally{
			System.out.println("�߿�޽���");
		}
		System.out.println("���α׷� ����!");		
	}
}
