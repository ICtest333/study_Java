/* Thread - Join()ȣ���Ͽ� Ư�������� �켱 ����
 * 
 * class MyRunnableTwo implements Runnable{ } ����
 * -@Override public void run(){ }
 * -public void first()
 * -public void second()
 * ��ü ����
 * join()�޼��� ȣ��
 * 
 * --------------------------------------------------------
 * ������ �����ٷ��� ���� �Ź� ������ ������ ������� ����� Ȯ�� 
 * join()�޼��带 ȣ���Ͽ� Ư�� ������ ���� ������� Ȯ�� 
 * 
 * join()�޼��带 ȣ���ؼ� join()�޼��带 ȣ���� �����尡 ���� ����ǵ����ϰ� �ٸ� �����带 ��� �����ϰ� �ϴ� ���
 * 
 */
package com.basic;

class MyRunnableTwo implements Runnable{
	@Override
	public void run(){
		System.out.println("run");
		first();
	}
	
	public void first(){
		System.out.println("first");
		second();
	}
	
	public void second(){
		System.out.println("second");		
	}
}

public class ThreadEx04 {
	
	public static void main(String[] args){
		//join()ȣ���� ��� �׽�Ʈ
//		System.out.println(Thread.currentThread().getName() + "\tù��° ���");
//		System.out.println(Thread.currentThread().getName() + "\t�ι�° ���");
				
		//��ü ����
		MyRunnableTwo mrt = new MyRunnableTwo();
		//�����忡 run()�ִ� Ŭ���� ��ü ���
		Thread t = new Thread(mrt);
		t.start();
		
		//join()�޼��带 ȣ���ؼ� join()�޼��带 ȣ���� �����尡 ���� ����ǵ����ϰ� �ٸ� �����带 ��� �����ϰ� �ϴ� ���
		try{
			t.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}		
		
		//join()ȣ���� ��� �׽�Ʈ
//		System.out.println(Thread.currentThread().getName() + "\t�ι�° ���");
		
		//���� �������� �̸� ��ȯ�ϱ�
		System.out.println(Thread.currentThread().getName() + "\tù��° ���");
		System.out.println(Thread.currentThread().getName() + "\t�ι�° ���");
	}
}
