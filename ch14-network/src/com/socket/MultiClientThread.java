/* MultiClient
 * 
 *  MultiClient
 *  MultiClientThread
 *  MultiServer
 *  MultiServerThread
 * 
 * ----------------------------------------------------------------
 * �ٸ� Ŭ���̾�Ʈ�� �޽����� �ޱ� ���� Ŭ����
 * 
 */

package com.socket;

public class MultiClientThread extends Thread{
	private MultiClient mc;
	
	public MultiClientThread(MultiClient mc){
		this.mc = mc;
	}
	@Override
	public void run(){
		//������ 
		String message = null;
		//����
		String[] receivedMsg = null;
		boolean isStop = false;
		
		//���ѷ���
		while(!isStop){
			
			try{
				//�������� ���۵� ������
				//readObject ������ȭ�Ͽ� �����͸� �о��
				message = (String)mc.getOis().readObject();
				//#���� �޽��� �и�
				//receiveMsg[0]: ID 
				//[1]: message 
				receivedMsg = message.split("#");
				
			}catch(Exception e){
				e.printStackTrace();
				//���ܰ� �߻��� ��� while���� ��������
				isStop = true;				
			}
			System.out.println(receivedMsg[0] + ", " + receivedMsg[1]);
			
			//�����͸� ������ ������ ������ ���
			if(receivedMsg[1].equals("exit")){
				if(receivedMsg[0].equals(mc.getId())){
					//���� ����ڿ� ������ ID�̸� ���α׷� ����
					mc.exit();
				}else{	//Ÿuser �����
					mc.getJta().append(receivedMsg[0] + "���� �����Ͽ����ϴ�." + System.getProperty("line.separator"));
					//Caret = cursor
					//Ŀ���� ��ġ�� ����
					//��ü ���� �о�鿩�� �� ������ġ�� Ŀ���� ���̰� ��ġ��Ŵ
					mc.getJta().setCaretPosition(mc.getJta().getDocument().getLength());
				}				
			}else{	//�����͸� ������ ������ ��� ä������ ���
				mc.getJta().append(receivedMsg[0] + ": " + receivedMsg[1] + System.getProperty("line.separator"));
				//Ŀ�� ��ġ ����
				mc.getJta().setCaretPosition(mc.getJta().getDocument().getLength());
			}
		}		
	}
}
