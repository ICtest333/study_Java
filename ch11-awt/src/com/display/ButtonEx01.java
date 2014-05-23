/* Button ���� - �⺻ Frame�� ǥ��
 * 
 * Frame���
 * ������ ����
 * ��ü ����
 * Button ����
 * Button ������ ����
 * Button�� Frame�� ��� 
 * 
 * ------------------------------------------------------
 * Button ���� - Ȯ��Ǵ� ���� Ȯ��
 * �г��� ����� Button ũ�� ���� (PanelEx01.java)  
 * 
 **setSize�� ������ ��ư ũ��� ǥ������ �ʰ� Frameũ��� Ȯ��Ǵ� ���� �߻�
 * ���̾ƿ��� ����� ��ư�� ũ�⸦ �����ؾ� �ϴµ� ���̾ƿ��� ������� �ʾƼ� ��ư�� Ȯ��Ǵ� ���� �߻�
 * 
 * ������Ʈ�� �⺻������ setSize�� �ȸ��� Ȯ��� (setLayout �⺻ ����Ǿ� ����)
 **�ذ���:
 * 1)setSize�� ����ϰ� layout�� �����ҷ��� layout��� ���Ѵٰ� ������ ��� �մϴ�.
 * 2)layout�� �Ἥ Ʋ�� ����� �� Ʋ�ȿ� ������Ʈ�� ������ �մϴ�.
 * 3)������Ʈ ���� �гη� ��� ǥ���Ѵ�.(�гε� layout�����Ǿ� ����)
 * 
 */


package com.display;

import java.awt.Frame;
import java.awt.Button;

//Frame ���
public class ButtonEx01 extends Frame{
	
	//������ ����
	public ButtonEx01(){
		//���� ����
		super("Button �׽�Ʈ");		
		//width, hegith����
		 setSize(300,  300);		 
		 //Framew ���� ���� ����
		 setVisible(true);
		 
		 
		 //Button����
		 //Button��ü ����
		 Button b = new Button("Ȯ��");
		 // setSize�� ������ ��ư ũ��� ǥ������ �ʰ� ���� Frameũ��� Ȯ��Ǵ� ���� �߻�
		 b.setSize(100,  50); 	//width, height ����		 
		 //Button�� Frame�� ���
		 add(b);
		
	}

	public static void main(String[] args) {
		new ButtonEx01(); 

	}

}
