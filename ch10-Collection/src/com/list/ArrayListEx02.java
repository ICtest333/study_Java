/* ArrayList - ArrayList 객체 생성 및 데이터 출력
 *  
 * import
 * 객체생성
 * ArrayList 객체에 데이터 삽입
 * ArrayList의 데이터를 출력 
 */

package com.list;

import java.util.ArrayList;

public class ArrayListEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add("배트맨");	// String -> Object 업캐스팅
		al.add("홍길동");	// String -> Object 업캐스팅
		al.add("일지매");	// String -> Object 업캐스팅
		al.add("강하늘");	// String -> Object 업캐스팅
		al.add("슈퍼맨");	// String -> Object 업캐스팅
		al.add("스파이더맨");	// String -> Object 업캐스팅
		
		for(int i=0; i<al.size(); i++){
			//al.get(i);	//Objcet type
			
			//Object -> String 다운캐스팅
			String name = (String)al.get(i);
			
			//출력
			System.out.println(name);			
		}	
	}
}