/* Thread - Thread �켱���� ����
 * 
 * �⺻�켱���� Ȯ��
 * ������ �����ٷ��� ���� ���� ���� Ȯ��
 * �켱���� ����
 * �켱���� ������ ���� ����Ȯ��
 * ----------------------------------
 * ������� Ȯ�� ��
 * �켱���� ���� (Ȯ�������� ���� �����, �ݵ�� ���� ����Ǵ� ���� �ƴ�) 
 * �����ϰ� ��������� ������ �� �� ������ ����������ٴ� ������ ó���� �����ϴ� ���� �� �ǹ�����.
 */

package com.basic;

public class ThreadEx05 {
	public static void main(String[] args){
		ThreadTest01 th1 = new ThreadTest01();
		ThreadTest02 th2 = new ThreadTest02();

		//Thread �켱���� 7�� ���̱�
//		th1.setPriority(7);
//		th2.setPriority(7);
		
		//Thread �켱���� Ȯ��
		System.out.println("th1 (-): " + th1.getPriority());
		System.out.println("th2 (*): " + th2.getPriority());
		
		th1.start();
		th2.start();
	}
}

class ThreadTest01 extends Thread{
	@Override
	public void run(){
		for(int i=0; i<300; i++){
			System.out.print("-");
		}
	}	
}


class ThreadTest02 extends Thread{
	@Override
	public void run(){
		for(int i=0; i<300; i++){
			System.out.print("*");
		}		
	}
}
