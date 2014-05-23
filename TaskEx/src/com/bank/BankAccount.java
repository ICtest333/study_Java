package com.bank;

public class BankAccount {
	
//	public BankAccount(){}
	
	private int bAccount;
	private String bPassword;
	private String name;
	private long bBalance;

	//���� ����
	public BankAccount(int bAccount, String bPassword, String name, long bBalance){
		this.bAccount = bAccount;
		this.bPassword = bPassword;
		this.name = name;
		this.bBalance = bBalance;
		System.out.println( name + "���� ���°� ���� �Ǿ����ϴ�");
	}
	
	//�Ա�
	public void deposit(int coin){
		bBalance += coin;
		System.out.printf( name + "�� %,d ���� �ԱݵǾ����ϴ�", coin);System.out.println();
		System.out.printf("�����ܾ�:\t %,d", bBalance);System.out.println();
		System.out.println("=========================");
	}
	
	//���
	public void withdraw(int coin){
		
		if( (bBalance - coin) > 0){
			bBalance -= coin;
			System.out.printf( name + "�� %,d ���� ��ݵǾ����ϴ�", coin);System.out.println();
			System.out.printf("�����ܾ�:\t %,d", bBalance);System.out.println();
			System.out.println("=========================");			
		}else{
			System.out.println("�ܰ� �����մϴ�");			
		}		
		
	}
	
	//�������� ���
	public void getBalance(){
		System.out.println("���¹�ȣ:\t" + bAccount);
		System.out.println("��й�ȣ:\t" + bPassword);
		System.out.println("������:\t\t" + name);
		System.out.printf("�����ܾ�:\t %,d\n", bBalance);
		System.out.println("=========================");
	}
	
	
	//���̳ʽ� ���°輳�� �߰��Ǵ� �׸�
	public String getName(){
		return this.name;
	}
	
	public int getbAccount(){
		return this.bAccount; 
	}
		
	public String getPassword(){
		return this.bPassword; 
	}

	
	
	public long getbBalance(){
		return this.bBalance;
	}
	
	public void setBalance(long coin){
		this.bBalance = coin;
	}
}
