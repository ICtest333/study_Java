/* StringTokenizer - 문자열의 구분자가 여러개인 경우
 * 
 */

package com.utilex;

import java.util.StringTokenizer;

public class StringTokenizerEx2 {

	public static void main(String[] args) {
		//문자열의 구분자가 여러개 인 경우		
		String source = "2020-03-12 16:24:50";
		
		//구분자 한꺼번에 지정
		StringTokenizer st = new StringTokenizer(source, "-: ");
		
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}				
	}
}
