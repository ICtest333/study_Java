package com.bank;

public class BankAccountMinus extends BankAccount{
	
	//���� �ѵ�
	private long limit;
	
	//���̳ʽ� ���� ����
		public BankAccountMinus(int bAccount, String bPassword, String name, long bBalance, long limit){ 
			//�θ� Ŭ���� ������ ȣ��
			super(bAccount, bPassword, name, bBalance);			
			this.limit = limit;
			
			System.out.println( name + "���� ���´� ���̳ʽ� �����Դϴ�.");
		}
		
	// ��� �޼ҵ� ������
	@Override
	public void withdraw(int coin){
	
			
		long totalBalance;
		totalBalance = getbBalance();
		
		if( Math.abs(totalBalance - coin) <= limit){		
			totalBalance -= coin;
			System.out.printf( getName() + "�� %,d ���� ��ݵǾ����ϴ�", coin);System.out.println();
			
			setBalance(coin);
			System.out.printf("�����ܾ�:\t %,d", getbBalance());System.out.println();
			System.out.println("=========================");			
		}else{
			System.out.println("�ѵ� �ʰ��Դϴ�.");			
		}	
	}
	
	//�����ܰ� ���
	public void getBalance(){
		System.out.println("���̳ʽ� ���¹�ȣ:\t" + getbAccount());
		System.out.println("��й�ȣ:\t\t" + getPassword());
		System.out.println("������:\t\t\t" + getName());
		System.out.printf("�����ܾ�:\t\t%,d\n", getbBalance());
		System.out.printf("�����ѵ�:\t\t%,d\n", limit);
		System.out.println("=========================");
	}
}
