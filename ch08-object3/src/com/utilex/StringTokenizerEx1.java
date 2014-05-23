/* StringTokenizer - ���ڿ��� �����ڰ� ���� ���
 * 
 * String��ü ����
 * StringTokenizer����� ���� import
 * 
 * */


package com.utilex;

import java.util.StringTokenizer;

public class StringTokenizerEx1 {

	public static void main(String[] args) {
		
		//�����ڰ� ���� ���
		String source = "100,200,300,400,500";
		StringTokenizer st = new StringTokenizer(source, ",");
		
		//������ �ִ��� ������ �� ������ ����
		//������ �����ϱ� - hasMoreTokens()
		while(st.hasMoreTokens()){
			// ������ �����ϱ� - nextToken()
			System.out.println(st.nextToken());
		}
		
		
		
		
		

	}

}
