/* Graphic - paint()�� �پ��� �����׸���
 *  
 * x��ư Ŭ���� ����ó�� - �͸� Ŭ���� �̿�
 * Frame ��ġ, ����, ���� ����
 * Frame ���⿩�� ����
 * paint�� �׸��� �׸��� �ִ� ������ ����� Graphics�� ���� �׸��� �׸��ϴ�
 * 
 * 
 * 
 * ------------------------------------------------------------------
 * �׸��� �׸��� �ִ� Ư���� �����־�� �ϴµ� 
 * paint( )�޼ҵ�� �� ������ ����� �ְ� Graphics��ü�� ���� �׸��� �׸��ϴ�.
 * 
 * 
 * 
 */

package com.graphic;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

import com.display.FrameEx01;

public class GraphicEx01 extends Frame {
	
	Graphics g;	
	
	public GraphicEx01(){
		//Frame Ÿ��Ʋ ����
		super("Graphic Test");
		
		//x��ư Ŭ���� ����ó�� - �͸� Ŭ���� �̿�
		addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});	
		
		//Frame ��ġ, ����, ���� ����
		setBounds(100, 100, 400, 300);
		
		//Frame ���⿩�� ����
		setVisible(true);		
	}
	//paint�� �׸��� �׸��� �ִ� ������ ����� Graphics�� ���� �׸��� �׸��ϴ�.
	@Override
	public void paint(Graphics g){
		//����
		//������ �۲�, ��Ÿ��, ũ�� ����
		g.setFont(new Font("Serif", Font.PLAIN, 15));
		//ǥ���� ����, ��ġ(x, y)
		g.drawString("Graphics�� �̿��ؼ� �׸��� �׸��ϴ�", 10, 50);
		
		//��
		//x, y, width, height �� �׸���
		g.drawOval(50, 60, 50, 50);
		//������ ����
		g.setColor(Color.BLUE);
		//������ ����� ���� ä��ϴ�.
		g.fillOval(100, 100, 50, 50);
		
		//��
		g.setColor(Color.RED);
		//����x��ǥ, ����y�·�, ����x��ǥ, ����y��ǥ
		g.drawLine(300, 100, 50, 50);
		
		//�簢��
		g.setColor(Color.CYAN);
		g.fillRect(160, 100, 50, 50);
		//x, y, width, height, �𼭸��� �ձ۰� �� ���̿� ����
		//g.fillRoundRect(220, 100, 120, 80, 30, 30);
		g.fillRoundRect(220, 100, 120, 80, 100, 100);	//������ ������ ������ �׸���
		
		//�ٰ���
		g.setColor(Color.MAGENTA);
		//������ x��ǥ �迭, ������y��ǥ �迭, ������ ����
		g.fillPolygon(new int[]{50,100,150,200}, new int[]{250,200,200,250}, 4);
						
		//��ȣ
		g.setColor(Color.PINK);
		//x, y, width, height, ���۰���, ������
		//g.fillArc(250, 200, 100, 100, 0, 120);
		g.fillArc(250, 200, 100, 100, 0, 240);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GraphicEx01();
	}

}
