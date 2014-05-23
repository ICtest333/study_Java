/* ��Ģ����� - ���� �Է� ����ó��
 * 
 * 
 * ���ڸ� �ԷµǾ�ߵǴµ� ���ڰ� �ԷµǴ��� ����
 * charAt()�� �ƽ�Ű�ڵ� Ȱ��
 * 
 *  
 * 51 -> 5����
 *       01 2   
 *  
 * charAt(i)
 * �ƽ�Ű�ڵ尪: ������ ���� 48~57(0~9)�ȿ� ������ �����̰� �� �����̸� ���ڶ�� �˷��ش�.
 * 
 */

package com.swing;

import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;	//Dialog box


public class Calculator2 extends JFrame implements ActionListener{
	
	JButton button1, button2;
	JTextField text1, text2, text3;
	JPanel panel1, panel2;
	JComboBox combo;
	int num1, num2, result;
	String str1, str2, com;
	
	public Calculator2(){
		super("��Ģ�����");
		
		Container contentPane = getContentPane();		
		
		panel1 = new JPanel();
		panel2 = new JPanel();
		
		text1= new JTextField(5);
		text2= new JTextField(5);
		text3= new JTextField(5);
		
		String[] op ={"+", "-", "*", "/"};
		combo = new JComboBox(op);
		
		panel1.add(text1);
		panel1.add(combo);
		panel1.add(text2);
		panel1.add(new JLabel("="));
		panel1.add(text3);
		
		//������� �������� TextField ���� �Ұ�
		text3.setEditable(false);
		
		button1 = new JButton("Ȯ��");
		button2 = new JButton("���");
		
		panel2.add(button1);
		panel2.add(button2);
		
		contentPane.add(panel1, BorderLayout.NORTH);
		contentPane.add(panel2, BorderLayout.CENTER);

		//�͸���Ŭ������ x��ư �Ѱ��̶� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//x, y
		setLocation(500, 400);	
		
		//����� ������� �ʰ� pack()����ϸ� ������Ʈ�� ũ�⸦ �ν��ؼ� �ڵ������� ����� ���		
		pack();
		
		button1.addActionListener(this);
		button2.addActionListener(this);
				
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		
		//��ü ��ü�� �ҷ�����
		Object obj = e.getSource();
		
		if( obj == button1 ){	//Ȯ��
			str1 = text1.getText();
			str2 = text2.getText();
			com = (String)combo.getSelectedItem();			
						
			
			//String -> int �� ����ó�� ��� 2
			int check =0;
			for(int i=0; i<str1.length(); i++){
				
				//'1' -> 49
				check = str1.charAt(i);
				
				//�ƽ�Ű�ڵ� 48~59���� üũ
				if( check >= 48 || check <=59){
					num1 = Integer.parseInt(str1);					
				}else
				{
					showErrMsg(text2, "���ڸ� �Է°����մϴ�");
				}				
			}			
			
			
			try{
				num1 = Integer.parseInt(str1);
				
			}catch(NumberFormatException ne){
				showErrMsg(text1, "���ڸ� �Է°����մϴ�");
				return;
			}			
			try{
				num2 = Integer.parseInt(str2);
				
			}catch(NumberFormatException ne){
				showErrMsg(text2, "���ڸ� �Է°����մϴ�");
			}
			
			doCalc();
			
			
		}else{	//���
			text1.setText("");
			text2.setText("");
			text3.setText("");			
		}
	}

	public static void main(String[] args) {
		// ���� MAC��Ÿ�Ϸ� ǥ��
		JFrame.setDefaultLookAndFeelDecorated(true);
		new Calculator2();
	}
	
	private void doCalc(){
		try{
			switch(com.charAt(0)){
				case '+': result = num1 + num2; break;
				case '-': result = num1 - num2; break;
				case '*': result = num1 * num2; break;
				default : result = num1 / num2; break;			
			}
			//int -> Sting
			//text3.setText( String.valueOf(result) );
			text3.setText(result + "");
		}catch(ArithmeticException ae){
			showErrMsg(text2, "0���� ���� �� �����ϴ�!");
		}
	}
	
	private void showErrMsg(JTextField text, String str){
		text2.requestFocus();
		text2.setText("");
		// ���� �߻��� �հ踦 ����
		text3.setText("");
								//�θ�������Ʈ, ��������(�޽���), �޽��� Ÿ��Ʋ, ������Ÿ��(�޽���Ÿ��)
		JOptionPane.showMessageDialog(this, str, "���� �޽���", JOptionPane.ERROR_MESSAGE);
		
	}
}
