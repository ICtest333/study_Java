/* ������ ����� ���� ���� - BufferedReader, FileWriter�� Ȱ���Ͽ�
 * 
 * ------------------------------------------------------------
FileWriterGGdan
�ǽ�:  ������ ��� ����

1)�� �Է� (BufferedReader) : String -> int
2)�ֿܼ� ������ ��� ��
3)���Ͽ� ���� (FileWriter)
 
 */

package com.writer;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWriterGGdan {

	public static void main(String[] args) {
		//���� ����
		BufferedReader br = null;		
		FileWriter fw = null;
		
		String str = null;
		String gugu = null;
		
		//�� ���� ����
		int dan = 1;
		
		try{
			//��ü ����
			fw = new FileWriter("FileWriterGGdan.txt");
			
			System.out.println("���Է� >");
			br = new BufferedReader(new InputStreamReader(System.in));
			
			//�� �Է� �ޱ�
			str = br.readLine();			
			
			dan = Integer.parseInt(str);
			
			//������ ���
			for(int i =1; i<=9; i++){	
				
				//gugu = dan + "*" +  i + "=" + (dan*i) + "\n";
				gugu = dan + "*" +  i + "=" + (dan*i);				
				
				System.out.println( gugu );
				//���� ����				
				fw.write(gugu + System.getProperty("line.separator"));
			}			
		}catch(IOException e){
			e.printStackTrace();
			
		}finally{	//�ڿ����� 
				if( br != null){ try{br.close();} catch(IOException e){e.printStackTrace();} }
				if( fw != null){ try{fw.close();} catch(IOException e){e.printStackTrace();} }			
		}		
	}
}
