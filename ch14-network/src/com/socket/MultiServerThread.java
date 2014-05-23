/* Chatting ���α׷� - MultiServerThread
 * 
 *  
 *  MultiClient
 *  MultiClientThread
 *  MultiServer
 *  MultiServerThread
 *  
 * ------------------------------------------------
 * ������ Ŭ���̾�Ʈ�� ���� ��ü�� �����ϱ� ���� Ŭ����.
 * �� Ŭ������ ��Ƽ������ �ִ� �÷����� ������ �ֱ� ������ �ٸ� Ŭ���̾�Ʈ���� �޽����� ������ �ֽ��ϴ�. 
 *  
 */

package com.socket;

import java.net.*;
import java.io.*;
public class MultiServerThread implements Runnable{
	//�������
	private Socket socket;
	private MultiServer ms;
	private ObjectInputStream ois;
	private ObjectOutputStream oos;
	
	public MultiServerThread(MultiServer ms){
		this.ms = ms;
	}
	
	//������ ó���� ������ �ܰ��� �����ϱ� ���� synchronized ��� ����
	//run()�� �ϳ��� ��ü�� �����ϵ��� ��
	public synchronized void run(){
		boolean isStop = false;
		try{
			//���� ����
			socket = ms.getSocket();
			
			ois = new ObjectInputStream(socket.getInputStream());
			oos = new ObjectOutputStream(socket.getOutputStream());
			
			String message = null;
			//���� ����
			while(!isStop){
				//Ŭ���̾�Ʈ�� ���� �޽����� ����
				message = (String)ois.readObject();
				//ID�� �޽��� �и�
				String[] str = message.split("#");
				if(str[1].equals("exit")){	//����
					broadCasting(message);
					isStop = true;
				}else{	//��� ä��
					broadCasting(message);
				}
			}
			//ArrayList ��ü�� ����
			ms.getList().remove(this);
			
			System.out.println(socket.getInetAddress()+ "���������� �����ϼ̽��ϴ�");
			System.out.println("list size : "+ms.getList().size());
		}catch(Exception e){
			//������ �߻��� Ŭ���̾�Ʈ ����
			ms.getList().remove(this);
			System.out.println(socket.getInetAddress()+ "������������ �����ϼ̽��ϴ�");
			System.out.println("list size : "+ms.getList().size());
		}
	}
	
	public void broadCasting(String message)throws IOException{
		//ArrayList�����ͼ� �ٸ� �����鿡�� �޽����� ����
		for(MultiServerThread ct : ms.getList()){
			ct.send(message);
		}
	}
	
	//�޽����� ����
	public void send(String message)throws IOException{
		oos.writeObject(message);        
	}
}
