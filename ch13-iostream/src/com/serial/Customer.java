/* ��ü ����ȭ - ����ȭ ���
 *  
 * -------------------------------------------------------------
 * Serializable�������̽��� ������ Ŭ������ ��ü ����ȭ ����� ��
 * ��� ������ �ִ� �����Ͱ� �߿��� ���̹Ƿ� ��� ������ �־�� ����ȭ�� �ϸ�
 * ��� ������ ���� ��� ����ȭ�ϴ� ���� ���ǹ��մϴ�.
 * 
 * 
 * ����ȭ�� �ݵ�� ����ؾ� �˴ϴ�.
 * implements ���� ������ ERROR��
 * java.io.NotSerializableException: com.serial.Customer
	at java.io.ObjectOutputStream.writeObject0(ObjectOutputStream.java:1183)
	at java.io.ObjectOutputStream.writeObject(ObjectOutputStream.java:347)
	at com.serial.CustomerMain.main(CustomerMain.java:46)
	object.ser�� ERROR�� ������ �������� ������ �����(���� ����ȭ�� ���ٷ� �����)
 */

package com.serial;

import java.io.Serializable;

//Serializable�������̽��� ������ Ŭ������ ��ü ����ȭ ����� ��
public class Customer implements Serializable{
//public class Customer {
	//��� ����(�ν��Ͻ� ����)
	private String name;
	
	//�ν��Ͻ� ���� �ʱ�ȭ�ϴ� ������
	public Customer(String name){
		this.name = name;
	}
	
	public String toString(){
		return "Your name is " + name;
	}

}
