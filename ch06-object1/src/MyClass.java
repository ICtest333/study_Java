/* ����ȭ, ĸ��ȭ - Ŭ���� �и�
 * 
 * MyClass.java
 * MyClassMain.java
 * */

public class MyClass {
	
	//����ȭ
	private String name;
	private int age;
	
	/* ����Ʈ ������: �����ڸ� ������� ������ �����Ϸ��� default �����ڸ� �ڵ� ����
	 * �׷��Ƿ� ���ڰ� �ִ� �����ڸ� ���� ��� ����Ʈ �����ڰ� �ʿ��� ��� default �����ڸ� ����ؾ� �˴ϴ�.
	 * */
	public MyClass(){}
	
	//���ڰ� ���޵Ǵ� ������
	public MyClass(String n){
		name =n;
	}
	/*Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		The constructor MyClass() is undefined*/
	
//	������ �����ε�: �޼��� �����ε��� ������ ��Ģ�� �����Ͽ� ������ �����ε� ����
//	public MyClass(String a){}
	
	public MyClass(String n, int a){
		name = n;
		age = a;
		System.out.println("��ü�� �����Ǿ����ϴ�.");
	}	
	
	//ĸ��ȭ
	public void setName(String n){
		name =n;		
	}

	public String getName(){
		return name;
	}
	
	public void setAge(int a){
		age = a;
	}
	
	public int getAge(){
		return age;
	}
}
