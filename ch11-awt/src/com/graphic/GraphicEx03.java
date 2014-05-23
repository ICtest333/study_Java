/* �׸��� �׸��� - ���ڸ� ���� �����ϰ� �׸��� ����
 * 
 * import
 * �׸��� �׸��� ���� ����� ���ڼ���
 * implements MouseMotionListener
 * Frame�� ���콺 �̺�Ʈ������ ����
 * @Override public void mouseMoved(MouseEvent e){ } ����
 * @Override public void mouseDragged(MouseEvent e){ } ���� �� ������
 * repaint();	// ���������� paint(Graphics g)�� �ڵ������� ȣ�� ���� *  
 * update()�� ������
 * ----------------------------------------------------------------------
 * paint(Graphics g) �Ź� ����, ���絥���͸� ǥ���մϴ�.
 * �׸����� ��� �����Ǿ����� ��, ������Ű�� ���� Frame�� update()�� �������ؾ� �մϴ�.
 * 
 * mouseMoved() {} �̺�Ʈ�� ���ڰ� ���콺�� ����ٴϴ� ���� Ȯ��
 * mouseMoved() {} -> mouseDragged {} �޼ҵ� ���� �Ű� �׸��� �׷����� ��Ȯ��
 * 
 */
package com.graphic;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class GraphicEx03 extends Frame implements MouseMotionListener{
	int x=0;
	int y=0;	
	
	public GraphicEx03(){
		super("�׷��� ����Ʈ3");
		
		//x��ư �̺�Ʈ ó��
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});			
				
		setBounds(100, 100, 500, 500);
		setVisible(true);
		
		//Frame�� ���콺 �̺�Ʈ������ ����
		addMouseMotionListener(this);
	}
	
	public void paint(Graphics g){
		//�׸��� �׸��� ���� ����� ���ڼ���
		g.setFont(new Font("Serif", Font.PLAIN, 15));
		g.setColor(Color.GREEN);
		g.drawString("*", x, y);		
	}
	
	@Override
	public void mouseMoved(MouseEvent e){		
	}	
	
	@Override
	public void mouseDragged(MouseEvent e){
		//�����϶� ���� ���콺 Ŀ���� ��ǥ
				x = e.getX();
				y = e.getY();
				
				//paint()�޼ҵ带 ���� ���� graphics ��ü�� �־��ټ� ����.
				//�״��, repaint()�� ����ϰ� �Ǹ� ���������� paint(Graphics g)�� �ڵ������� ȣ���Ѵ�.
				// repaint() -> update(Graphics g) -> paint(Graphics g)
				repaint();
	}
	
	//�׸����� ��� ���� �׸� ������ �����Ǿ����� ��, 
	//������Ű�� ���� Frame�� update()�� ������
	@Override
	public void update(Graphics g){
		paint(g);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GraphicEx03();
	}
}
