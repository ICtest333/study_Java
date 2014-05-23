/* FileOutputStream - �����, �̾��
 * 
 * FileOutputStream ��ü ����
 * ��ο� ���� ����
 * ����� ������ �Է�
 * String -> byte[] �迭���·� ��ȯ - getBytes()
 * 
 * �̾��
 * ---------------------------------------------------
 * FileInpuStream, FileOutputStream ���� �ݵ�� ����
 */

package com.output;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {

	public static void main(String[] args) {
		
		//FileOutputStream ��ü ����
		FileOutputStream fos = null;
		try{
			//��ο� ���� ����
			//�⺻�� : �����
//			fos = new FileOutputStream("C:" + File.separator + "javanAndroid" + File.separator+ "fileout.txt");
			
			
			//byte�� ���Ͽ� ����ϱ� ���� FileOutputStream��ü ����
			//�̾��			
			fos = new FileOutputStream("C:" + File.separator + "javanAndroid" + File.separator+ "fileout.txt", true);			
			
			//����� ������ �Է�
			String message = "Hello FileOut!! ���Ͽ� �����Դϴ�.";
			
			//String -> byte[] �迭���·� ��ȯ 
			fos.write(message.getBytes());
			
			System.out.println("������ ������ ������ �����");	
			
		}catch(IOException e){
			e.printStackTrace();
			
		}finally{	//�ڿ� ����					
			//��ü�� �ִ��� üũ
			if( fos != null)try{fos.close();}catch(IOException e){} 
		}
	}
}