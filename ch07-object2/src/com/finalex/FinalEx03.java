/* Ŭ������ final ����
 * 
 * JAVA API���� final���� ��)
 * JAVA�� �⺻Ŭ������ ��� �� ��Ű�� �Ͽ����ϴ�. 
 * �ֳ��ϸ�. ���� �״�� ����ϰ� �ϱ� ���ؼ� �Դϴ�. (�⺻���� ó��)
 * public final class String
 * public final class System
 *  
 * */


package com.finalex;

//Ŭ������ final�� ����ϸ� ��ӵ��� �ʽ��ϴ�.
/*final class Me{
	int a = 100;
}*/

class Me{
	int a = 100;
}

// ERROR: The type FinalEx03 cannot subclass the final class Me
public class FinalEx03 extends Me{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
