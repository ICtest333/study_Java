/* �ڽ� Ŭ���� ����
 * 
 * Unit �߻� Ŭ������ ��ӹް�
 * �߻� �޼ҵ� �����ϱ�*/

package com.abs2;

public class Zerg extends Unit{
	
	boolean fly;
	
	public Zerg(String name, int energy, boolean fly){
		this.name = name;
		this.energy = energy;
		this.fly = fly;
	}
	
	//�߻� �޼ҵ� ����
	@Override
	public void decEnergy(){
		energy -=4;
	}
}
