/* BufferedWriter
 * 
 * import
 * ��ü ���� 
 * ������ ���ۿ� �����
 * �ٹٲ� / �޼��带 ���� �ٹٲ�
 * �ڿ�����
 * 
 */
package com.writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterEx {

	public static void main(String[] args) {		
		
		FileWriter fw  = null;
		BufferedWriter bw = null;
		
		try{
			//��ü ����
			fw = new FileWriter("bufferedWirter.txt");
			bw = new BufferedWriter(fw);
			//������ ���ۿ� �����
			bw.write("BufferedWirter Test�Դϴ�.");
			//�ٹٲ�
			bw.newLine();
			//�޼��带 ���� �ٹٲ�
			bw.write("�ȳ��ϼ���" + System.getProperty("line.separator") + "Hello BufferedWriter");
			
			//close()�޼��尡 ���ۿ� �����ִ� ������ ���Ͽ� �����ϰ� ���۸� ���
			//bw.flush();
			System.out.println("���ϻ��� �� ���� ���");
			
		}catch(IOException e){
			e.printStackTrace();
			
		}finally{	//�ڿ����� 
				if( bw!=null ){ try{bw.close();}catch(IOException e){e.printStackTrace();} }
				if( fw!=null ){ try{fw.close();}catch(IOException e){e.printStackTrace();} }
		}
	}
}
