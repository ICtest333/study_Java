/* MouseEvent
 * 
 * 
 * 
 * 
 * ������Ʈ�� �����̰� �ҷ��� layout�� ��Ȱ��ȭ ���Ѿ� �մϴ�.
 */

package com.event;

import java.awt.Frame;
import java.awt.Label;
import java.awt.Button;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MousEventEx extends Frame implements ActionListener, MouseMotionListener{
	//Label ��ü ����, �ʱ⼳��
	Label move = new Label("***********", Label.CENTER);
	Button btnExits = new Button("����");	
	
	public MousEventEx() {
		//Frame Ÿ��Ʋ ����
		setTitle("MouseEvnet Test");
		
		//Label�� ����� �� ���� ����
		move.setForeground(Color.WHITE);
		move.setBackground(Color.RED);
		
		//������Ʈ�� �̺�Ʈ �߻��� �̵��ϰ� ó���Ϸ��� ���̾ƿ��� ������� ���ƾ� �մϴ�.
		//Layout�� ��Ȱ��ȭ �մϴ�.
		setLayout(null);
		
		//Button�� �̺�Ʈ������ ����
		btnExits.addActionListener(this);
		
		//Frame�� �̺�Ʈ�����ʿ� ����
		addMouseMotionListener(this);
		
		//Label, Button�� ��ǥ, ����, ���� ����
		move.setBounds(100, 50, 150, 20);
		btnExits.setBounds(250,  500,  50,  30);
		
		//Frame�� Label�� ��ư ���
		add(move);
		add(btnExits);
		
		//Frame ��ǥ, ����, ���� ����
		setBounds(300,  300,  300,  300);
		
		//Frame ���� ���� ����
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e){
		System.exit(0);
	}
	
	@Override
	public void mouseMoved(MouseEvent e){
		//���콺 x, y��ǥ�� Point ������
		Point p = e.getPoint();
		
		//����� ���콺 x,y��ǥ�� Label�� x,y��ǥ�� �־��ݴϴ�.
		move.setLocation(p);		
	}
	
	public void mouseDragged(MouseEvent e){		
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MousEventEx();

	}

}
