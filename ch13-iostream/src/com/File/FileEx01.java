/* File Class - ���� File Ž����
 * 
 *  ���� ��ü ����
 *  ������ �������� �ʰų� ���丮�� �ƴ� ��쿡 ���� ���ǹ� ����
 *  ������ ����� ���� ���丮 �� ���� ���� ��ȯ
 *  
 * ------------------------------------------------------------
 * ���丮�� ������ ����Ʈ�� ����մϴ�.
 * ��½� ���丮�� [ ]ǥ�ø� ���ְ�
 * ������ ���Ͽ뷮�� ǥ���� �ݴϴ�.
 * 
 */

package com.File;

import java.io.File;

public class FileEx01 {
	public static void main(String[] args){
		String path = "C:\\";
		
		//���� ��ü ����
		File f = new File(path);
		//������ �������� �ʰų� ���丮�� �ƴ� ���
		if(!f.exists() || !f.isDirectory()){
			System.out.println("��ȿ���� ���� ���丮�Դϴ�.");
			//���α׷� ����
			System.exit(0);
		}		
		//������ ����� ���� ���丮 �� ���� ���� ��ȯ
		File[] files = f.listFiles();
		
		for(int i=0; i<files.length; i++){
			File f2 = files[i];
			if(f2.isDirectory()){	//���丮 ǥ��
				System.out.println("[" + f2.getName() + "]");
			}else{	//���� ǥ��				
				System.out.printf("%s\t(%,dbytes)\n", f2.getName(), f2.length());
			}
		}		
	}
}
