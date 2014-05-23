/* TextEvent
 * 
 * 
 * import
 * ������ ����
 * Frame��ӹ��� ��ü����
 * ��ü���� (TextFiled, Button, TextArea)
 * 
 * Frame Ÿ��Ʋ
 * �ʱ� ��ư���� ���� - ��Ȱ��ȭ 
 * Panel ��ü ����
 * Frame�� Panel, TextArea, Button�� ���������� ���
 * 
 * Frame�� ��ġ, ����, ���� ����
 * Frame�� ���⿩�� ����
 * implements ActionListener
 * Button�� �̺�Ʈ ����
 * @Override actionPerformed ����
 * 
 * 
 * implements TextListener
 * TextField�� �̺�Ʈ ����
 * @Override textValueChanged 
 * 
 * 
 */

package com.event;

import java.awt.Frame;
import java.awt.Button;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.TextArea;
import java.awt.Label;
import java.awt.BorderLayout;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TextEventEx extends Frame implements ActionListener, TextListener{	
	
	TextField tf = new TextField(20);
	Button input = new Button("�Է�");
	Button exit = new Button("����");
	TextArea ta = new TextArea();	
	
	public TextEventEx(){
		//Frame Ÿ��Ʋ ����
		super("TextEvent Test");
		
		//�ʱ� ��ư���� ���� - ��Ȱ��ȭ
		input.setEnabled(false);
		
		//Panel ��ü ����
		Panel p = new Panel();
		p.add(new Label("����:"));
		p.add(tf);
		p.add(input);
		
		//Frame�� Panel, TextArea, Button�� ���������� ���
		add(p, BorderLayout.NORTH);
		add(ta, BorderLayout.CENTER);
		add(exit, BorderLayout.SOUTH);
		
		//Button�� �̺�Ʈ ����
		input.addActionListener(this);
		exit.addActionListener(this);
		
		//TextField�� �̺�Ʈ ����
		tf.addTextListener(this);
		
		//Frame�� ��ġ, ����, ���� ����
		setBounds(300, 300, 300, 300);			
		
		//Frame�� ���⿩�� ����
		setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e){
		if( e.getActionCommand().equals("�Է�")){
			ta.append(tf.getText() + "\n");
			tf.setText("");
			//��Ŀ���� TextField�� �α�
			tf.requestFocus();
		}else if( e.getActionCommand().equals("����")){
			System.exit(0);
		}		
	}
	@Override
	public void textValueChanged(TextEvent e){
		
		if(tf.getText().equals("")){	//�Է��� �����Ͱ� ���� ���
			input.setEnabled(false);					
		}else{
			input.setEnabled(true);	
		}		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TextEventEx();
	}
}
