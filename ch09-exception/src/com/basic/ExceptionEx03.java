/* ���� ���� ó��
 * 
 * ����� main���� ������ ��� ó���ϱ�
 * 
 * DOS���� ���ڰ� �޾� ���α׷� ����Ǵ� ���� ��Ŭ������ ����
 * (C:\>java ExceptionEx03 �� �� �� �� ��)
 * 
 * 
 * ���ڿ�(��)�� ���������� �ѱ��
 * ���� ���Ȯ���ϱ�
 * ���ھ��� ���α׷� �ѱ��
 * 3���� �����̿� ���ܸ� �ϳ��� ó���ϱ�
 */

package com.basic;

public class ExceptionEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int var = 10;
		//int var = 50;
		
		try{
			//���ܰ� �߻��� ���ɼ��� �ִ� �ڵ�								
			int data = Integer.parseInt(args[0]);	//String -> int
			System.out.println(var/data);
		}catch(NumberFormatException e){			
			System.out.println("���ڰ� �ƴմϴ�.");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("�Է��� �����Ͱ� �����ϴ�.");
		}catch(ArithmeticException e){
			System.out.println("0���� ������ �����ϴ�");
		}catch(Exception e){
			System.out.println("������ ���ܴ� �߻�!!");
		}
		System.out.println("���α׷� ����!!");
		
		//��Ŭ�������� ���α׷� ����� �������޹޾Ƽ� ó���ϱ�
//		for (int i=0; i<args.length; i++){
//			System.out.println(args[i]);
//		}
	}
}
