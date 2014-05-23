/* EchoClient
 * 
 * -------------------------------------------------------
 * EchoClient
 * EchoServer
 * -------------------------------------------------------
 * �����ڿ��� ���� �ް�
 * ���� ���� getsocket()
 * ����� ��Ʈ��(����Ʈ��Ʈ��) -> ���ڽ�Ʈ��
 *  
 */

package com.socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class EchoClient {
	
	//���� IP ���� ����
	private String ip;
	//���� ��Ʈ ���� ����
	private int port;
	private String str;
	BufferedReader br_file;
	
	public EchoClient(String ip, int port) throws IOException{
		this.ip = ip;
		this.port = port;
		
		//������ ����Ǹ� tcp���� ����
		Socket tcpSocket = getSocket();
		//����Ʈ ��Ʈ��
		//��� ��Ʈ�� (������ ������ ����)
		OutputStream os_socket = tcpSocket.getOutputStream();
		//�Է� ��Ʈ�� ( �������� Ŭ���̾�Ʈ�� ���۵� ������ ó��)
		InputStream is_socket =  tcpSocket.getInputStream();		
		//����Ʈ��Ʈ�� -> ���ڽ�Ʈ��
		BufferedWriter bufferW = new BufferedWriter(new OutputStreamWriter(os_socket));		
		BufferedReader bufferR = new BufferedReader(new InputStreamReader(is_socket));
		
		//������ �Է¿� �Է½�Ʈ�� ����
		System.out.print("�Է� >");
		br_file = new BufferedReader(new InputStreamReader(System.in));
		
		//ǥ�� �Է�
		str = br_file.readLine();
		//EOF
		str += System.getProperty("line.separator");
		//�����͸� ���ۿ� ����
		bufferW.write(str);
		//�����͸� ������ ����
		bufferW.flush();
		//�������� ���۵� ������ ó��
		str = bufferR.readLine();
		
		//Echo��� ���
		System.out.println("Echo Result: " + str);
		
		//�ڿ�����
		br_file.close();
		bufferW.close();
		os_socket.close();
		is_socket.close();
		bufferR.close();
		tcpSocket.close();
	}	
	
	public Socket getSocket(){
		Socket tcpSocket = null;
		try{
			//���� ����
			tcpSocket = new Socket(ip, port);
			
		}catch(IOException e){
			e.printStackTrace();
			System.exit(0);
		}
		return tcpSocket;
	}
	
	public static void main(String[] args){
		
		try{
			//new EchoClient("192.168.0.20", 3000);
			new EchoClient("192.168.0.113", 3000);
		}
		catch(IOException e){
			e.printStackTrace();			
		}		
	}
}
