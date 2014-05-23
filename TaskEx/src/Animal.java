
public class Animal {
	
	private String name;
	private int age;
	private boolean fly;
	
	public Animal(){}
	
	public Animal(String name, int age, boolean fly){
		this.name = name;
		this.age = age;
		this.fly = fly;
		
		getPrint();	
	}
	
	
	
	public void setName(String name){
		this.name = name;		
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public boolean isFly(){
		return fly;
	}
	
	public void setFly(boolean fly){
		this.fly = fly;
	}
	
	public void getPrint()
	{
		System.out.println("�̸�" + "\t:" + this.name);
		System.out.println("����" + "\t:" + this.age);
		System.out.println("���࿩��" + "\t:" + (isFly() ? "����": "���̴�"));
		
		/*if(this.fly != false){
			System.out.println("���࿩��" + "\t:" + "����");			
		}
		else{
			System.out.println("���࿩��" + "\t:" + "���̴�");
		}*/
	}	

}
