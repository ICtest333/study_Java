/* ���� ���� Ŭ����
 * 
 * 
 * ------------------------------
 * �޼ҵ�ȿ� Ŭ���� �����ϴ� ���� 
 * 
 */


package com.inner2;

public class LocalEx01 {
	
	
	public void innerTest(){
		
		//���� ���� Ŭ����
		class Inner{
			
			public void getData(){
				System.out.println("Local ���� Ŭ����");
			}			
		}
		//��ü ������ ���� ��������� ��ü ����
		Inner i = new Inner();
		i.getData();		
	}
	
/*	public void innerTest2(){
		class Inner3{
			
		}
		class Inner4{
			
		}
	}*/
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		LocalEx01 le = new LocalEx01();
		le.innerTest();
	}
}
