/* �̹��� �ҷ�����
 * 
 * x��ư �̺�Ʈó�� - �͸��� Ŭ������
 * 
 * ch11-awt�� bird.jpg�� ������ �ֽ��ϴ�. 
 * 
 * �о�� �̹����� �̹��� ��ü�� �����ϱ�
 * @Override public void paint(Graphics g){ }
 */

package com.graphic;

import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;


public class GraphicEx02 extends Frame{
	
	Image img = null;
	
	public GraphicEx02(){
		super("�׷��� �׽�Ʈ2");
		
		//x��ư �̺�Ʈó�� - �͸��� Ŭ������
		addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}			
		});		
				
		//�̹��� �б�
		//�о�� �̹����� �̹��� ��ü�� �����ϱ�
		Toolkit tk = Toolkit.getDefaultToolkit();
		img = tk.getImage("bird.jpg");	//300x200
				
		
		//Frame ����
		setBounds(100, 100, 400, 400);
		setVisible(true);
		
	}
	@Override
	public void paint(Graphics g){
		
		//�̹����� null��� 
		if(img == null) return;
		
		//Image ��ü, x, y, width, height, ImageObserver��ü
		//g.drawImage(img, 300, 200,  this);
		//g.drawImage(img, 0, 0, 300, 200,  this);
		// �̹����� ���̸� �̹��� ������ �߻�
		//g.drawImage(img, 0, 0, 450, 300,  this);
		//�̹����� ���ϰ�� ������ ���δ�. ���� �ִ� �͵� ��ǥ�� �ν��Ѵ�.
		//g.drawImage(img, 0, 0, 150, 100,  this);
		
		//�̹����� ���ϰ�� ������ ���δ�. ���� �ִ� �͵� ��ǥ�� �ν��Ѵ�.
		g.drawImage(img, 10, 10, 300, 200,  this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GraphicEx02();
	}

}
