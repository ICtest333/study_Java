/* ���ܹ߻�
 * 
 * �迭�� �ε��� ������ �Ѿ�� ���ܹ߻�
 */
package com.basic;

public class ExceptionEx01 {

	public static void main(String[] args) {

		int[] var = {10, 20, 30};
		
		for(int i=0; i<=3; i++){
			System.out.println("var["+ i + "]: " + var[i]);
			//ERROR
			/*Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
			at com.basic.ExceptionEx01.main(ExceptionEx01.java:11)*/
		}
		System.out.println("���α׷� ��!!");		
	}
}
