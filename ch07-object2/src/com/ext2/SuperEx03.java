/* super(���ڰ�)
 * 
 * ���
 * ���ڰ� �ִ� �����ڸ� �ִ� ���
 * 
 */

package com.ext2;

//�θ� Ŭ����
class A3{	
	int a = 100;
	
	public A3(String msg){
		System.out.println(msg);		
	}
}

//�ڽ� Ŭ����
class B3 extends A3{
	
	public B3(){
		//super();			//ERROR:The constructor A3() is undefined
		super("���ڿ�");	//A3�� String�����Ͱ� ���޵Ǵ� ������ ȣ��
							//default������ ���� ���ڰ� �ִ� �����ڸ� ������ ���
							//�ڽ� Ŭ�������� super()�� ��������� ���ڰ��� �԰� ȣ���� �־�� �մϴ�.	
	}
}

public class SuperEx03 {
	public static void main(String[] args){
		B3 bb3 = new B3();
	}
}