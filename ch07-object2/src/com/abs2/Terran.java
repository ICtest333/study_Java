/* �ڽ� Ŭ���� ����
 * 
 * Unit �߻� Ŭ������ ��ӹް�
 * �߻� �޼ҵ� �����ϱ�*/

package com.abs2;

public class Terran extends Unit{
	
	boolean fly;
	
	public Terran(String name, int energy, boolean fly){
		this.name = name;
		this.energy = energy;
		this.fly = fly;
	}
	
	//�߻� �޼ҵ� ����
	@Override
	public void decEnergy(){
		energy -= 2;
	}

}
