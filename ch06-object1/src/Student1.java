/* ��ü ����
 * 
 */


public class Student1 {	
	
	//��� ����
	String name;
	int age;
	
	//��Ʈ ������(��������): �����Ϸ��� �ڵ����� ó����
	//public Student(){}	

	public static void main(String[] args) {
		
		//��ü ���� �� ����
		Student1 student1 = new Student1();		
		System.out.println(student1);
		
		//��ü�� �����ȵ� ��� null/0�� �⺻���� ���µ˴ϴ�. 
		System.out.println(student1.name);
		System.out.println(student1.age);
		
		System.out.println();
		//��ü�� ��������� ���ϴ� ���� ������ �� ����մϴ�.
		student1.name ="ȫ�浿";
		student1.age = 400;
		System.out.println(student1.name);
		System.out.println(student1.age);
		
		//������ Ŭ������ �Ǵٸ� ��ü �߰� ����
		System.out.println();
		Student1 newstudent = new Student1();
		System.out.println(newstudent);
		
		//��ü�� ��������� ���ϴ� ������ ����
		newstudent.name = "�迬��";
		newstudent.age = 18;
		System.out.println(newstudent.name);
		System.out.println(newstudent.age);
	}

}
