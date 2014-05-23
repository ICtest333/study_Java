/* EchoServer
 * 
 * -------------------------------------------------------
 * EchoClient
 * EchoServer
 * -------------------------------------------------------
 * ��Ʈ��ȣ �Ѱ��ָ鼭
 * ���� ���� ����
 * 
 * while���� accept���� Ŭ���̾�Ʈ �Ҽ� ����
 * Ŭ���̳�Ʈ�� ������ tcp���� ����
 */

package com.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import java.io.OutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class EchoServer {
	private BufferedReader bufferR;
	private BufferedWriter bufferW;
	private InputStream is;
	private OutputStream os;
	private ServerSocket serverS;

	public EchoServer(int port){
		try{
			serverS = new ServerSocket(port);

		}catch(IOException e){
			e.printStackTrace();
			System.exit(0);
		}

		//�ߴܽ�Ű�� ������ ��� Ŭ���̾�Ʈ�� ��ٸ����� ���ѷ���
		while(true){
			try{
				System.out.println("Ŭ���̾�Ʈ�� ��û�� ��ٸ��� ��!");

				//���� ����, û��
				Socket tcpSocket = serverS.accept();

				//Client IP�ּ� ���ϱ�
				System.out.println("Ŭ���̾�Ʈ�� IP�ּ�: " + tcpSocket.getInetAddress().getHostAddress());

				//�Է� ��Ʈ�� ���� client���� ���۵� ������ ó��)
				is = tcpSocket.getInputStream();
				//byte��Ʈ�� -> char��Ʈ�� ����ȯ				
				bufferR = new BufferedReader(new InputStreamReader(is));

				//��� ��Ʈ�� ���� (�������� Ŭ���̾�Ʈ�� ���۵� ������ ó��)
				os = tcpSocket.getOutputStream();					
				bufferW = new BufferedWriter(new OutputStreamWriter(os));

				//client���� ���۵� �����͸� ����
				String message = bufferR.readLine();
				//�ֿܼ� ǥ��
				System.out.println("���Ÿ޽���: " +  message);

				//�ٹٲ��� �����ν� ���̻� �����Ͱ� ������ ǥ��
				message = message + System.getProperty("line.separator");

				//�������� Ŭ���̾�Ʈ�� ���� (�����͸� ���ۿ� ����)
				bufferW.write(message);

				//�������� Ŭ���̾�Ʈ�� �����͸� ����(����� flush)
				bufferW.flush();			

			}catch(IOException e){
				e.printStackTrace();
			}finally{
				if(bufferW!=null){ try{ bufferW.close();}catch(IOException e){e.printStackTrace();} }
				if(os!=null){ try{ os.close();}catch(IOException e){e.printStackTrace();} }
				if(bufferR!=null){ try{ bufferR.close();}catch(IOException e){e.printStackTrace();} }
				if(is!=null){ try{ is.close();}catch(IOException e){e.printStackTrace();} }
			}
		}
	}

	public static void main(String[] args){
		new EchoServer(3000);
	}
}
