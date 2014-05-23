/* InetAddress - ������ �ּҿ� ���� �ּ� ���
 *  
 */

package com.basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx{

	public static void main(String[] args) {
		//�Է¹ޱ����� ��ü ����
		BufferedReader br = null;
		//�Է¹���  URL����
		String url = null;
		
		//�迭�� ������ �����Ƿ� ������ �迭 ����
		InetAddress[] addresses;		
		
		try{
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("������Ʈ �ּ� �Է� > ");
			url = br.readLine();
			
			//�ش� �����ΰ� ���εǾ� �ִ� ��� �ּҸ� ����, Static�� �޼ҵ�� �Ǿ� �־� ���� ȣ��
			addresses = InetAddress.getAllByName(url);			
			
			//������ �ּ� ���
			for(int i=0; i<addresses.length; i++){
				System.out.println(addresses[i]);
			}
			
			//���� �ּ� ���
			System.out.println("Local computer's IP: ");
			System.out.println(InetAddress.getLocalHost());
		}catch(UnknownHostException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();			
		}finally{
			if( br!=null ){ try{br.close();}catch(IOException e){e.printStackTrace();} }
		}
	}
}
