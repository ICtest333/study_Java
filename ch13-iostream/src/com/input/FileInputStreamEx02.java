/* FileInputStream - ����/�ѱ� ��� - byte[]�迭 �̿�, �ڿ�����
 * 
 * ������ �о��
 * �� ����Ʈ�� �о���̱� ������ �ƽ�Ű�ڵ�� ����Ǵ� �� ����Ͽ� Ȯ��/Ȯ���� �ּ�ó��
 * 
 * byte[]�� String���� �Ľ�
 * 
 * �ڿ� ���� Standard
 * -----------------------------------------------------------------------
 * �ڹ� ������ ��Ҷ� ������ ��� �ڿ�����
 * ��ü�� �����ؼ� ����
 * ��ü�� �������� �Ҹ��� ����Ű�Ƿ� ���Ͽ����Ŀ��� ���Ͽ��ᰡ�ɻ��°� ��� ���ӵ�(�̷���� ���ϰ� �߻��� �� ����)
 * �׷���, ��ü�� ���ϰ��� ���踦 ���� �ڿ������� ����
 * 
 */

package com.input;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class FileInputStreamEx02 {
	public static void main(String[] args){
		FileInputStream fis = null;
		byte readArray[];
		
		try{
			//byteó���� �ϴ� FileInputStream��ü�� ����
			fis = new FileInputStream("file.txt");
		
			//�����̿��� ���ڵ� ó�������ϵ��� ó�� - �Էµ� �����͸� byte�迭�� ������ �� String�� �Ľ�
			//available()�о���� �����͸� �ڵ������� �ε��� ���� ��ȯ
			readArray = new byte[fis.available()];
			
			//�Էµ� �����͸� �о�鿩 byte[]�� ����
			//���������� loop
			fis.read(readArray);
			
			//�� ����Ʈ�� �о���̱� ������ �ƽ�Ű�ڵ�� �����ϰԵ�
//			for(byte b : readArray){ System.out.print(b); System.out.println(); }
			
			//byte[]�� String���� �Ľ�
			//���������� 2byte�� ó���ϰ� ��
			System.out.println(new String(readArray));			
			
		}catch(FileNotFoundException e){
			e.printStackTrace();			
		}catch(IOException e){
			e.printStackTrace();			
		}finally{	//�ڿ� ���� Standard
			//��ü�� �ִ��� üũ
			if( fis != null ){
				//IOException�߻��� �� �����Ƿ� try~catch
				try{
					fis.close();					
				}catch(IOException e){
					e.printStackTrace();
				}
			}			
		}		
	}
}
