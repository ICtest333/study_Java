package com.bank;


public class BankMain {

	public static void main(String[] args) {
		
		//1) �����ڸ� ���� ���� ����
		BankAccount ba = new BankAccount(1001, "123456", "�±Ǻ���", 10000);
		ba.getBalance();
		
		System.out.println();
		//2) �Ա�
		ba.deposit(200000);
		ba.getBalance();

		System.out.println();
		//3) ���
		ba.withdraw(9000);		//���� ���
		
		ba.withdraw(500000);	//�ܾ� ������ ���
		
		//4) �ܰ�
		ba.getBalance();
		
		
	}

}
