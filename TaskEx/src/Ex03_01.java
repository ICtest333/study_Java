
public class Ex03_01 {
	
	
	String product;
	int unitPrise;
	int su;
	
	
	public void getSale(){
		
		System.out.print("��ǰ�� �Է� : " + product);
		System.out.println();
		
		System.out.printf("�ܰ� �Է� : %,d", unitPrise);
		System.out.println();
						
		System.out.printf("�Ǹż��� : %,d", su);
		System.out.println();
		
		//���η� 15%������ ��
		int tmp = (int)(unitPrise*su*0.85);
		
		System.out.printf( product + su + "���� ������  %,d", tmp );
		//System.out.print( product + su + "���� ������  " + tmp );
		
		System.out.println();
		
	
		
		return ;
	}

	public static void main(String[] args) {
/*		����: 
			A���� �븮�������� �׳� ���� �Ǹž��� 15%�� ������ �ֱ�� �߽��ϴ�.
			�Ǹ��� ��ǰ��� ��ǰ�� �ܰ��� ������ Ű����� �Է¹޾� 
			���� �ݾ��� ��½�Ű�� ���α׷� �ۼ�.
			(��. ��½ÿ��� �Ҽ����ϴ� ����)
		�������:
			��ǰ�� �Է�:			�����
			��� �Է�:				500000
			�Ǹ� ����:				3
			����� 3���� ������:	1,275,000��*/
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int[] num = new int[2];
		
		Ex03_01 ex = new Ex03_01();
		System.out.print("��ǰ�� �Է� >");
		ex.product = input.next();
//		System.out.println();
		
		System.out.print("�ܰ� �Է� >");
		ex.unitPrise = input.nextInt();
//		System.out.println();
		
		System.out.print("�Ǹż��� �Է� >");
		ex.su = input.nextInt();
		
		ex.getSale();
		
		
	}
}
