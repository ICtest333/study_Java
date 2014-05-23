/* Button ���� - layout �̻��
 * 
 * import 
 * Frame ���
 * ������ ����
 * ��ü ����
 * 
 * Button �߰�
 * layout�̻������	//setLayout(null)
 * 
 * button�� ��ǥ����(x, y ��ġ ����)
 * 
 * --------------------------------------
 * ������Ʈ�� ���� ����� ������ ������� ��ǥ�����ؾ� �Ǵ� ���� �߻�
 * 
 */

package com.display;

import java.awt.Frame;
import java.awt.Button;

//Frame ���
public class ButtonEx02 extends Frame {
	
	//������ ����
	public ButtonEx02(){
		//���� ����
		super("button Test 02");		
		//ũ�� ����
		setSize(300,  300);	//width, height			
		
		//Button �߰��ϱ�
		Button b = new Button("Ȯ��");
		//layout�̻������: layout �����ϰ� setSize()����ϵ��� ��������� ����
		setLayout(null);
		b.setSize(100,  50);	//widht, height
		b.setLocation(100, 50);	//x, y ��ġ ����
		//Button�� Frame�� ���
		add(b);
		
		//Frame ���� ���� ����
		setVisible(true);
	}
	

	public static void main(String[] args) {
		// ��ü ����
		new ButtonEx02();

	}

}
