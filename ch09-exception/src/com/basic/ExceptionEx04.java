/* ����ó�� - throws
 * 
 * ���� Ŭ���� import
 * ERROR: Unhandled exception type IOException	//�ݵ�� ����ó���ؾ� ���� �����Ϸ��� �˷���(���� ����)
 * throws�� ���� -> main���� try~catch�� ����
 * ��ü ���� 
 * try~catch������ ��ü�� ���� ����ó�� 
 * dan ���� ���
 * �����Է����� ����ó�� �߻�
 * 
 * throws ����ó���� ����:
 * �޼ҵ帶�� try~catch�� �ʿ���� ����  
 */

package com.basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ExceptionEx04 {
	
	//���� Ŭ���� �������� ȣ�Ⱑ�� �޼ҵ�
	private void printData() throws IOException, NumberFormatException{
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		System.out.print("�� �Է�> ");
		//String -> int 
		int dan = Integer.parseInt(br.readLine());
		
		System.out.println(dan + "��");
		System.out.println("=============================");
		for(int i=1; i<=9; i++){
			System.out.println(dan + "*" + i + "=" + dan*i);
		}
	}

	public static void main(String[] args) {
		
		ExceptionEx04 ex = new ExceptionEx04();
		
		// throws������ �޼ҵ忡�� ���ܹ߻����ɹ��� ����ó�� 
		try{
			ex.printData();
			
		}catch(Exception e){
			System.out.println("������ �߻��߽��ϴ�.");
		}	
	}
}