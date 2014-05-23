/* Adapter Class - �͸� ���� Ŭ���� �����Ͽ� �̺�Ʈ ó��
 *   
 *  
 * new KeyAdapter(){ } - �͸��� Ŭ������ �̺�Ʈ ������ ���� - KeyEvent 
 * @Override 	public void keyTyped(KeyEvent e){}
 *   
 * new WindowAdapter(){ } - �͸��� Ŭ������ �̺�Ʈ ������ ����- WindowEvent 
 * @Override	public void windowClosing(WindowEvent e){}
 *  
 * ----------------------------------------------------------------------------------------
 * ���� Ŭ������ �͸� ���� Ŭ������ �����Ͽ� �ڵ� ���̸� �ٿ����ϴ�
 * ----------------------------------------------------------------------------------------
 * �͸� ���� Ŭ���� ���� ����
 * - �ڵ� �ľ� ����.
 * - �ڵ� ���� ª������.
 * 
 * Android���� �͸��� Ŭ���� ���� ���̹Ƿ� ��� ���� �� ���� �ľ��մϴ�.
 *  
 */


package com.adapter3;


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
		//�͸��� Ŭ���� ���
		tf.addKeyListener(new KeyAdapter(){
			//���ϴ� �޼ҵ常 ������		
			@Override
			public void keyTyped(KeyEvent e){
				if(e.getKeyChar()==KeyEvent.VK_ENTER){
					ta.append(tf.getText() + "\n");
					tf.setText("");
				}
			}			
		});		
		
		//�̺�Ʈ ������ ���� - WindowEvent
		//�͸��� Ŭ���� ���
		addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});			
	}	
	
	@Override
	public void actionPerformed(ActionEvent e){
		String str = e.getActionCommand();
		if( str.equals("Clear") ){
			ta.setText("");
			tf.setText("");			
		}else if(str.equals("Exit")){
			System.exit(0);
		}		
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AdapterEx();
	}
}