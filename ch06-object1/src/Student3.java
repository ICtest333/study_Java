/* ��ü ���� - ��� �޼ҵ� ȣ��
 * 
 * �Է¹޾Ƽ� ó���ϱ�
 * 
 */

public class Student3 {	
	
	String name;
	int korean;
	int english;
	int math;
	
	//����
	public int getSum(){
		return korean + english + math;		
	}
	
	//���
	public int getAvg(){
		return getSum()/3;
	}
	
	//���
	public void gPrint(String str){
		System.out.println(str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		Student3 nStu = new Student3();
				
		nStu.gPrint("���� ������ �Է������� > ");
		nStu.korean = input.nextInt();
		
		nStu.gPrint("���� ������ �Է������� > ");
		nStu.english = input.nextInt();
		
		nStu.gPrint("���� ������ �Է������� > ");
		nStu.math = input.nextInt();
		
		System.out.println();
		nStu.gPrint("���� ����: " + nStu.korean);
		nStu.gPrint("���� ����: " + nStu.math);
		nStu.gPrint("���� ����: " + nStu.english);		
				
		System.out.println();
		nStu.gPrint("������ > " + nStu.getSum()); 
		
		System.out.println();
		nStu.gPrint("�����> " +nStu.getAvg());		
	}
}
