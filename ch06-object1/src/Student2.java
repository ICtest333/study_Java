/* ��ü ���� - ��� �޼ҵ� ȣ��
 * 
 */

public class Student2 {	
	
	//��� ����
	String name;
	int korean;
	int math;
	int english;
	int sum;
	int avg;	

	//���� ��� �޼ҵ�
	public int sum(int a, int b, int c){
		return a+b+c;
	}	
	
	//��� ��� �޼ҵ�
	public float avg(int a){
		return  a/3;
	}
	
	public static void main(String[] args) {
			
		Student2 student = new Student2();
				
		student.name = "�迬��";
		student.korean = 100;
		student.math = 90;
		student.english = 80;
		student.sum = student.korean + student.math + student.english;
		student.avg = student.sum / 3;
		

		System.out.println("�̸�" + "\t" +  
				"����" + "\t" + 
				"����" + "\t" + 
				"����" + "\t" + 
				"����" + "\t" + 
				"���");
		
		System.out.println(student.name + "\t" +  
				student.korean + "\t" + 
				student.math + "\t" + 
				student.english + "\t" + 
				student.sum + "\t" + 
				student.avg);
	}
}
