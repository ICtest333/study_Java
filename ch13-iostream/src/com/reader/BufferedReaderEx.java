/* BufferedReader
 *  
 * -------------------------------------------------------------
 * 
 * System.in: �⺻�Է�(byte�Է�)
 * 
 * BufferedReader Ŭ����
 * -BufferedReader�� ���ڿ�(String)�� ó��
 * -�Էµ������� ������ ������� ���ι��̶������� �о���δ�. 
 * 
 */

package com.reader;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReaderEx {

	public static void main(String[] args){
		BufferedReader br = null;
		String line ="";
		
		try{
			//���ڷ��̼� ����
			//InputStream���� System.in�� InputStreamReader�������� ���ڷ� �����Ͽ� byteó���� charó���� �����������, 
			//�ٽ� BufferedRedaer�� ����Ͽ� �� ���ξ� �Էµ����͸� ó���� �� �ֵ��� ��
			br = new BufferedReader(new InputStreamReader(System.in));
			
			do{
				System.out.print("���� �Է�(����: q/Q �Է�)> ");
				//IOExceoption�� ���� �־ try~catch
				line = br.readLine();
				System.out.println("�Է��Ͻ� ����: " + line );
			//}while( !line.equals("q"));	// q�� ����
			}while( !line.equalsIgnoreCase("q"));	// q, Q ��� ����
			System.out.println("���α׷� ����!!");
			
		}catch(IOException e){
			e.printStackTrace();
		}finally{	//�ڿ�����
			if( br!=null ){ try{br.close();}catch(IOException e){e.printStackTrace();} }
		}		
	}
}
