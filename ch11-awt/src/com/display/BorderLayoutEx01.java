/* ��ư ���� - BorderLayout���
 * 
 * 
 * 
 *  ũ�� ������ ��ư ũ�Ⱑ Ȯ��˴ϴ�.
 *  Ȯ����� �ʰ� �ϱ� ���ؼ��� Panel���
 */

package com.display;

import java.awt.Component;
import java.awt.Frame;
import java.awt.Button;
import java.awt.BorderLayout;
import java.awt.Panel;

public class BorderLayoutEx01 extends Frame{
	
	
	public BorderLayoutEx01(){
		//Frame ����
		setTitle("BorderLay Test");
		setSize(300, 300);
		//Frame���� �⺻ ���̾ƿ��� BorderLayout���� �����Ǿ� �־�
		//BorderLayout���� ���̾ƿ� ���� ��������
		//setLayout(new BorderLayout());
	
		//Panel ����
		Panel pc = new Panel();
		Panel pe = new Panel();		
				
		//Button �߰�
		Button  btnEast= new Button("east");
		Button  btnWest= new Button("west");
		Button  btnSouth= new Button("south");
		Button  btnNorth= new Button("north");
		Button  btnCenter= new Button("center");
		
		//center�� Panel�� ���
		pc.add(btnCenter);
		//p.add(east);
		pe.add(btnEast);
		
		//Frame�� ��ư �߰�
		add(pe, BorderLayout.EAST);
		add(btnWest, BorderLayout.WEST);
		add(btnSouth, BorderLayout.SOUTH);
		add(btnNorth, BorderLayout.NORTH);
		add(pc, BorderLayout.CENTER);			
		
		//Frame ���⿩�� ����
		setVisible(true);
	}

	public static void main(String[] args) {				
		new BorderLayoutEx01();
	}
}
