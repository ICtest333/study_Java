/*��Ű�� ���� �� 
���� ��Ű���� Ŭ���� ȣ��
�ٸ� ��Ű���� Ŭ���� ȣ��*/


package com.sample;

//Ŭ���� �ϳ��� import
import com.example.PackOne;

//Ŭ���� ������ import: �ش� ��Ű������ ��� Ŭ���� import ��
//import com.example.*;

public class PackTwo {
	
	
	//java.lang ��Ű���� ��� Ŭ������ �ڵ����� import��
	String str = "PackTwo";
	
	public static void main(String[] args){
		
		//com.sample.PackThree p3 = new com.sample.PackThree();
		//���� ��Ű���� Ŭ������ ȣ���� ���� ��Ű�� ����
		PackThree p3 = new PackThree();
		System.out.println(p3.str);
		
		PackTwo p2 = new PackTwo();
		System.out.println(p2.str);
		
		
		//�ٸ� ��Ű���� Ŭ������ ȣ���� ���� ��Ű���� ����ؾ� ��
		//PackOne p1 = new PackOne();
		//com.example.PackOne p1= new com.example.PackOne();
		
		//�ٸ� ��Ű���� �ν��Ͻ� ������ ���� ȣ���� �� ���� (public�̳� getter�޼ҵ� ����Ͽ� ȣ��)
		//System.out.println( p1.str );		
		
		//Ŭ���� ��ܿ� import���� �̿��� ��Ű���� Ŭ����(��Ű�� ����)�� ����ϸ� �ڵ� �ۼ��� Ŭ������ ������ �� ����
		PackOne p1 = new PackOne();
		System.out.println(p1.getStr());		
		
		
	}

}
