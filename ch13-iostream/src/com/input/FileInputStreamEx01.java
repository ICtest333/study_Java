/* FileInputSteam ���� ��� - ���������� �ѹ��ھ� ������ ó��, �ڿ�����
 * 
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

public class FileInputStreamEx01 {
	public static void main(String[] args){
		FileInputStream fis = null;
		int readbyte = 0;
		
		try{
			//������ �о��
			fis = new FileInputStream("file.txt");
			
			//������ ������ �ѹ��ھ� �о�鿩 �ƽ�Ű�ڵ�� ��ȯ
			//�����̿��� ���ڴ� ����			
			//-1�̸� ������ ��(EOF)�̹Ƿ� while�� ��������
			while( (readbyte=fis.read()) !=-1){
				//�ƽ�Ű���̱� ������ (char)�� ĳ����
				System.out.print( (char)readbyte );
			}			
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
