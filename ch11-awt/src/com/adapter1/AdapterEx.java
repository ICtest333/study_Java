/* Adapter Class - �ܺ� Ŭ������ �̿��Ͽ� �̺�Ʈ ó��
 * 
 * 
 * �ʿ��� �ڿ� import
 * 
 * Frame ���� ���� 
 * Panel ����
 * Button ����
 * Panel�� ��Ʈ�� �߰�
 * Frame�� �� Panel�� BorderLayour������ ���
 * Frame�� ��ġ, ����, ���� ����
 * Frame ���⿩�� ����
 * 
 * 
 * implements ActionListener
 * �̺�Ʈ ������ ���� - Button�� �̺�Ʈ
 * @Override 	public void actionPerformed(ActionEvent e){}
 * 
 * ������ Ŭ���� ���� - KeyAdapter Ŭ������ ����ϴ�
 * �̺�Ʈ ������ ���� - KeyEvent
 * @Override 	public void keyTyped(KeyEvent e){}
 * 
 * ������ Ŭ���� ���� - WindowAdapetŬ����������ϴ�
 * �̺�Ʈ ������ ���� - WindowEvent
 * @Override	public void windowClosing(WindowEvent e){}
 * 
 * 
 * ----------------------------------------------------------------------------------------
 * Frame�� ��ӵǾ� �־ AdapterŬ������ ������� ���� ���Ѵ�. �ڹٴ� ���� ��Ӹ� �����ϹǷ�
 * ������ Ŭ�������� ��ӹ޾Ƽ� �̺�Ʈ�����ʸ� ������ �־�� �մϴ�.
 * �׷���, ��� �̺�Ʈ �ڵ鷯�� ������ �ʿ����
 * 
 * 
 * Ŭ���� ���߻�� �Ұ�, ���ϻ��
 * �������̽� ���߻�� ����
 * 
 * 
 *  �ʿ��� �ڿ� import
 *  ȭ�鱸��
 *  �̺�Ʈ ó��
 *  - adapterŬ������ ������ Ŭ������ ��ӹ޾�
 *  - �̺�Ʈ�����ʿ� ����� ��ü �����Ͽ� �ʿ����ڳѰ��ָ鼭 ������
 *   
 */

package com.adapter1;

import java.awt.Frame;
import java.awt.Button;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;	
import java.awt.event.KeyEvent;

import java.awt.event.KeyAdapter;		//Adapter class
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;	//Adapter class

public class AdapterEx extends Frame implements ActionListener{
	
	Panel p1, p2, p3;
	TextField tf;
	TextArea ta;
	Button bClear, bExit;
	
	public AdapterEx(){
		//Frame ���� ����
		super("Adapter Class Test");
		
		//Panel ����
		p1 = new Panel();
		p2 = new Panel();
		p3 = new Panel();
		
		//TextField, TextArea ����
		tf = new TextField(35);
		ta = new TextArea(10, 35);
		
		//Button ����
		bClear = new Button("Clear");
		bExit = new Button("Exit");
		
		//Panel�� ��Ʈ�� �߰�
		p1.add(tf);
		p2.add(ta);
		p3.add(bClear);
		p3.add(bExit);
		
		//Frame�� �� Panel�� BorderLayour������ ���
		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.CENTER);
		add(p3, BorderLayout.SOUTH);
		
		//Frame�� ��ġ, ����, ���� ����
		setBounds(300,  200,  300,  300);
		//Frame ���⿩�� ����
		setVisible(true);
		
		//�̺�Ʈ ������ ���� - Button�� �̺�Ʈ
		bClear.addActionListener(this);
		bExit.addActionListener(this);
		
		//�̺�Ʈ ������ ���� - KeyEvent
		//���� Ŭ������ �ƴ϶� �����ڸ� ���� �����͸� �Ѱ���� �մϴ�.
		//������ Ŭ�������� adapterŬ������ ��ӹ޾� ��ü�� �����ؼ� �̺�Ʈ �����ʿ� ��������ݴϴ�.
		tf.addKeyListener(new KeyEventHandlers(tf, ta));		
		
		//�̺�Ʈ ������ ���� - WindowEvent		
		addWindowListener(new WindowEventHandlers());		
	}
	@Override
	public void actionPerformed(ActionEvent e){
		String str = e.getActionCommand();
		if( str.equals("Clear") ){
			/*ta.setText(" ");
			tf.setText(" ");
			tf.requestFocus();*/
			
			//JAVA ����������� ��Ŀ�� ���� ����
			ta.setText(" ");
			tf.setText(" ");
			ta.setText("");
			tf.setText("");
			//tf.requestFocus();
		}else if(str.equals("Exit")){
			System.exit(0);
		}		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AdapterEx();
	}
}


//������ Ŭ���� ���� - KeyAdapter Ŭ������ ����ϴ�
class KeyEventHandlers extends KeyAdapter{
	//���ϴ� �޼ҵ常 ������
	TextField tf;
	TextArea ta;
	
	//Ŭ������ �޶� ��� ������ ȣ���� �� ���� �����ڸ� ���ؼ� ��������� �Է¹��� �� �ֵ��� �մϴ�.
	public KeyEventHandlers(TextField tf, TextArea ta){
		this.tf = tf;
		this.ta = ta;
	}	
	@Override
	public void keyTyped(KeyEvent e){
		if(e.getKeyChar()==KeyEvent.VK_ENTER){
			ta.append(tf.getText() + "\n");
			tf.setText("");
		}
	}	
}

//������ Ŭ���� ���� - WindowAdapetŬ����������ϴ�
class WindowEventHandlers extends WindowAdapter{
	//�����ư Ŭ���� ���α׷� ����
	@Override
	public void windowClosing(WindowEvent e){
		System.exit(0);
	}
}