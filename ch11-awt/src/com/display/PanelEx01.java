/* Button ���� - Panel �������� Buttonũ�� ����
 * 
 * 
 * ------------------------------------------------------
 * ��ư�� ���̺��� ���Ҽ� �ִ� �ּ� ũ��� button�� ������
 * Panel�� �⺻ �߾����ĵ�
 * 
 */

package com.display;

import java.awt.Frame;
import java.awt.Button;
import java.awt.Panel;

public class PanelEx01 extends Frame{
	
	public PanelEx01(){
		//���� ����
		setTitle("Panel Test");
		setSize(300, 300);
		
		//Panel ����
		Panel p = new Panel();
						
		//Button ����
		Button b = new Button("Ȯ��");
		//Button�� Panel�� ���
		p.add(b);
		
		//Panel�� Frame�� ���
		add(p);
		
		//Frame ���� ���� ���� 
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PanelEx01();

	}
}
