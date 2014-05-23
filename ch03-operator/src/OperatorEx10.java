
public class OperatorEx10 {
	
	public static void main(String[] args){
		System.out.println("=========��Ʈ ������=========");
		System.out.println("");
		
		byte a = 12;
		// 128 64 32 16 8 4 2 1
		// 0   0  0  0  1 1 0 0
		
		byte b = 20;
		// 128 64 32 16 8 4 2 1
		// 0   0  0  1  0 1 0 0
		
		System.out.println("��Ʈ������  AND(&): ");
		/*
		 ��1	��2	���
		0	0	0
		1	0	0
		0	1	0
		1	1	1*/
		
		byte c = (byte) (a & b);
		// 128 64 32 16 8 4 2 1
		// 0   0  0  0  1 1 0 0
		// 0   0  0  1  0 1 0 0
		//----------------------
		// 0   0  0  0  0 1 0 0
		
		System.out.println("a : " + a);	
		System.out.println("b : " + b);
		System.out.println("a & b : " + c);
		

		
		System.out.println("");
		System.out.println("��Ʈ������  OR(|): ");
		/*
		 ��1	��2	���
		0	0	0
		1	0	1
		0	1	1
		1	1	1*/
		
		byte d = (byte) (a | b);
		// 128 64 32 16 8 4 2 1
		// 0   0  0  0  1 1 0 0
		// 0   0  0  1  0 1 0 0
		//----------------------
		// 0   0  0  1  1 1 0 0
		
		System.out.println("a : " + a);	
		System.out.println("b : " + b);
		System.out.println("a | b : " + d);
		
		

		System.out.println("");
		System.out.println("��Ʈ������  XOR(^): ");
		/*
		 ��1	��2	���
		0	0	0
		1	0	1
		0	1	1
		1	1	0*/
		
		byte e = (byte) (a ^ b);
		// 128 64 32 16 8 4 2 1
		// 0   0  0  0  1 1 0 0
		// 0   0  0  1  0 1 0 0
		//----------------------
		// 0   0  0  1  1 0 0 0
		
		System.out.println("a : " + a);	
		System.out.println("b : " + b);
		System.out.println("a ^ b : " + e);
	
		
	}
}