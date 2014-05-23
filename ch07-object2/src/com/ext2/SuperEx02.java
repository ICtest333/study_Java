/* super()
 * 
 * 상속
 * 디폴트 생성자만 있는 경우*/

package com.ext2;


//부모 클래스
class Parent2{
//class Parents extends Object{
	
	public Parent2(){
		super();	//Object의 디폴트 생성자 (암묵적으로 삽입됨)
	}	
	int a;
}

//자식 클래스
class Child2 extends Parent2{
	
	public Child2() {
		super();	//부모 클래스의 디폴트 생성자 (암묵적으로 삽입됨)
	}	
	int b;
}

public class SuperEx02 {

	public static void main(String[] args){
		Child2 ch = new Child2();		
	}
}
