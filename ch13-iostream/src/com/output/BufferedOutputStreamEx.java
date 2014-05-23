/* BufferedOutputStream
 * 
 * String -> byte[] ����
 * ����� flush
 * Close()	//�ڿ�����
 * 
 * 
 * ---------------------------
 * BufferedOutputStream�ϸ� ���ۿ� ����Ǵµ�
 * ���۰����� �ڵ����� ���� autoflush�ϸ� �� 
 * buffer������ �� ä���� ���� ���Ͽ� ������� �ʴ´�. �� ��� ��������� flush�ؾ� ���Ͽ� �����.
 *  * 
 * close()�޼ҵ尡 �ڿ������ϱ� ���� buffer�� �����Ͱ� ���������� flush�� �� �ڿ������� �ϰԵ˴ϴ�.
 * ���������� ���� ������� ������ �������� �ڿ������� �ݴϴ�. 
 * 
 * close()�� ���� ���� �ݵ�� ��������� flush()�ؾ� �մϴ�.
 */

package com.output;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamEx {

	public static void main(String[] args) {
		//��� �� �ʱ�ȭ
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;

		try{
			//��ü ����
			fos = new FileOutputStream("bufferOut.txt");
			bos = new BufferedOutputStream(fos);

			String str ="BufferedOutputStream Test�Դϴ�.";
			//String -> byte[]			
			bos.write(str.getBytes());

			//buffer������ �� ä���� ���� ���Ͽ� ������� �ʴ´�.
			//������ ������ ���Ͽ� �ű�� ���۸� ���(��������� flush)
			//bos.flush();

			System.out.println("���� ���� �� ���� ���!");

		}catch(IOException e){
			e.printStackTrace();			
		}finally{	//�ڿ�����			
			//close()�޼ҵ尡 �ڿ������ϱ� ���� buffer�� �����Ͱ� ���������� flush�� �� �ڿ������� �ϰԵ˴ϴ�.
			//���� �������� �ڿ�����
			if( bos != null){ try{ bos.close(); }catch(IOException e){e.printStackTrace();} } 
			if( fos != null){ try{ fos.close(); }catch(IOException e){e.printStackTrace();} }
		}
	}
}
