/* StringTokenizer - ���ڿ��� �����ڰ� �������� ���
 * 
 */

package com.utilex;

import java.util.StringTokenizer;

public class StringTokenizerEx2 {

	public static void main(String[] args) {
		//���ڿ��� �����ڰ� ������ �� ���		
		String source = "2020-03-12 16:24:50";
		
		//������ �Ѳ����� ����
		StringTokenizer st = new StringTokenizer(source, "-: ");
		
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}				
	}
}
