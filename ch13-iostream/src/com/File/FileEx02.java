/* File Class - �������� Ȯ��, ���� ����/����/����
 * 
 * import
 * ���� ��ü ����
 * ���� ���� �� ����� ����ϱ�
 * ---------------------------------------------------
 * ���� �����
 * 
 */

package com.File;

import java.io.File;
import java.io.IOException;

public class FileEx02 {
	
	public static void main(String[] args){
		//���� ��ü ����
		File f1 = new File("C:" + File.separator + "javanAndroid" + File.separator + "sample.txt");
		
		System.out.println("=== ���� ����===");
		try{
			//���� ����
			System.out.println(f1.createNewFile());
		}catch(IOException e){
			e.printStackTrace();
		}		
		
		System.out.println("\n=== ���� ����===");
		//������
		System.out.println("������ : " + f1.getAbsolutePath());
		System.out.println("���丮�� : " + f1.getParent());
		System.out.println("���ϸ� : " + f1.getName());
		System.out.println("����ũ�� : " + f1.length());
		
		//���ϸ� �����ϱ�
		System.out.println("\n=== ���ϸ� ����===");		
		//�����ϰ����ϴ� ���� ��ü ����
		File f2 = new File("C:" + File.separator + "javanAndroid" + File.separator + "sampleNameChanged.txt");
		System.out.println(f1.getName() + " -> " + f2.getName());
		System.out.println(f1.renameTo(f2));
		System.out.println("������ : " + f2.getAbsolutePath());
		System.out.println("���丮�� : " + f2.getParent());
		System.out.println("���ϸ� : " + f2.getName());
		System.out.println("����ũ�� : " + f2.length());
		
		//���� ����
		System.out.println("\n=== ���ϸ� ����===");
		//������ ������ ��� ���� ����
		if( f2.delete()){
			System.out.println(f2.getName() + " ���� �����Ϸ�");
		}else{
			System.out.println("������ �������� �ʽ��ϴ�");
		}		
	}
}