/* ��� - ������� 
 * 
 */

package com.ext1;

//�θ� Ŭ����
//class Parent extends Object{}	//extends Object�� ����
class Parent{
	int a = 100;
}

//�ڽ� Ŭ����
class Child extends Parent{
	
	int b = 200;

	//int a = 300;	
}

public class Exten01 {
	public static void main(String[] args){		
		
		Child ch = new Child();
		System.out.println(ch.a);
		System.out.println(ch.b);
		
		System.out.println(ch.a);		
	}
}