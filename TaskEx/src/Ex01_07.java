
public class Ex01_07 {

	public static void main(String[] args) {
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		int a;
		
		System.out.print("������ �Է��ϼ��� > ");
		a = input.nextInt();
		
		if( a%2 == 1 ){
			System.out.println("a�� Ȧ�� �Դϴ�.");
		}else{
			System.out.println("a�� ¦�� �Դϴ�.");
		}
	}
}
