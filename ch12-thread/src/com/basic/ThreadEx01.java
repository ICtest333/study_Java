/* Thread - Thread ���
 * 
 * Thread ���
 * ������ �̸� ����
 * �������� run()�� ������
 * -sleep()
 * start();
 * 
 */

package com.basic;

public class ThreadEx01 extends Thread{
	
	//������ �̸� ����
	public ThreadEx01(String threadName){
		super(threadName);	//�������̸� ����, �������� ������ �ý��ۿ��� �ڵ������� ���ڷ� �̸��ο���		
	}
	
	//�������� run()�� ������
	@Override
	public void run(){
		for(int i=0; i<10; i++){
			
			try{
				//������ �ð�(�и�������)��ŭ ������ ����
				sleep(1000);	//1��
			}catch(InterruptedException e){
				//�����޽��� ���: ��������, ������ �ټ� ǥ��
				e.printStackTrace();
			}
			
			System.out.print("������ �̸�: " + currentThread().getName() + "\t");	//���� �������� ��ü ��ȯ�� �̸��� ��ȯ
			System.out.println("temp value: "+ i);
		}
	}

	public static void main(String[] args) {		
		//������ ��ü ����
		ThreadEx01 td = new ThreadEx01("ù��°");
		//td.run(); 	//��������
		td.start(); 	//start() -> run() ���� �����Ҽ� �ֵ��� ȣ��
	}
}
