/* ���� ���� ���: �� ȣ��(call by value)
 * 
 * */

public class MethodTest02 {
	
	
	//�������
	
	//���� ���� ���: �� ȣ��(call by value)
	public int increase(int n){
		++n;
		return n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//���� ����
		int var1 = 100;
		MethodTest02 m = new MethodTest02();
		
		int var2 = m.increase(var1);


		System.out.println("var 1: " + var1);
		System.out.println("var 2: " + var2);

	}

}
