
public class Ex02_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		//���� ���� �� �ʱ�ȭ
		int i, j, result;		
		i = j = result = 0;
		
		String oprt ="?";
		
		//���� 1 �Է�
		System.out.print("��Ģ������ �����մϴ� >>>");
		System.out.print("���� 1 �Է��ϼ��� > ");
		do{
			i = input.nextInt();
					
		}while( i <0 || i>100);
		
		// ������ �Է�
		System.out.print("�����ڸ� �Է��ϼ��� > ");
		do{
			oprt = input.next();
			System.out.println("1");
					
		}while( oprt != "+" || oprt != "-" || oprt != "*" || oprt != "/");
		
		System.out.println("2");
		
		
		//���� 2 �Է�
		System.out.print("���� 2 �Է��ϼ��� > ");
		do{
			i = input.nextInt();
			
			if( oprt =="/" && i == 0){
				System.out.print("0���� ���� �� �����ϴ�");			
			}			
		}while( i <0 || i>100);
		
		
		switch(oprt){
			case "+":{
				result = i + j;
				break;			
			}
			case "-":{
				result = i - j;
				break;			
			}
			case "*":{
				result = i * j;
				break;			
			}
			case "/":{
				result = i / j;
				break;			
			}
		}
		
		System.out.println(i + oprt + j + "=" + result);				
		
		
	}
}
