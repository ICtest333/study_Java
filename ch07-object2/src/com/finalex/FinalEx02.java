/*�޼ҵ忡 final ����*/

package com.finalex;

class Cont{
	
	//�޼��忡  final�� �����ϸ� ����� ������ �޼ҵ� ������ �Ұ���
	public final void play(){
		System.out.println("�÷��� �޼ҵ�");
	}
}

public class FinalEx02 extends Cont{

	
//	@Override
	//	Cannot override the final method from Cont
	/*public void play(){
		System.out.println("�ڽ� Ŭ������ �÷��� �޼ҵ�");
	}*/
	
	public static void main(String[] args) {
		FinalEx02 f = new FinalEx02();
		f.play();
	}
}
