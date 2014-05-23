/* Thread - ����ȭ �� (������ �ְ�߻�)
 * 
 * 
 */


package com.basic;

class ATM_1 implements Runnable{
	//�����ڿ�
	private long depositMoney = 10000;
	
	@Override
	public void run(){
		//this: ����ȭ�� ��ü
		//synchronized (this) {	
			for( int i=0; i<5; i++){
				try{
					Thread.sleep(1000);					
				}catch(InterruptedException e){
					e.printStackTrace();					
				}
				// 0���ϸ� �ݺ��� ��������
				if( depositMoney <= 0 ) break;
				
				withDraw(1000);
			}			
//		}		
	}
	
	//�Ӱ迵��
	public void withDraw(long howMuch){
		if(depositMoney > 0){
			depositMoney -= howMuch;
			System.out.println(Thread.currentThread().getName() + "\t" + depositMoney);			
		}else{
			System.out.println(Thread.currentThread().getName() + "�ܾ��� �����մϴ�.");			
		}
	}	
}

public class ThreadEx06_1 {
	
	public static void main(String[] args){
		ATM_1 atm = new ATM_1();
		Thread mother = new Thread(atm, "mother") ;
		mother.start();
		Thread son = new Thread(atm, "son");
		son.start();
	}

}
