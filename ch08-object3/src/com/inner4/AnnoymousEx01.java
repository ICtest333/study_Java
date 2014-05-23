/* Annonymous ���� Ŭ������ ���� �� - ���Ǻ�, �����θ� ���� ���� Ŭ���� ����
 * 
 * 
 * �θ�Ŭ������ disp() ���
 * �θ�Ŭ���� disp() �� ������ ���
 * 
 * ���Ǻ�, ������ ���� ���� Ŭ���� ����
 * 
 * ----------------------------------------
 * InnerŬ���� �θ� Ŭ������ ��ӹ޾� ���
 * 
 * �̰��� ���� �ܰ迡�� AnonymousŬ������ ������ ���ڽ��ϴ�.(AnonymousEx02/AnonymousEx03) 
 * 
 * ���Ǻ�	class Inner{}
 * ������	new Inner();
 */


package com.inner4;

//
class Inner4{
	//
	public void disp(){
		System.out.println("�θ�Ŭ������ disp");
	}
}

public class AnnoymousEx01 {

	// �̸��� ���� ���� Ŭ���� �����ϴµ� �θ��̸��� ���ų� �������̽����� ����.
	// �ݵ�� ��ü������ �ٷ� ���־�� �Ѵ�.
	public void innerTest(){

		//���Ǻ�	class Inner{}
		//������	new Inner4();
		class Inner extends Inner4{
			//disp ������
			@Override
			public void disp(){
				System.out.println("�����ǵ� disp");
			}		
		}
		Inner i = new Inner();
		i.disp();
	}
	
	public static void main(String[] args) {
		AnnoymousEx01 an = new AnnoymousEx01();
		an.innerTest();
	}

}
