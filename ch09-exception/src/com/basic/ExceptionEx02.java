/* ����ó�� - try~catch()
 * 
 * ExceptionEx01 �߻����� ����ó���ϱ�
 * printStackTrace(): ���ܰ� �߻��Ǳ������ ��� ������ �����ڵ� ���ι�ȣ�� ���
 * getMessage(): �����ϰ� �������� ���
 * ����ڰ� ������ �������� ����ϱ�
 * ---------------------------------
 * try{} catch{}�� ����
 * 
 */

package com.basic;

public class ExceptionEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] var = {10, 20, 30};
		
		for(int i=0; i<=3; i++){
			try{// ���ܰ� �߻��� ���ɼ��� �ִ� �ڵ� �ۼ� ����
				System.out.println("var["+ i + "]: " + var[i]);				
			}catch(ArrayIndexOutOfBoundsException e){
				// ���� �߻��� ��ü�� �� �ִ� �ڵ� ���
				
				//������ �����Ͽ� ǥ��
				//e.printStackTrace();
				
				//���� ���� ���� ǥ��
				//System.out.println(e.toString());
				
				//����� ���� �������� ǥ��
				System.out.println("���� �ε����� ȣ���߽��ϴ�.");
			}		
		}
		System.out.println("���α׷� ��!!");
	}
}
