/* Object Class
 * 
 * getClass(): Ŭ���� ���� Ȯ��
 * hashCode(): ��ü�� �ĺ��� �� �ִ� unique�� ��
 * toString(): ������ Ȯ��
*/

package com.langex;

public class ObjectEx1 {

	public static void main(String[] args) {		
		
		ObjectEx1 ob = new ObjectEx1();
		
		//obȣ�� �� �ڵ����� toString ȣ���ؼ� ������ ���
		System.out.println("ob: \t\t" + ob);
		
		//Ŭ���� ���� Ȯ��
		System.out.println("getClass(): \t" + ob.getClass());
		
		//�ؽ��ڵ� Ȯ��: ��ü�� �ĺ��� �� �ִ� unique�� ��
		System.out.println("hashCode(): \t" + ob.hashCode());
		
		//������ Ȯ��: Ŭ������@16�����ؽ���
		System.out.println("toString(): \t" + ob.toString());
	}
}