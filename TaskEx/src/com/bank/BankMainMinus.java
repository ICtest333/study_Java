package com.bank;

public class BankMainMinus {

	public static void main(String[] args) {
		
		BankAccountMinus bam = new BankAccountMinus(2002, "567890123", "�±Ǻ���", 10000, 100000);
		System.out.println();
			
		//�ѵ� �ʰ� ���
		bam.withdraw(300000);
		bam.getBalance();
		System.out.println();
		
		//���� ���
		bam.withdraw(5000);
		System.out.println();
		
		//�Ա�
		bam.deposit(300);
		System.out.println();
		
		//�������� ���
		bam.getBalance();	

	}

}
