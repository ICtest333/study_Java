/* Object Class - ��ü ��
 * 
 * ��ü ��1 - �������� ����
 * ��ü ��2 - �� �����ڸ� ���� (���� ���� �����)
 * ��ü ��3 - Object.equals�� ���� 
 * */

package com.langex;

public class ObjectEx2 {
	public static void main(String[] args){
		ObjectEx2 ob1 = new ObjectEx2();
		
		//��ü �� - �������� ����
		//�ּҰ� ���
		System.out.println("ob1: \t\t" + ob1);
		
		ObjectEx2 ob2 = new ObjectEx2();
		//�ּҰ� ���
		System.out.println("ob2: \t\t" + ob2);
		
		System.out.println();
		//��ü �� - �����ڸ� ����
		if(ob1 == ob2){
			System.out.println("���� ��ü");
		}else{
			System.out.println("�ٸ� ��ü");
		}
		
		System.out.println();
		//��ü �� - Object.equals�� ���� 
		if(ob1.equals(ob2)){
			System.out.println("���� ��ü");
		}else{
			System.out.println("�ٸ� ��ü");
		}
	}
}
