/* super()
 * 
 * ���
 * ����Ʈ �����ڸ� �ִ� ���*/

package com.ext2;


//�θ� Ŭ����
class Parent2{
//class Parents extends Object{
	
	public Parent2(){
		super();	//Object�� ����Ʈ ������ (�Ϲ������� ���Ե�)
	}	
	int a;
}

//�ڽ� Ŭ����
class Child2 extends Parent2{
	
	public Child2() {
		super();	//�θ� Ŭ������ ����Ʈ ������ (�Ϲ������� ���Ե�)
	}	
	int b;
}

public class SuperEx02 {

	public static void main(String[] args){
		Child2 ch = new Child2();		
	}
}
