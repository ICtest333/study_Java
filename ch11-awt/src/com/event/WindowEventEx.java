/* WindowEvent
 * 
 * �����ư Ŭ���� ���α׷� ����
 * 
 */

package com.event;

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class WindowEventEx extends Frame implements WindowListener{
	Label lb;
	
	public WindowEventEx(){
		//Frame�� Ÿ��Ʋ ����
		super("WindowEvent Test");
		
		//Label�� ���Ḧ ���� �ȳ����� �Է�
		lb = new Label("�������� �����ư�� �����ּ���!");
		
		//Frame�� �̺�Ʈ �����ʿ� ����
		addWindowListener(this);
		
		//Label�� Frame�� ���
		add(lb);
		
		//Frame�� ��ġ, ����, ���� ����
		setBounds(300, 300, 300, 300);
		//Frame ���⿩�� ����
		setVisible(true);
	}
	//�߻� �޼ҵ� ����
	//WindowListener�������̽��� 7���� �߻�޼ҵ带 ��� �����ؾ� ��
	//�������� �����ư Ŭ���� ���α׷� ����
	@Override
	public void windowClosing(WindowEvent e){
		System.exit(0);
	}	
	@Override	
	public void windowDeactivated(WindowEvent e){}
	@Override
	public void windowIconified(WindowEvent e){}
	@Override
	public void windowActivated(WindowEvent e){}
	@Override
	public void windowOpened(WindowEvent e){}
	@Override
	public void windowClosed(WindowEvent e){}
	@Override
	public void windowDeiconified(WindowEvent e){}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new WindowEventEx();
	}
}