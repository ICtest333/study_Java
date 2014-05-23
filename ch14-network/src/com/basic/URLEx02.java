/* URL - URL.openStream()
 * 
 * URL�� ���� �ش� ���� ����
 * Openstreamȣ���ؼ� InputStream���·� ������
 * InputStreamReader�� �ѱ涧 ���ڵ� ��� �������ϰ� 
 * readline()�� ���� ���
 * 
 * 
 * InputStreamReader�� �ѱ涧 ���ڵ� ��� ������
 * readline()�� ���� ���
 * ---------------------------------------------------------------------
 * 
 * 
 * ���ڵ� ����� ���� ������ �����Ͱ� ������ ����
 * ����� �ٸ� ��� ��������� ������ ��� �մϴ�.
 * 
 */


package com.basic;

import java.net.URL;
import java.net.UnknownHostException;
import java.net.MalformedURLException;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;


public class URLEx02 {	
	public static void main(String[] args){
		String address = "http://www.naver.com/index.html";
		URL url = null;
		BufferedReader input = null;		
		String line ="";
		
		try{
			//�ּҸ� �о��
			url = new URL(address);
			//�ּҸ� ���� URL�� �о�� InputStream�� ���������� openStream()�� ȣ��
			InputStream in =  url.openStream();
			//BufferedReader��ü ����
			//input = new BufferedReader(new InputStreamReader(in));
			//���ڵ� ��� ����
			input = new BufferedReader(new InputStreamReader(in, "UTF-8"));
			
			
			while( (line=input.readLine())!=null ){
				//�ٹٲ�
				System.out.println(line);
			}			
			
		}catch(MalformedURLException e){
			e.printStackTrace();		
			
		}catch(UnknownHostException e){
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
			
		}finally{
			if( input!= null){ try{input.close();}catch(IOException e){e.printStackTrace();} }			
		}		
	}
}
