/* �� ����ȭ - ObjectInputStream
 * 
 * -------------------------------------------------------------------------------
 * ������ ������ ��ü�� �����ϱ�
 * ���Ͽ� �ִ� ������ ��ü ������ �Ϻ��̱� ������ ��ü�� ������ Ŭ���������� �ݵ�� �����ؾ� �մϴ�.
 * object.ser���� Ŭ������ �������� �ּ����� ������ ����Ǿ� �ֽ��ϴ�.
 * �� ���������� Cusomer.java�� �ݵ�� �����ؾ� �ؾ��ϸ� �����ؾ� ����(�� ����ȭ)�� �� �ֽ��ϴ�. 
 * 
 * ������ ���۽� Ŭ������ ������ ���� ������ �־�� ��ü ����ȭ �� ������ȭ�� �� �� �ֽ��ϴ�.
 *  
 * Ȱ��о�:
 * ä�ý�
 * ��Ʈ��ũ�� ������Ž�
 * �ΰ� ȭ�鿡�� ������Ʈ�� �ѱ� �� ��ü�� ����ȭ�ؼ� �Ѱ���� ��
 * 
 */

package com.serial;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CustomerMain2 {
	public static void main(String[] args){
		System.out.println("===��ü ������ȭ �ϱ�===");
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;		
		
		try{
			//byteó���� �ؾ��ϱ� ������ FileInputStream��ü ����
			fis = new FileInputStream("object.ser");
			//������ȭ�� ���ؼ� ObjectInputStream��ü ����
			ois = new ObjectInputStream(fis);
			
			//�� ����ȭ ����
			//Object -> Customer
			//readObject() �����ؼ� Customer��ü ������ �о���� 
			Customer m = (Customer)ois.readObject();
			//��ü ���� ���
			System.out.println(m);			
			
		//������ �������� �ʴ� ��� ����
		}catch(FileNotFoundException e){
			
		//�Է��� �� ����
		}catch(IOException e){
			e.printStackTrace();
			
		//������ �� Ŭ���� ������ ���� ��� ����
		}catch(ClassNotFoundException e){
			e.printStackTrace();			
		}finally{	//�ڿ� ����
			if(ois!=null){ try{ois.close();}catch(IOException e){e.printStackTrace();} }
			if(fis!=null){ try{fis.close();}catch(IOException e){e.printStackTrace();} }			
		}		
	}
}
