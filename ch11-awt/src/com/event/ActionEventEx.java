/* Event ó��
 * 
 * Panel ��ü ����
 * Button��ü ����
 * TextArea ��ü ����
 * Button��  Panel�� ���
 * Frame�� Panel�� TextAreas���
 * 
 * implements ActionListener	(ActionListener���� �ִ� �̺�Ʈ ó������  ActionEventEx�� �������� ����� ���Եȴ�. )
 * @Override 	public void actionPerformed(ActionEvent ae){}	//ActinListern�� actionPerfored()ȣ�⤤
 * �̺�Ʈ �ҽ��� �̺�Ʈ ������ ����
 * 
 * ---------------------------------------
 * �̺�Ʈ ó�� ���� (Java�� Android ����)
 * 1.�̺�Ʈ �ҽ� ����
 * 2.�̺�Ʈ �����ʸ� ����
 * 3.�̺�Ʈ �ҽ��� �̺�Ʈ ������ ����
 * 4.�̺�Ʈ �ڵ鷯 ���� ����
 * 
 */

package com.event;

import java.awt.Frame;
import java.awt.Button;
import java.awt.TextArea;
import java.awt.Panel;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//extends Frame: Frame���
//implements ActionListener: ActionEventEx�� ActionListner������ ��
public class ActionEventEx extends Frame implements ActionListener{
	
	Panel p;
	Button input, exit;
	TextArea ta;
	
	
	public ActionEventEx() {		
		super("ActionEvent �׽�Ʈ");
		
		//Panel��ü ����
		p = new Panel();
		
		//Button��ü ���� (�̺�Ʈ �ҽ�)
		input = new Button("�Է�");
		exit = new Button("����");
		
		
		//�̺�Ʈ �ҽ��� �̺�Ʈ ������ ����
		input.addActionListener(this);
		exit.addActionListener(this);
		
		//TextArea ��ü ����
		ta = new TextArea();
		
		//Button��  Panel�� ���
		p.add(input);
		p.add(exit);
		
		//Frame�� ���
		add(p, BorderLayout.NORTH);
		add(ta, BorderLayout.CENTER);
		
		//x, y, width, height ����
		setBounds(300, 300, 300, 300);		
		
		//Frame ���⿩�� ����
		setVisible(true);		
	}
	
	//�̺�Ʈ �ڵ鷯(�̺�Ʈ�� �߻��ϸ� ȣ���)
	@Override
	public void actionPerformed(ActionEvent ae){
		//�̺�Ʈ�� �߻��� �̺�Ʈ �ҽ��� ��� ���ڿ��� ����
		String name = ae.getActionCommand();
		if(name.equals("�Է�")){
			ta.append("��ư�� Ŭ���Ͽ����ϴ�.\n");
			
		}else{//����			
			//���α׷� ����
			System.exit(0);
		}		
	}	
	

	public static void main(String[] args) {
		// Frame�� ��ӹ��� Ŭ������ ��ü ����
		new ActionEventEx();
	}
}
