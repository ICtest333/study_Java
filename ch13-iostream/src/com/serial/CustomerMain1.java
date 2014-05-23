/* ��ü ����ȭ - ObjectOutputStream
 * 
 * ���� ������ ���� ����ȭ�ϱ�
 * 
 * ------------------------------------------------------------------------------
 * Customer.java
 * CustomerMain.java
 *  
 * ------------------------------------------------------------------------------
 * ��ü�ȿ� ����� ������ ����
 * (Ŭ������ �� �����ϴ� ���� �ƴ϶� ��������� ����� �����͸� �����ϴ� ����) 
 * 
 * ��������(�������) ���� ��� ������ ��ü�� �Ǿ� ����� �� ���µ� 
 * ��ü ����ȭ�� �س����� �ٽ� ����� �� �ֽ��ϴ�. ��ü�� ���� �� ������ �� �ֽ��ϴ�.
 * (��ü ���� �� ����/����Ǵ� ������ �ʿ���� �ٷ� ��밡���ϰ� �ϱ� ����)
 * �۾��Ͻ� �����ߴٰ� �ٽ� �۾� �簳�� ���� ȿ������.
 * 
 * object.ser: JVM�� ������ �ִ� ���̴�.
 *  
 * ��ü ����ȭ �������:
 * ������ ������ ������ ���ؼ� ���(��Ʈ��ũ ����)
 */

package com.serial;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class CustomerMain1 {

	public static void main(String[] args) {
		// 
		System.out.println("===��ü ����ȭ �ϱ�===");
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		//����ȭ�� ��ü ����
		//��������(�������) ���� ��� ������ ��ü�� �Ǿ� ����� �� ���µ� ��ü ����ȭ�� �س����� �ٽ� ����� �� �ֽ��ϴ�. 
		//"Steve��Ƽ��" �����͸� ���� ��ü ����
		Customer c = new Customer("Steve��Ƽ��");
		
		try{
			//��ü ����ȭ�Ҷ��� dat/ser�� Ȯ�����ϴ� ���� ����
			//byteó���� �ؾ��ϱ� ������ FileOutputStream��ü ����
			fos = new FileOutputStream("object.ser");
			//��ü ����ȭ�� ���ؼ� ObjectOutputStream��ü ����
			oos = new ObjectOutputStream(fos);
			//��ü ����ȭ ����
			//writeObject()�̿��ؼ� Customer��ü�� ���Ͽ� ���
			oos.writeObject(c);
			
			System.out.println("��ü ����ȭ �Ϸ�!!!");			
			
		}catch(IOException e){ 
			e.printStackTrace(); 
		}finally{	//�ڿ� ����
			if( oos!=null){ try{oos.close();}catch(IOException e){e.printStackTrace();} }
			if( fos!=null){ try{fos.close();}catch(IOException e){e.printStackTrace();} }			
		}	
	}
}
