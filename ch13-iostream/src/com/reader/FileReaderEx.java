/* FileReader
 * 
 * file.txt�� �ѱ۰� �������ε� ������ �Է� 
 * ���ϸ��� �Է¹޾� FileReader ��ü ����
 * ���Ϸκ��� �����͸� �� ���ھ� �о�鿩 �����ڵ�� ��ȯ
 * �����ڵ带 char�� ���
 * �ڿ� ���� 
 */

package com.reader;

import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class FileReaderEx {
	public static void main(String[] args){
		
		FileReader fr = null;
		int readChar;
		
		try{
			//���ϸ��� �Է¹޾� FileReader ��ü ����
			fr = new FileReader("file.txt");
			
			//���Ϸκ��� �����͸� �� ���ھ� �о�鿩 �����ڵ�� ��ȯ
			while( (readChar=fr.read()) != -1){
				System.out.print( (char)readChar );
			}			
		}catch(FileNotFoundException e){
			e.printStackTrace();			
		}catch(IOException e){
			e.printStackTrace();			
		}finally{	//�ڿ�����
			if( fr != null) { try{fr.close(); }catch(IOException e){ e.printStackTrace();} }			
		}
	}
}