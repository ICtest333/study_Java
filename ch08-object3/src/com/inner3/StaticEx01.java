/* Static ���� Ŭ����
 * 
 * 
 * �Ϲݸ�� Ŭ������ static�� ������ ���� ���ϸ� //ERROR:The field cv cannot be declared static in a non-static inner type, unless initialized with a constant expression
 * static������ ������ ���� Ŭ������ static Ŭ�������� �մϴ�.
 * 
 */


package com.inner3;

public class StaticEx01 {
	
	//static ���� Ŭ����
	public static class StaticInner{
		int iv = 200;
		static int cv = 300;	
	}
	
	
	
	public static void main(String[] args){
		
		//static ���� Ŭ������ ��ü ����, Outer�� �ִ� StaticEx01�� ��ü�������� ����
		StaticEx01.StaticInner i = new StaticEx01.StaticInner();
		
		//�ν��Ͻ� ���� ȣ��
		System.out.println(i.iv);		
		
		//static���� ȣ��
		System.out.println(StaticEx01.StaticInner.cv);
	}
	

}
