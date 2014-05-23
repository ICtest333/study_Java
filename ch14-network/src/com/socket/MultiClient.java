/* Chatting ���α׷� - MultiClient
 * 
 *  MultiClient
 *  MultiClientThread
 *  MultiServer
 *  MultiServerThread
 * 
 * -----------------------------------------
 * Swing���� ������ Ŭ���̾�Ʈ Ŭ����.
 * �� Ŭ���������� �޽����� ���� ���� �̺�Ʈ���� ó���߰�,
 * �ٸ� Ŭ���̾�Ʈ�� ���� �޽����� �ޱ� ���� MultiClientThread��ü�� �����Ͽ����ϴ�.
 * UI ������
 * 
 * ID#�޽���
 * 
 */


package com.socket;

import java.net.Socket;
import java.nio.ByteOrder;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JOptionPane;

public class MultiClient extends JFrame implements ActionListener {
	//���� ����
	private Socket socket;
	private ObjectInputStream ois;
	private ObjectOutputStream oos;
	private JTextField jtf;
	private JTextArea jta;
	private JLabel jlb1, jlb2;
	private JPanel jp1, jp2;
	private String ip;
	private String id;
	private JButton jbtn;
	
	public MultiClient(String ip, String id){
		//���� ����
		super("Multi Chatting");
		
		this.ip = ip;
		this.id = id;
		
		//������Ʈ ����
		jtf = new JTextField(30);
		jta = new JTextArea("", 10, 50);
		jlb1 = new JLabel("User ID : [" + id +"]");
		jlb2 = new JLabel("IP : " + ip );
		jbtn = new JButton("����");
		jp1 = new JPanel();
		jp2 = new JPanel();
		
		//TextArea�� ���� ����
		jta.setBackground(Color.ORANGE);
		//��������� BoraderLayout����ϵ��� ���
		jp1.setLayout(new BorderLayout());
		jp2.setLayout(new BorderLayout());		
		
		jp1.add(jtf, BorderLayout.CENTER);
		jp1.add(jbtn, BorderLayout.EAST);
		jp2.add(jlb1, BorderLayout.CENTER);
		jp2.add(jlb2, BorderLayout.EAST);
		
		//JFrame�� ����
		add(jp1, BorderLayout.SOUTH);
		add(jp2, BorderLayout.NORTH);
		
		//TextArea�� ��ũ�� ó��
		JScrollPane jsp = new JScrollPane(jta, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		//JFrame�� ���
		add(jsp, BorderLayout.CENTER);
		//���� �Ұ���
		jta.setEditable(false);
		
		//�̺�Ʈ �ҽ��� �̺�Ʈ������ ����
		jtf.addActionListener(this);
		jbtn.addActionListener(this);		
		//����� �޽��� ó���� �ϱ� ���� ó���ϱ� ���� �͸� ���� Ŭ����
		addWindowListener(new WindowAdapter() {
			//�̺�Ʈ �ڵ鷯 ����
			@Override
			public void windowClosing(WindowEvent e){
				
				try{
					//������ ����޽��� ����
					oos.writeObject(MultiClient.this.id + "#exit");
				}catch(IOException ie){
					ie.printStackTrace();					
				}
				//���α׷� ����
				System.exit(0);
			}			
			@Override
			public void windowOpened(WindowEvent e){
				//Frame�� ���÷��̵Ǹ� ��Ŀ���� JTextField�� ������
				jtf.requestFocus();
			}
		});		
		 		
		//��ũ�� ũ�� �о����(���̿� ����)
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		int screenWidth = d.width;
		int screenHeight = d.height;		
		// ����� ���߾ӿ� ��ġ
		setLocation( (screenWidth-getWidth())/2, (screenHeight-getHeight())/2);
		
		//ũ�� �������� ���� ��� �ڿ������� ������ �����ǵ��� pack()
		pack();
				
		//Frame�� ������ ���� �Ұ���
		setResizable(false);
		
		//Frame ���⿩�� ����
		setVisible(true);		
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		//�̺�Ʈ �߻� ��ü ���ϱ�
		Object obj = e.getSource();
		
		//���� üũ
		if( obj == jtf){
			String msg = jtf.getText();
			//�Է����� ���� ���
			if(msg ==null || msg.length() ==0){
				JOptionPane.showMessageDialog(this, "�޽����� �Է��ϼ���", "���", JOptionPane.WARNING_MESSAGE);				
			}
			else{
				//�����͸� �Է�����  ���
				try{
					//�����͸� ������ ����
					oos.writeObject(id + "#" + msg);
					
				}catch(IOException ie){
					ie.printStackTrace();					
				}
				//JTextField�� �ʱ�ȭ
				jtf.setText("");
			}
			
		}else if( obj == jbtn){
			//������ ����޽��� ����
			try{
				oos.writeObject(id +"#exit");
				
			}catch(IOException ie){
				ie.printStackTrace();				
			}
		}		
	}
	
	//����ó��
	public void exit(){
		System.exit(0);
	}
	
	//�Է� ��Ʈ�� ��ȯ
	public ObjectInputStream getOis(){
		return ois;
	}

	//JTextArea��ȯ
	public JTextArea getJta(){
		return jta;
	}
	
	//ID��ȯ
	public String getId(){
		return id;
	}
	
	//�ʱ�ȭ
	public void init() throws IOException{
		//���� ����, ������ ���� ��Ʈ��ȣ ���
		socket = new Socket(ip, 5000);
		System.out.println("Connected.......");
		
		//����� ��ü ����
		//������ �����͸� ������ ��ü ����
		oos = new ObjectOutputStream(socket.getOutputStream());		
		//�����κ��� ���޹��� �����͸� ó��(�Է�)�� ��ü
		ois = new ObjectInputStream(socket.getInputStream());
		
		//������ ó���� ���� ������ ����
		//���� ������ ó��
		MultiClientThread ct = new MultiClientThread(this);
		ct.start();
	}
	
	public static void main(String[] args) {
		// ���� MAC��Ÿ�� ����
		JFrame.setDefaultLookAndFeelDecorated(true);
		//��ü ����, ����IP�� ID
		MultiClient cc = new MultiClient("192.168.0.10", "dregon");
		
		
		try{
			//ȣ��
			cc.init();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
