
public class VariableTypes {

	
	public static void main(String[] args){
		
		System.out.println("=========���� ���ͷ�=========");
		boolean bool = true;	//true, false
		System.out.println("bool = " + bool);
				//bool = 20;	//boolean Ÿ�Կ� ������ ����� Error��.
		
		
		System.out.println("");
		System.out.println("=========������ ���ͷ�=========");
		
//		������ ũ��: 2byte(2byte ǥ������: 0~65,535), �ٱ��� ó���� ���� �����ڵ�(Unicode)���
		char char_a1 = 'A';		//���������� �ƽ�Ű�ڵ� 65�� �ν�
		System.out.println("char_a1 = " + char_a1);
		
		char char_a2 = 65;		// A�� �ش�Ǵ� �ƽ�Ű�ڵ� 65�� ���� �Է�
		System.out.println("char_a2 = " + char_a2);
		
		char char_a3 = '\u0041';	//A�� �����ڵ�� ǥ��
		System.out.println("char_a3 = " + char_a3);
				
		char char_c1 = '��';
		System.out.println("char_c1 = " + char_c1);
		
		char char_c2 = '\uc790';	//'��'�� �����ڵ�� ǥ��
		System.out.println("char_c2 = " + char_c2);
		
		
		System.out.println("");
		System.out.println("=========������ ���ͷ�=========");
//		byteũ��: 1byte(ǥ������: -128~127)
//		byte b1=128;	//���� �Ѿ�� error
		byte b2=127;
		System.out.println("b2 = " + b2);
		
//		short ũ��: 2byte(ǥ������: -32,768 ~ 32,767)
//		short s1 = 32768;	//���� �Ѿ�� error
		short s2 = 32767;
		System.out.println("s2 = " + s2);
		
//		int ũ��: 4byte(ǥ������: -214,7483,648 ~ 214,7483,647)
//		int i1 = 2147483648;	//���� �Ѿ�� error
		int i2 = 123456789;		//���� ǥ���� �⺻
		System.out.println("i2 = " + i2);
		
//		long ũ��: 8byte;
		long lg1 = 123456;
		long lg2 = 123456l;
		long lg3 = 123456L;
		System.out.println("lg1 = " + lg1);
		System.out.println("lg2 = " + lg2);
		System.out.println("lg3 = " + lg3);
		
		
		System.out.println("");
		System.out.println("=========�Ǽ��� ���ͷ�=========");
//		float ũ��: 4byte
		float f1 = 9.1F;
		System.out.println("f1 = " + f1);
		
//		double ũ��: 8byte (�⺻)
		double d1 = 9.8;
		double d2 = 9.8D;
		System.out.println("d1 = " + d1);
		System.out.println("d2 = " + d2);
		
		
		
		
		
	}
}
