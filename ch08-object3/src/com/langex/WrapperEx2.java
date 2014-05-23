/* Auto boxing/unboxing
 * 
 * 1)���� boxing/unboxing
 * int ��ü ���� �ϱ� (boxing)
 * int ��ü ���� �ϱ� (boxing)
 * unboxing �ϱ�
 * 
 * 
 * 2) JDK5.0�̻���� Auto boxing/unboxing:  boxing�� unboxing�� �ڵ������� ����
 * Auto unboxing �ϱ�
 * Auto boxing �ϱ�
 * Auto boxing/unboxing �ϱ�
 */

package com.langex;

public class WrapperEx2 {

	public static void main(String[] args) {
		
		System.out.println("\n���� boxing/unboxing =========");
		// int ��ü ����, ��������� new���� ���� ������ ȣ���Ͽ� Wrapper Ŭ������ ��ü ����
		Integer obj1 = new Integer(10);
		Integer obj2 = new Integer(20);
		
//		�⺻�ڷ����� �ֱ� ���� �����ڷ��� -> �⺻�ڷ��� (unboxing)
		int sum = obj1.intValue() + obj2.intValue();
		System.out.println("sum = " + sum);
		
		
		System.out.println("\nAuto boxing/unboxing =========");
		//Auto unboxing
		int result1 = obj1 * obj2;
		System.out.println("result1 = " + result1);
		
		//Auto boxing
		Integer obj3 = 15;
		Integer obj4 = 20;
		//Auto boxing/unboxing
		Integer result2 = obj3 + obj4;
		System.out.println("result2 = " + result2);
	}
}
