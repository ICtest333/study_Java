/* File Class - ���丮
 * 
 * ���丮 ����
 * ���丮 ���� 
 * 
 */

package com.File;

import java.io.File;

public class FileEx03 {
	public static void main(String[] args){
		System.out.println("===���丮 ����===");
		File f = new File("C:" + File.separator + "javanAndroid" + File.separator + "javaSample");
		
		//���丮 ������ ������ true ���н� false
		System.out.println(f.mkdir());
		
		//���丮 ����
		System.out.println("\n===���丮 ����===");
		if(f.delete())
			System.out.println(f.getName() + " ���丮 ����");
		else{
			System.out.println("���丮�� �������� �ʽ��ϴ�.");
		}		
	}
}
