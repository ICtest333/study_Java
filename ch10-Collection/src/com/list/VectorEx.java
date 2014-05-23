/* Vector
 * 
 * �ڿ� �߰�
 * ��� ����
 * �ڿ� �˻�
 * �ڿ� ����
 */

package com.list;

import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		Vector<Double> v = new Vector<Double>();
		
		//�ڿ� �߰�
		v.add(new Double(100.3));
		v.add(3.14);
		v.add(1000.);	//1000.0 �����ǹ�
		
		//�������
		for( Double dbl : v){
			System.out.println(dbl);
		}		
		
		System.out.println();
		//�ڿ��˻�
		double search = 1000.0;	//�˻��� ���
		int index = v.indexOf(search);
		if(index != -1){	//�ش絥���Ͱ� ������:-1 ����
			System.out.println("�˻����" + search + "�� ��ġ: " + index);			
		}else{
			System.out.println("�˻����" + search + "�� �����ϴ�.");
		}
				
		double del = 3.14;	//������ ���
		//������ ���� ���� Ȯ���Ͽ� ������ ����
		if(v.contains(del)){
			v.remove(del);	//����
			System.out.println(del + "�����Ϸ�");
		}
		
		for( Double dbl : v){
			System.out.println(dbl);
		}	
		
		System.out.println(v);

	}

}
