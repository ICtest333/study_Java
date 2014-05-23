/* Thread - Runnable ����
 * 
 * implements Runnable
 * @Override public void run(){ }
 * Runnable�� ������ Ŭ������ ��ü����
 * �����忡 run()�ִ� Ŭ������ ���
 * ---------------------------------------------------------
 * �����带 ��ӽ�Ų�Ͱ� ������ ȿ�� Ȯ���ϱ�
 * ������ ����, �����忡 run()�ִ� Ŭ����(Runnable�� ������ ��ü)�� ���
 * 
 */

package com.basic;

public class ThreadEx02 implements Runnable{	
	
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
			System.out.print("������ �̸�: " + Thread.currentThread().getName() + "\t");	//���� �������� ��ü ��ȯ�� �̸��� ��ȯ
			System.out.println("temp value: "+ i);
		}		
	}

	public static void main(String[] args) {
		//Runnable�� ������ Ŭ������ ��ü����
		ThreadEx02 td = new ThreadEx02();
		//Runnable�� ������ ��ü�� Thread��ü�� �����ؼ� ���
		//������ ����, �����忡 run()�ִ� Ŭ���� ��ü�� ���
		//Thread t = new Thread(td, "�ι�°");	
		Thread t = new Thread(td);	//Thead�̸� �̼����� �ý��ۿ��� �ڵ� �ο���
		//start() -> run() ���� �����Ҽ� �ֵ��� ȣ��
		t.start();		
	}
}
