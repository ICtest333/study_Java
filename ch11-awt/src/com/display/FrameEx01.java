/* Frameâ �����ϱ�
 * 
 * Frame ����� ��ü����
 * Frame�� �����ڿ��� �⺻ ���� ����
 * - ���� ����
 * - ����, ���� ����
 * Frame�� ȭ�� ���� ���� ���� 
 * 
 * --------------------------------------
 * �ּ�ȭ, �ִ�ȭ�� �⺻����(�⺻)
 * �����ư�� �۵��ȵ�(�⺻)
 *  
 **Frame�������
 * 1)Frame ��� (����) - ���ȭ ��ų�� �ִ� ������ �־� ��Ȱ�뼺 ������
 * 2)Frame ��ü���� - ��Ȱ�뼺 ������, 
 */


package com.display;

import java.awt.Frame;

// Frame ���
public class FrameEx01 extends Frame{
	
	//�����ڿ��� �⺻���� ����
	public FrameEx01(){
		//���� ����
		super("Frame Test");
		
		//����, ���� ����
		setSize(300,  300);
		
		//Frame ȭ�� ���� ���� ����
		setVisible(true);
	}
	public static void main(String[] args){
		//��ü ����
		new FrameEx01();
	}

}
