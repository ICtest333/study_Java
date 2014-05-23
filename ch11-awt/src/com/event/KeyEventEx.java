/* KeyEvent
 *  
 * ����Ű �Է½� TextArea�� Ű�Է� ����ϱ�
 * 
 * TextArea ��ü ����
 * Frame�� TextArea ���(Frame��ü�� TextArea�� ��ġ�ϰ� �˴ϴ�)
 * implements KeyListener
 * TextArea�� �̺�Ʈ����Ʈ ����
 * �߻� �޼ҵ� ����
 * Frame ��ġ, ����, ���� ����
 * Frame ���� ���� ����
 * 
 */

package com.event;

import java.awt.Frame;
import java.awt.TextArea;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEventEx extends Frame implements KeyListener{
	//TextArea ��ü ����
	TextArea ta = new TextArea();
	
	public KeyEventEx(){
		//���� ����
		super("KeyEvent Test");
		
		//Frame�� TextArea���(Frame��ü�� TextArea�� ��ġ�ϰ� �˴ϴ�)
		add(ta);
		
		//TextArea�� �̺�Ʈ����Ʈ ����
		ta.addKeyListener(this);
		
		//Frame ��ġ, ����, ���� ����
		setBounds(300, 300, 300, 300);
		
		//Frame ���� ���� ����
		setVisible(true);		
	}
	// �߻� �޼ҵ� ���� (Ű�� ������ ��)
	@Override
	public void keyPressed(KeyEvent e){
		if(e.getKeyChar() == KeyEvent.VK_DOWN){
			ta.append("DOWN Key \n");			
		}else if( e.getKeyCode() == KeyEvent.VK_UP){
			ta.append("UP Key \n");
		}else if(e.getKeyCode() == KeyEvent.VK_DOWN){
			ta.append("DOWN Key \n");
		}else if( e.getKeyCode() == KeyEvent.VK_LEFT){
			ta.append("LEFT Key \n");
		}else if( e.getKeyCode() == KeyEvent.VK_RIGHT){
			ta.append("RIGHT Key \n");
		}else if( e.getKeyCode() == KeyEvent.VK_ENTER){
			ta.append("ENTER Key \n");
		}
	}	
	
	// �߻� �޼ҵ� ����
	@Override
	public void keyTyped(KeyEvent e){		
	}
	
	// �߻� �޼ҵ� ����
	@Override
	public void keyReleased(KeyEvent e){			
	}	
	
	public static void main(String[] args) {
		// ��ü ����
		new KeyEventEx();
	}
}
