/* Thread - �������� Thread ����
 *  
 * Runnable ������ Ŭ���� ��ü ����
 * ������ �����ϸ鼭 run()�ִ� Ŭ���� ��ü ���
 * start()
 * 
 * -----------------------------------------------------
 * ����� ������ ������ �ٲ� ����ǰ� ����
 * ����� ������ �ý��۸��� �ٸ��� 
 * �����ٷ��� �� ���� ��������� �������ְ� ������ �ְ� ����
 * 
 */

package com.basic;

public class ThreadEx03 implements Runnable{

	@Override
	public void run(){
		for(int i=0; i<10; i++){

			try{
				//Static �޼ҵ�Ƿ� ��ü�������� �ٷ� ȣ�Ⱑ��
				//������ �ð�(�и�������)��ŭ ������ ����
				Thread.sleep(1000);	//1��
			}catch(InterruptedException e){
				//�����޽��� ���: ��������, ������ �ټ� ǥ��
				e.printStackTrace();
			}
			//Static �޼ҵ�Ƿ� ��ü�������� �ٷ� ȣ�Ⱑ��
			System.out.println("������ �̸�: " + Thread.currentThread().getName() + "\t");	//���� �������� ��ü ��ȯ�� �̸��� ��ȯ			
		}
	}
	
	public static void main(String[] args){
		//Runnable ������ Ŭ���� ��ü ����
		ThreadEx03 td = new ThreadEx03();
		
		//������ �����ϸ鼭 run()�ִ� Ŭ���� ��ü ���
		Thread t1 = new Thread(td, "ù��° 1111111");
		t1.start();	//start() -> run() ���� �����Ҽ� �ֵ��� ȣ��
		//������ �����ϸ鼭 run()�ִ� Ŭ���� ��ü ���
		Thread t2 = new Thread(td, "�ι�° 2222222");
		t2.start();
		//������ �����ϸ鼭 run()�ִ� Ŭ���� ��ü ���
		Thread t3 = new Thread(td, "����° 3333333");
		t3.start();
		//������ �����ϸ鼭 run()�ִ� Ŭ���� ��ü ���
		Thread t4 = new Thread(td, "�׹�° 4444444");
		t4.start();		
	}	
}