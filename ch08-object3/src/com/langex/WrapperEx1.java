/* boxing/unboxing
 * 
 * boolean boxing/unboxing�ϱ�
 * int boxing/unboxing�ϱ�
 *  
 */

package com.langex;

public class WrapperEx1 {

	public static void main(String[] args) {
		// ��ü ����
		
		//�⺻�ڷ���
		boolean b = true;
		
		//�����ڷ���: 
		//�⺻�ڷ��� �����͸� �����ڸ� ���� ��ü ����(�����ڷ���) ��, �⺻�ڷ��� -> �����ڷ���:�ڽ�(boxing)
		Boolean wrap_b = new Boolean(b);
		//����Ҷ� ������ �ڷ������� ����ϱ�
		//�����ڷ��� -> �⺻�ڷ��� (unboxing)
		System.out.println("wrap_b = " + wrap_b.booleanValue());
		
		System.out.println();
		//�⺻�ڷ��� -> �����ڷ��� (boxing)
		Integer wrap_i = new Integer(100);
		//�����ڷ��� -> �⺻�ڷ��� (unboxing)
		int i = wrap_i.intValue();
		System.out.println("i = " + i);
		System.out.println("wrap_i = " + wrap_i.intValue());
	}
}
