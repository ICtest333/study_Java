/* ���
 * 
 * 
 * �θ� Ŭ������ ��ӹ޴� �ڽ�Ŭ���� �����ϰ�
 * ���ǵ� Ŭ������ ��ü������ �� 
 * ����޼ҵ带 ȣ���Ͽ� ��� 
 *  */

package com.ext1;

public class CellPhoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DicaPhone dp = new DicaPhone("A1001", "N1001", 1001, "800��");
		
		MP3Phone mp = new MP3Phone("B1001", "M1001", 2001, 1024);
		
		System.out.println("��\t ��ȣ\t �ڵ�\t �ɼ�(ȭ�Ҽ�/������)");
		System.out.print(dp.getModel()+"\t");
		System.out.print(dp.getNumber()+"\t");
		System.out.print(dp.getChord()+"\t");
		System.out.println(dp.getPixel()+"\t");
		
		
		System.out.print(mp.getModel()+"\t");
		System.out.print(mp.getNumber()+"\t");
		System.out.print(mp.getChord()+"\t");
		System.out.println(mp.getSize()+"\t");
		
				
		

	}

}
