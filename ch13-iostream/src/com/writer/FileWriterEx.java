/* FileWriter
 *  
 * Ư�� ���ڿ��� �����ϴ� �ؽ�Ʈ ���� �����ϱ� 
 * 
 */

package com.writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
	
	public static void main(String[] args){
		
		FileWriter fw = null;
		
		try{
			//��ü ����
			fw = new FileWriter("fileWriter.txt");
			
			String message = "FileWriter �׽�Ʈ ���Դϴ�.";
			//���Ͽ� ����
			fw.write(message);
			System.out.println("���� ���� �� ���� ���");
		}catch(IOException e){
			e.printStackTrace();			
		}finally{	//�ڿ�����
			if( fw !=null ){ try{ fw.close();}catch(IOException e){e.printStackTrace();}  }			
		}		
	}	
}
