/* Item ������Ʈ
 * 
 * 
 * 
 * 
 * 
 * 
 */


package com.event;

import java.awt.Frame;
import java.awt.Button;
import java.awt.TextArea;
import java.awt.Checkbox;
import java.awt.Panel;
import java.awt.BorderLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ItemEventEx extends Frame implements ActionListener, ItemListener {
	
	Panel p1 = new Panel();
	Panel p2 = new Panel();
	
	TextArea ta = new TextArea(5, 20);
	Button exit = new Button("����");
	Checkbox cb1 = new Checkbox("�౸");
	Checkbox cb2 = new Checkbox("��");
	Checkbox cb3 = new Checkbox("�߱�");
	Checkbox cb4 = new Checkbox("����");
	Checkbox cb5 = new Checkbox("�豸");
	Checkbox cb6 = new Checkbox("����");

	
	//������ ����	
	public ItemEventEx(){
		//���� ����
		super("ItemEvent Test");
		
		//üũ�ڽ���  Panel 1�� ���
		p1.add(cb1);
		p1.add(cb2);
		p1.add(cb3);
		p1.add(cb4);
		p1.add(cb5);
		p1.add(cb6);
		
		//Button�� Panel 2�� ���
		p2.add(exit);
		
		//Panel�� Frame�� ���
		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.SOUTH);
		add(ta, BorderLayout.CENTER);
				
		//Button�� �̺�Ʈ ������ ����
		exit.addActionListener(this);
		
		//Checkbox�� �̺�Ʈ ������ ����
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		cb3.addItemListener(this);
		cb4.addItemListener(this);
		cb5.addItemListener(this);
		cb6.addItemListener(this);
		
		//Frame ��ġ,ũ�� ����
		setBounds(300, 300, 300, 300);		
		
		setVisible(true);		
	}
	@Override
	public void actionPerformed(ActionEvent e){
		System.exit(0);
	}
	@Override
	public void itemStateChanged(ItemEvent e){
		if(e.getStateChange() == ItemEvent.SELECTED){	//������ ���
			ta.append(e.getItem() + "�� ����\n\n");
		}else if(e.getStateChange() == ItemEvent.DESELECTED){	//���������� ���
			ta.append(e.getItem() + "�� ���\n\n");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ItemEventEx();
	}
}
