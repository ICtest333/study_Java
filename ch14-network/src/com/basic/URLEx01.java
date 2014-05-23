/* URL - URL�� �پ��� ���� ���
 *  
 */

package com.basic;

import java.net.URL;
import java.net.MalformedURLException;

public class URLEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		try{
			//URL��ü ����
			URL url = new URL("http://java.sun.com/index.jap?name=hongjildong#content");	
			//URL url = new URL("http://java.sun.com:80/index.jap?name=kim#content");
			//������ �ȸ´� ��� ERROR �׷��Ƿ� try~catch()�� ��� ��, MalformedURLException import���ְ� try~catch
			//ERROR:Unhandled exception type MalformedURLException
			
			//URL ���� ���
			System.out.println("��������:\t" + url.getProtocol());
			System.out.println("ȣ��Ʈ:\t\t" + url.getHost());
			//��Ʈ��ȣ ��þ��� ���¿��� ��Ʈ��ȣ ���
			//��Ʈ��ȣ ����� ��Ʈ��ȣ ���			
			System.out.println("��Ʈ��ȣ:\t" + url.getPort());
			//default��Ʈ ǥ��
			System.out.println("default��Ʈ��ȣ:" + url.getDefaultPort());
			
			System.out.println("�н�:\t\t" + url.getPath());
			System.out.println("��û�� �����ڿ� ����:\t" + url.getFile());
			System.out.println("����:\t\t" + url.getQuery()); 
			
			// ��Ŀ����Ʈ = ���۷���
			System.out.println("���۷���:\t" + url.getRef());
			
			
		}catch(MalformedURLException e){ e.printStackTrace(); }
	}
}