
public class ForEx04 {

	public static void main(String[] args) {
		// �� �Է� ���� �� ������ ����ϱ�
		
		int dan;
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.print("�� �Է��ϼ��� > ");
		dan = input.nextInt();
		
		System.out.print("== " + dan + "�� == \n");
		
		for(int i=1; i<10; i++){
			System.out.println(dan + "X" + i + " = " + (dan*i));			
		}

	}

}
